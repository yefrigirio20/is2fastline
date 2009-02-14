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
}
