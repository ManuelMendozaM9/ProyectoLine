/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Manuel
 */
public class Conexion {
    protected Connection conexion;
    //JDBC Driver y base de datos URL
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/eventos?useSSL=false";
    
    //Credenciales de la base de datos
    private final String USER = "root";
    private final String PASS = "";
    
    public static Statement sentencia;
    
    public void conectar() throws Exception {
        try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        }catch(Exception e){
                throw e;
        }
    }
    
    public void cerrar() throws SQLException{
        if(conexion!= null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
