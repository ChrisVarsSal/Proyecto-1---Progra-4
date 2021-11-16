package com.progra.proyecto.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conection {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root", "root");
            return con;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
