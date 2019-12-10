/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltesting;

import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author tancincoja_sd2082
 */
public class Retrieve {

    public void retrieveAvg1000() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");

        try {
            for (int start = 1; start < 6; start++) {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
                stmt = (Statement) con.createStatement();
                String query = "SELECT AVG(col" + start + ") FROM test";
                ResultSet aveTemp = stmt.executeQuery(query);
                if (aveTemp.next()) {
                    System.out.println("Average of col" + start + " is: " + aveTemp.getFloat(1));
                }
                con.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error!");
        }

        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());
    }

    public void retrieveAvg200() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");

        try {
            for (int start = 1; start < 6; start++) {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
                stmt = (Statement) con.createStatement();
                String query = "SELECT AVG(col" + start + ") FROM test";
                ResultSet aveTemp = stmt.executeQuery(query);
                if (aveTemp.next()) {
                    System.out.println("Average of col" + start + " is: " + aveTemp.getFloat(1));
                }  
                con.close();
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error!");
        }

        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());

    }

    public void retrievewo1000() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");

        try {
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
            stmt = (Statement) con.createStatement();
            for (int start = 1; start < 6; start++) {
                String query = "SELECT AVG(col" + start + ") FROM test";
                ResultSet aveTemp = stmt.executeQuery(query);
                if (aveTemp.next()) {
                    System.out.println("Average of col" + start + " is: " + aveTemp.getFloat(1));
                }
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            System.out.println("Error!");
        }

        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());

    }

    public void retrievewo200() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");

        try {
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
            stmt = (Statement) con.createStatement();
            for (int start = 1; start < 6; start++) {
                String query = "SELECT AVG(col" + start + ") FROM test";
                ResultSet aveTemp = stmt.executeQuery(query);
                if (aveTemp.next()) {
                    System.out.println("Average of col" + start + " is: " + aveTemp.getFloat(1));
                }
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error!");
        }

        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());

    }

}
