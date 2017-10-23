/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYSQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VOSTRO
 */
public class MySql {
    public static String server = "jdbc:mysql://127.0.0.1:3306/";
    public static String db = "javaclass";
    public static String user= "root";
    public static String pwd = "";
    public static Connection conn = null;
    public static ResultSet resultSet=null;
    
    public static void connect(){
        try {
            conn = DriverManager.getConnection(server+db, user, pwd);
        } catch (SQLException ex) {
            System.out.println("Error conectando");
        }
    }
    public static void close(){
        try {
            conn.close();
        } catch (SQLException ex) {
             System.out.println("Error cerrando");
        }
    }
    public static boolean execute(String sql){
        
        boolean respuesta;
        connect();
        try {
            Statement statement = conn.createStatement();
            statement.execute(sql);
            respuesta = true;
        } catch (SQLException ex) {
            System.out.println("error procesando el comando"+
                    ex.getMessage()+ex.getCause());
            System.out.println(sql);
            respuesta = false;
        }
        close();
        return respuesta;
    }
    public static void executeRead(String sql){
        connect();
        try {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("error procesando el comando");
            System.out.println(sql);
        }
        //close();
    }
}
