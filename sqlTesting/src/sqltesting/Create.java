/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltesting;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author tancincoja_sd2082
 */
public class Create {

    //        LocalTime before = java.time.LocalTime.now();
    //        int started = before.getSecond();
    //        System.out.println("Time started at: "+before.getHour()+":"+before.getMinute()+":"+before.getSecond());
    //        LocalTime after = java.time.LocalTime.now(); 
    //        System.out.println(java.time.LocalTime.now());
    //        System.out.println("Duration Time is: "+(after.getSecond()-before.getSecond()));
    public void create1000() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        for (int i = 1; i < 1001; i++) {
            try {
                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
                stmt = (Statement) con.createStatement();
                String sql = "INSERT INTO `test`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
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

    public void create200() {
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        try {
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
            stmt = (Statement) con.createStatement();
            for (int i = 1; i < 201; i++) {
                String sql = "INSERT INTO `test`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
                stmt.executeUpdate(sql);
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to database!");
        }
        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + ter);
        System.out.println("Duration: " + duration.getSeconds());

    }

    public void createwoc1000() throws ClassNotFoundException, SQLException {
        Statement stmt = null;
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
        stmt = (Statement) con.createStatement();
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        try {
            for (int i = 1; i < 1001; i++) {
                String sql = "INSERT INTO `test`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
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

    public void createwoc200() throws ClassNotFoundException, SQLException {
        Statement stmt = null;
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
        stmt = (Statement) con.createStatement();
        Instant fore = Instant.now();
        System.out.println("Time started: " + fore);
        System.out.println("");
        try {
            for (int i = 1; i < 201; i++) {
                String sql = "INSERT INTO `test`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + i + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
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
