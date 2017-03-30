package com.obeyz.eureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

    public AccesoDB() {
    }
    
    public static Connection getConnection() throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://localhost:3306/eurekabank?zeroDateTimeBehavior=convertToNull";
        String user = "eureka";
        String password = "admin";
        
        Connection con = null;
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(urlDB, user, password);   
        } catch (ClassNotFoundException e){
            throw new SQLException("No se encontro el driver");
        } catch (SQLException e){
            throw e;
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }       
        
        return con;
    }
    
}
