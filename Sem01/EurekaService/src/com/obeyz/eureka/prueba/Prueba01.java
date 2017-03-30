package com.obeyz.eureka.prueba;

import com.obeyz.eureka.db.AccesoDB;
import java.sql.Connection;

public class Prueba01 {
    public static void main(String[] args) {
        try {
            Connection con = AccesoDB.getConnection();
            System.out.println("Ok");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}