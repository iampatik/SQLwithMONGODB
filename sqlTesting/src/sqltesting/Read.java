/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;

/**
 *
 * @author tancincoja_sd2082
 */
public class Read {

    public void read() {
        System.out.println(java.time.LocalTime.now());

        LocalTime before = java.time.LocalTime.now();

        System.out.println("");
        System.out.println("");

        for (int i = 1; i < 1001; i++) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sqltesting", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM `test` WHERE id="+i);
                
                if(rs.next()){
                    System.out.println(rs.getInt("id") + " " + rs.getInt("col1") + " " + rs.getInt("col2") + " " + rs.getInt("col3") + " " + rs.getInt("col4") + " " + rs.getInt("col5"));

                
                }

                con.close();
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error!");

            }

        }
        System.out.println(java.time.LocalTime.now());
        LocalTime after = java.time.LocalTime.now();

        System.out.println("Duration Time is: " + (after.getSecond() - before.getSecond()));

    }

}
