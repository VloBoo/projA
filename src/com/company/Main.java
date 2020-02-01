package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/glazz?serverTimezone=Europe/Minsk&useSSL=false";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("rjhjxt gjrf");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }

        System.out.println("U dont see1 there");
    }
}

