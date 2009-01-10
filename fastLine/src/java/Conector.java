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
    private Connection Conexion;
    private Statement statement;
    public ResultSet Result;
    public String Estado;
    public int Est;
    
    /** Creates a new instance of Conector */
    public Conector(String host,String Puerto,String Base,String Usuario,String PassWord) {        
        URL="jdbc:postgresql://"+host+":"+Puerto+"/"+Base;
        IniciarConexion(URL,Usuario,PassWord);
    }
    
    private void IniciarConexion(String RutaConex,String Usuario,String PassWord){
        try{
            Class.forName("org.postgresql.Driver");
            Conexion = DriverManager.getConnection(RutaConex,Usuario,PassWord);
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
