/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mongodDBtesting;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tancincoja_sd2082
 */
public class Create {
    
    
    public void create1000() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Instant fore = Instant.now();
        System.out.println("Time started: " + formatter.format(date));
        try {

            for (int i = 1; i < 1001; i++) {
                Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
                mongoLogger.setLevel(Level.SEVERE);
                MongoClient mongoClient = new MongoClient("localhost", 27017);
                DB db = mongoClient.getDB("test");
                DBCollection collection = db.getCollection("sqltesting");
                BasicDBObject add1000 = new BasicDBObject("col1", i)
                        .append("col2", i + 1)
                        .append("col3", i + 2)
                        .append("col4", i + 3)
                        .append("col5", i + 4);
                collection.insert(add1000);
                System.out.println("Inserted!");
            }
        } catch (SecurityException e) {
            System.out.println("Error is: " + e);
        }
        Instant ter = Instant.now();
        Date date1 = new Date();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + formatter.format(date1)+"\n"+"Duration: " + duration.getSeconds() + " second/s");
    }

    public void create200() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Instant fore = Instant.now();
        System.out.println("Time started: " + formatter.format(date));
        try {

            for (int i = 1; i < 201; i++) {
                Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
                mongoLogger.setLevel(Level.SEVERE);
                MongoClient mongoClient = new MongoClient("localhost", 27017);
                DB db = mongoClient.getDB("test");
                DBCollection collection = db.getCollection("sqltesting");
                BasicDBObject add1000 = new BasicDBObject("col1", i)
                        .append("col2", i + 1)
                        .append("col3", i + 2)
                        .append("col4", i + 3)
                        .append("col5", i + 4);
                collection.insert(add1000);
                System.out.println("Inserted!");
            }
        } catch (SecurityException e) {
            System.out.println("Error is: " + e);
        }
        Instant ter = Instant.now();
        Date date1 = new Date();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + formatter.format(date1)+"\n"+"Duration: " + duration.getSeconds() + " second/s");
    }

    public void createwo1000() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Instant fore = Instant.now();
        System.out.println("Time started: " + formatter.format(date));
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("test");
        DBCollection collection = db.getCollection("sqltesting");
        try {
            for (int i = 1; i < 1001; i++) {

                BasicDBObject add1000 = new BasicDBObject("col1", i)
                        .append("col2", i + 1)
                        .append("col3", i + 2)
                        .append("col4", i + 3)
                        .append("col5", i + 4);
                collection.insert(add1000);
                System.out.println("Inserted!");
            }
        } catch (SecurityException e) {
            System.out.println("Error is: " + e);
        }
        Instant ter = Instant.now();
        Date date1 = new Date();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + formatter.format(date1)+"\n"+"Duration: " + duration.getSeconds() + " second/s");

    }

    public void createwo200() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Instant fore = Instant.now();
        System.out.println("Time started: " + formatter.format(date));
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("test");
        DBCollection collection = db.getCollection("sqltesting");
        try {
            for (int i = 1; i < 201; i++) {

                BasicDBObject add1000 = new BasicDBObject("col1", i)
                        .append("col2", i + 1)
                        .append("col3", i + 2)
                        .append("col4", i + 3)
                        .append("col5", i + 4);
                collection.insert(add1000);
                System.out.println("Inserted!");
            }
        } catch (SecurityException e) {
            System.out.println("Error is: " + e);
        }
        Instant ter = Instant.now();
        Date date1 = new Date();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + formatter.format(date1)+"\n"+"Duration: " + duration.getSeconds() + " second/s");

    }
    
}
