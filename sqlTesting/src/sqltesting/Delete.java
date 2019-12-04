/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltesting;

import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author tancincoja_sd2082
 */
public class Delete {

    public void delete1000() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        for (int i = 1; i < 1001; i++) {
            try {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
                stmt = (Statement) con.createStatement();
                String sql = "DELETE FROM `test` WHERE id=" + i;
                stmt.executeUpdate(sql);
                con.close();
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error!");
            }
        }
        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());
    }

    public void delete200() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        try {
            for (int i = 1; i < 201; i++) {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
                stmt = (Statement) con.createStatement();
                String sql = "DELETE FROM `test` WHERE id=" + i;
                stmt.executeUpdate(sql);
                con.close();
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to database!");
        }
        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());
    }
    
    
    public void deletewoc1000() throws ClassNotFoundException, SQLException{
        Statement stmt = null;
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
        stmt = (Statement) con.createStatement();
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        try {
            for (int i = 1; i < 1001; i++) {
                String sql = "DELETE FROM `test` WHERE id=" + i;
                stmt.executeUpdate(sql);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error!");
        }
        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());
    }
    
    public void deletewoc200() throws ClassNotFoundException, SQLException{
        Statement stmt = null;
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
        stmt = (Statement) con.createStatement();
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        try {
            for (int i = 1; i < 201; i++) {
                String sql = "DELETE FROM `test` WHERE id=" + i;
                stmt.executeUpdate(sql);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to database!");
        }
        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());
    
    
    
    }

}
