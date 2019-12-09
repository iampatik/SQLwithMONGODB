package mongodDBtesting;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Create {

    public void create() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	System.out.println("Time started: "+formatter.format(date));
        Instant fore = Instant.now();
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("test");
            DBCollection collection = db.getCollection("sqltesting");
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
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: " + formatter.format(date));
        System.out.println("Duration: " + duration.getSeconds()+ " second/s");
    }

    public void delete() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	System.out.println("Time started: "+formatter.format(date));
        Instant fore = Instant.now();
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to database!");
            DBCollection collection = db.getCollection("sqltesting");

            for (int i = 1; i < 1001; i++) {
                BasicDBObject remove1000 = new BasicDBObject("col1", i);
                collection.remove(remove1000);
                System.out.println("Suuccessfully deleted!");
            }
        } catch (SecurityException e) {
            System.out.println("Error connecting to database!");
        }
        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: "+formatter.format(date));
        System.out.println("Duration: " + duration.getSeconds()+" second/s");
    }

    public void get() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	System.out.println("Time started: "+formatter.format(date));
        Instant fore = Instant.now();
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to database!");
            DBCollection collection = db.getCollection("sqltesting");
            Cursor cursor = collection.find();
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }
        } catch (SecurityException e) {
            System.out.println("Error connecting to database!");
        }
        Instant ter = Instant.now();
        Duration duration = Duration.between(fore, ter);
        System.out.println("Time ended: "+formatter.format(date));
        System.out.println("Duration: " + duration.getSeconds()+" second/s");

    }

}
