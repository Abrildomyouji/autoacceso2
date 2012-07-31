/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 666-MAGH-666
 */
public class DAOFactory {
    private static String cadenaConexion="jdbc:mysql://localhost/";
    private static String basedeDatos="lat";
    private static String usuario="root";
    private static String password="";
    
    public static Connection getConexion(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try{
                conexion=DriverManager.getConnection(cadenaConexion+basedeDatos,usuario,password);
            }catch(SQLException ex){
                ex.printStackTrace();
            }      
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return conexion;
    }
    public static Connection closeConexion(Connection conexion){
        try{
            if(conexion!=null){
                conexion.close();
                conexion=null;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return conexion;
    }
    public static void main(String[] args){
        Connection con=null;
        DAOFactory daofactory=new DAOFactory();
        con=daofactory.getConexion();
        if(con!=null)
            System.out.println("Conexion Exitosa");
        else
            System.out.println("Conexion Fallida");
        con=daofactory.closeConexion(con);
        if(con==null){
            System.out.println("Conexion cerrada");
        }
        else
            System.out.println("Conexion abierta");;
    }
}
