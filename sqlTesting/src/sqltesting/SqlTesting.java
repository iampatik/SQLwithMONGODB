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
public class SqlTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Read red = new Read();
//        red.read();
        
//        Create create = new Create();
//        Delete del = new Delete();
        Retrieve ret = new Retrieve();
//        create.create1000();
//        create.create200();
//        create.createwoc1000();
//        create.createwoc200();
        
//        del.delete1000();
//        del.delete200();
//        del.deletewoc1000();
//        del.deletewoc200();
        
//        ret.retrieveAvg1000();
//        ret.retrieveAvg200();
//        ret.retrievewo1000();
        ret.retrievewo200();
        
        
        
        
        
        
        
    }

}
