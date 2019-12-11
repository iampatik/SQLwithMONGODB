package mongodDBtesting;

import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.BsonField;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.BsonDocument;
import org.bson.BsonString;
import org.bson.Document;

public class Retrieve {

    public void retrieveAvg() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Instant fore = Instant.now();
        System.out.println("Time started: " + formatter.format(date));
        try {
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to database!");
            for (int i = 1; i < 6; i++) {
                DBObject groupFields = new BasicDBObject("_id", null);
                groupFields.put("Average", new BasicDBObject("$avg", "$col" + i));
                DBObject group = new BasicDBObject("$group", groupFields);
                AggregationOutput output = db.getCollection("sqltesting").aggregate(group);
                Iterable<DBObject> list = output.results();
                System.out.println(list);
            }
            Instant ter = Instant.now();
            Date date1 = new Date();
            Duration duration = Duration.between(fore, ter);
            System.out.println("Time ended: " + formatter.format(date1) + "\n" + "Duration: " + duration.getSeconds() + " second/s");

        } catch (SecurityException e) {
            System.out.println(e);
        }

    }


    public void retrieveAvgWC() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Instant fore = Instant.now();
        System.out.println("Time started: " + formatter.format(date));
        try {
            int start = 1;
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to database!");
            DBObject groupFields = new BasicDBObject("_id", null);
            groupFields.put("Average", new BasicDBObject("$avg", "$col" + start));
            DBObject group = new BasicDBObject("$group", groupFields);
            AggregationOutput output = db.getCollection("sqltesting").aggregate(group);
            Iterable<DBObject> list = output.results();
            for (int i = 1; i < 6; i++) {
                System.out.println(list);
            }
            Instant ter = Instant.now();
            Date date1 = new Date();
            Duration duration = Duration.between(fore, ter);
            System.out.println("Time ended: " + formatter.format(date1) + "\n" + "Duration: " + duration.getSeconds() + " second/s");

        } catch (SecurityException e) {
            System.out.println(e);
        }
    }


}
