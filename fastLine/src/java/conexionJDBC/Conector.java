package conexionJDBC;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Huachani
 */
import java.sql.*;

import org.postgresql.util.PSQLException;

/**
 *
 * @author HUACHANI
 */
public class Conector {
    private String URL;
    private String host;
    private String Puerto;
    private String Base;
    private String Usuario;
    private String PassWord;
    private Connection Conexion;
    private Statement statement;
    public ResultSet Result;
    public String Estado;
    public int Est;
    
    /** Creates a new instance of Conector */
    public Conector(){
        host="localhost";
        Puerto="5432";
        Base="FastLine";
        Usuario="postgres";
        PassWord="postgres";
        URL="jdbc:postgresql://"+host+":"+Puerto+"/"+Base;        
    }

    public Conector(String user,String pass){
        host="localhost";
        Puerto="5432";
        Base="FastLine";
        Usuario=user;
        PassWord=pass;
        URL="jdbc:postgresql://"+host+":"+Puerto+"/"+Base;
    }
    
    public void IniciarConexion(){

        try{
            Class.forName("org.postgresql.Driver");
            Conexion = DriverManager.getConnection(URL,Usuario,PassWord);
            statement=Conexion.createStatement();
            Estado="Conexion Exitosa";
        }
        catch(PSQLException e){
            Estado="Error al ingresar al sistema";
        }
        catch(SQLException e){
            Estado="No se pudo Acceder a la Base de Datos";
        }
        catch (ClassNotFoundException e){
            Estado="No se pudo establecer conexion con la Base de Datos";
        }
        
    }
   public void CerrarConexion()/*throws PSQLException, SQLException*/{
       try{
            if(Result!=null)
                Result.close();
            if(statement!=null)
                statement.close();
            if(Conexion!=null)
                Conexion.close();
            Estado="Conexion cerrada exitosamente";
       }
       catch(Exception e){
            Estado="Error al Cerrar conexiom";       }
    }   
    public String getEstado(){
        return Estado;
    }    
    public void ObtenerData(String Tabla){
        try{            
            //Result=statement.getResultSet();
            Result=statement.executeQuery("SELECT * FROM "+Tabla);            
        }
        catch(Exception e){
            Result=null;
            Estado="No se pudo obtener Data";
        }
    }

    public boolean esUsuario(String usuario,String password){        
        consultar("select pass from usuarios where idnomusu='"+usuario+"'");
        boolean esUsuario=false;
        try{
            getResultSet().next();
            if(password.compareTo(getResultSet().getString("pass"))==0)
                esUsuario=true;
        }
        catch (Exception e) {
            Estado="No se pudo hacer la consulta";
        }
        return esUsuario;
    }

    public boolean esAdministrador(String usuario){
        consultar("select idtipousu from usuarios where idnomusu='"+usuario+"'");
        boolean esAdm=false;
        try{
            getResultSet().next();
            if(getResultSet().getInt("idtipousu")==1||getResultSet().getInt("idtipousu")==2)
                esAdm=true;
        }
        catch (Exception e) {
            Estado="No se pudo hacer la consulta";
        }
        return esAdm;
    }

    public boolean existeUsuario(String usu){
        boolean existe=false;
        consultar("select count(nomusu) from usuarios where idnomusu='"+usu+"'");
        try{
            getResultSet().next();
            if(getResultSet().getInt("count")>0)
            //if(password.compareTo(getResultSet().getString("pass"))==0)
                existe=true;
        }
        catch (Exception e) {
            Estado="No se pudo hacer la consulta";
        }
        return existe;
    }

    public boolean existeDNI(String dni){
        boolean existe=false;
        consultar("select count(dniusu) from usuarios where dniusu='"+dni+"'");
        try{
            getResultSet().next();
            if(getResultSet().getInt("count")>0)
            //if(password.compareTo(getResultSet().getString("pass"))==0)
                existe=true;
        }
        catch (Exception e) {
            Estado="No se pudo hacer la consulta";
        }
        return existe;
    }

    public void insertarNuevoUsuario(String idNomUsu,int tipUsu,String passUsu,String apelPatUsu,String apelMatUsu,String nombresUsu,String fecNac,String dniUsu,String emailUsu){
        String insert="insert into usuarios values('"+idNomUsu+"',"+tipUsu+",'"+passUsu+"','"+apelPatUsu+"','"+apelMatUsu+"','"+nombresUsu+"','"+fecNac+"',"+dniUsu+",'"+emailUsu+"') ";
        try{
            //statement=Conexion.prepareStatement(insert);
            statement.executeUpdate(insert);
            statement.executeUpdate("create user "+idNomUsu+" in GROUP users;alter user "+idNomUsu+" with PASSWORD '"+passUsu+"';");
        }
        catch (Exception e) {
            Estado="No se pudo insertar el dato";
        }

    }

    public void consultar(String Consulta){
        try{
            Result=statement.executeQuery(Consulta);
        }
        catch(Exception e){
        }
    }
    public ResultSet getResultSet(){
        return Result;
    }
    public int obtenerHorarios(int origen,int destino,String fecha){
        consultar("select idrut from rutas where idini="+origen+" and idfin="+destino);
        int numSalidas=0;
        try{
            Result.next();

            int idruta=getResultSet().getInt("idrut");
           //System.out.println("blablabla "+idruta+" fecha "+fecha);
           //System.out.println("\nselect count(idsal) from salidas where idrutsal="+idruta+" and fechsal='"+fecha+"'\n");
            consultar("select count(idsal) from salidas where idrutsal="+idruta+" and fechsal='"+fecha+"'");
            Result.next();
            numSalidas=getResultSet().getInt("count");
            System.out.println("blablabla "+numSalidas);
            consultar("select idsal,horasal from salidas where idrutsal="+idruta+" and fechsal='"+fecha+"' order by horasal");
            return numSalidas;
        }
        catch(Exception e){
            numSalidas=-1;
        }
        return numSalidas;
    }

    public int obtenerHorarios(int idruta,String fecha){

        int numSalidas=0;
        try{
            Result.next();
           //System.out.println("blablabla "+idruta+" fecha "+fecha);
           //System.out.println("\nselect count(idsal) from salidas where idrutsal="+idruta+" and fechsal='"+fecha+"'\n");
            consultar("select count(idsal) from salidas where idrutsal="+idruta+" and fechsal='"+fecha+"'");
            Result.next();
            numSalidas=getResultSet().getInt("count");
            System.out.println("blablabla "+numSalidas);
            consultar("select idsal,horasal from salidas where idrutsal="+idruta+" and fechsal='"+fecha+"' order by horasal");
            return numSalidas;
        }
        catch(Exception e){
            numSalidas=-1;
        }
        return numSalidas;
    }

    public String obtenerPrecioBoleto(String idSal){
        String precio;
        consultar("select precbol from salidas where idsal='"+idSal+"'");
        try{
            getResultSet().next();
            precio=getResultSet().getString("precbol");
        }
        catch(Exception e){
            precio="";
        }
        return precio;
    }
    public boolean existeRuta(int origen, int destino){
        boolean existe=false;
        consultar("select count(idrut) from rutas where idini="+origen+" and idfin="+destino);
         try{
            getResultSet().next();
            if(getResultSet().getInt("count")>0)
                existe=true;
        }
        catch(Exception e){
            Estado="Error en existeRuta";
        }
        return existe;
    }
    public void insertarNuevaRuta(int origen, int destino){
        String insert="insert into rutas(idini,idfin) values("+origen+","+destino+")";
        try{
            System.out.println(insert);
            statement.executeUpdate(insert);
        }
        catch (Exception e) {
            System.out.println("error al insertar nueva ruta");
            Estado="No se pudo insertar la ruta";
        }
    }
    public int obtenerRutas(){
        int numRutas=0;
        consultar("select count(idrut) from rutas");
        try{
            getResultSet().next();
            numRutas=getResultSet().getInt("count");
            consultar("select r.idrut,d1.name as origen,d2.name as destino from rutas r,departamentos d1, departamentos d2 where d1.gid=r.idini and d2.gid=r.idfin");
        }
        catch(Exception e){
            Estado="Error en obtenerRutas";
            numRutas=-1;
        }

        return numRutas;
    }

    public int obtenerBuses(){
        int numbuses=0;
        consultar("select count(matbus) from buses");
        try{
            getResultSet().next();
            numbuses=getResultSet().getInt("count");
            consultar("select * from buses");
        }
        catch(Exception e){
            Estado="Error en obtenerBuses";
            numbuses=-1;
        }

        return numbuses;
    }

    public int obtenerReservaciones(String idNumUsu){
        int numReservaciones=0;
        consultar("select count(nropas) from reservapasajes where idnomusu='"+idNumUsu+"'");
        try{
            getResultSet().next();
            numReservaciones=getResultSet().getInt("count");
            consultar("select u.apelpatusu,u.apelmatusu,u.nomusu,a.idsal,d1.name as origen,d2.name as destino,s.fechsal,s.horasal,s.precbol,a.nroasibus,rp.nropas,a.idasi " +
                    "from usuarios u,reservapasajes rp,asientos a,salidas s,rutas r,departamentos d1,departamentos d2 " +
                    "where rp.idnomusu='"+idNumUsu+"' and rp.idnomusu=u.idnomusu and rp.idasi=a.idasi and " +
                    "a.idsal=s.idsal and r.idrut=s.idrutsal and d1.gid=r.idini and d2.gid=r.idfin");
           
        }
        catch(Exception e){
            Estado="Error en obtenerReservaciones";
            numReservaciones=-1;
        }

        return numReservaciones;
    }

    public int obtenerChoferes(){
        int numChof=0;
        consultar("select count(idchof) from choferes");
        try{
            getResultSet().next();
            numChof=getResultSet().getInt("count");
            consultar("select * from choferes order by apelpatchof,apelmatchof,nomchof");
        }
        catch(Exception e){
            Estado="Error en obtenerChoferes";
            numChof=-1;
        }

        return numChof;
    }

    public void eliminarRuta(int idruta){
        String delete="delete from rutas where idrut="+idruta;
        try{            
            statement.executeUpdate(delete);
        }
        catch (Exception e) {
            Estado="No se pudo insertar la ruta";
        }
    }
    
    public void insertarNuevaSalida(String idRuta,String chof1,String chof2,String horaSal,String fecha,String matBus, String precBol){
        String insert="insert into salidas(idrutsal,idchof1,idchof2,horasal,fechsal,matbus,precbol) values("+idRuta+","+chof1+","+chof2+",'"+horaSal+"','"+fecha+"','"+matBus+"',"+precBol+");";
        try{
            statement.executeUpdate(insert);
        }
        catch (Exception e) {
            Estado="No se pudo insertar la salida";
        }
    }

    public void registrarVenta(String nroPas){
        String insert="insert into ventapasajes(idrespas) values("+nroPas+")";
        try{
            statement.executeUpdate(insert);
            consultar("select a.idasi from asientos a,reservapasajes rp where rp.nropas="+nroPas+" and rp.idasi=a.idasi");
            getResultSet().next();
            int idasi=getResultSet().getInt("idasi");
            //System.out.println("idasi:"+idasi);
            statement.executeUpdate("update asientos set estado='p' where idasi="+idasi);
        }
        catch (Exception e) {
            Estado="No se pudo actualizar el estado del asiento";
        }
    }

    /*
    public int [] asientos(){
        int estados[];

        return estados[];
    }
    */
    public void prepararAsientos(){
        System.out.println("----------------------------------");
        consultar("select idsal from salidas order by idsal DESC limit 1");
        
        try {
            String consulta;
            getResultSet().next();
            int idSal=getResultSet().getInt("idsal");
            System.out.println("idSal="+idSal);
            consultar("select b.capbus as cap from buses b,salidas s where s.idsal="+idSal+" and s.matbus=b.matbus");
            getResultSet().next();
            int numAsientos=getResultSet().getInt("cap");
            System.out.println("numAsientos="+numAsientos);
            for(int idAsiento=1;idAsiento<=numAsientos;idAsiento++){
                consulta="insert into asientos(nroasibus,idsal,estado) values("+idAsiento+","+idSal+",'d')";
                System.out.println(consulta);
                statement.executeUpdate(consulta);
            }
        } catch (Exception e) {
            Estado="No se pudo preparar los asientos";
        }

    }
    public void reservarPasaje(String idUsu,int idSal,int numAsi){
        try {
            statement.executeUpdate("update asientos SET estado='r' where idsal="+idSal+" and nroasibus="+numAsi);
            consultar("select idasi from asientos where idsal="+idSal+" and nroasibus="+numAsi);
            getResultSet().next();
            int idasi=getResultSet().getInt("idasi");
            statement.executeUpdate("insert into reservapasajes(idasi,idnomusu) values("+idasi+",'"+idUsu+"')");

        } catch (Exception e) {
            Estado="Error en reservarPasaje";
        }

    }

    public void consultarEncomienda(int idEnc){
        consultar("select d1.name as origen,d2.name as destino , s.fechsal ,e.* from encomiendas e,salidas s,rutas r, departamentos d1,departamentos d2 " +
                "where e.idenc="+idEnc+" and e.idsal=s.idsal and d1.gid=r.idini and d2.gid=r.idfin and r.idrut=s.idrutsal");
    }

    public boolean existeEncomienda(int idEnc){
        boolean existe=false;        
        consultar("select count(idenc) from encomiendas where idenc="+idEnc);
        try{
            getResultSet().next();
            if(getResultSet().getInt("count")>0){               
                existe=true;
            }
        }
        catch (Exception e) {
            Estado="No se pudo hacer la consulta";
        }
        return existe;
    }


    public String insertarNuevaEncomienda(int idSal, String catEnc,double pesoEnc,String envAP,String envAM ,String envN,int envDNI,String recAP,String recAM,String recN,int recDNI,int estado,int tipopago,double monto,double cancelado){
        String insert="insert into encomiendas(idsal,catenc,pesoenc,envapelpat,envapelmat,envnom,envdni,recapelpat,recapelmat,recnom,recdni,estado,tipopago,monto,cancelado) values("+idSal+",'"+catEnc+"',"+pesoEnc+",'"+envAP+"','"+envAM+"','"+envN+"',"+envDNI+",'"+recAP+"','"+recAM+"','"+recN+"',"+recDNI+","+estado+","+tipopago+","+monto+","+cancelado+");";
        try{
            statement.executeUpdate(insert);
            consultar("select idenc from encomiendas order by idenc DESC limit 1");
            getResultSet().next();
            return ""+getResultSet().getInt("idenc");
        }
        catch (Exception e) {
            Estado="No se pudo insertar la encomienda";
            return "Ha ocurrido un error";
        }
        
    }

    public int[] estadoAsientos(int idSal){
        int asientos[];
        try {
            consultar("select b.capbus as cap from buses b,salidas s where s.idsal="+idSal+" and s.matbus=b.matbus");
            getResultSet().next();
            int numAsientos=getResultSet().getInt("cap");
            asientos=new int[numAsientos+1];
            asientos[0]=-1;
            consultar("select * from asientos where idsal="+idSal+" order by nroasibus");
            int a=1;
            while(getResultSet().next()){
                if(getResultSet().getString("estado").compareTo("d")==0)
                    asientos[a]=0;
                if(getResultSet().getString("estado").compareTo("r")==0)
                    asientos[a]=1;
                if(getResultSet().getString("estado").compareTo("o")==0)
                    asientos[a]=1;
                a++;
            }
        }
        catch (Exception e) {
            asientos=new int[1];
            asientos[0]=-1;
        }       
        return asientos;
    }



}
