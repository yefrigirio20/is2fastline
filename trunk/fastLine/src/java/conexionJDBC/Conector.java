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
           System.out.println("blablabla "+idruta+" fecha "+fecha);
           System.out.println("\nselect count(idsal) from salidas where idrutsal="+idruta+" and fechsal='"+fecha+"'\n");
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

}
