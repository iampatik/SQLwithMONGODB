package mongodDBtesting;

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

//    public void retrieveAvg1000() {
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = new Date();
//        Instant fore = Instant.now();
//        System.out.println("Time started: " + formatter.format(date));
//        try {
//            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
//            mongoLogger.setLevel(Level.SEVERE);
//            MongoClient mongoClient = new MongoClient("localhost", 27017);
//            DB db = mongoClient.getDB("test");
//            System.out.println("Connected to database!");
//            DBCollection collection = db.getCollection("sqltesting");
//            Cursor cursor = collection.find();
//            while (cursor.hasNext()) {
//                System.out.println(cursor.next());
//            }
//        } catch (SecurityException e) {
//            System.out.println("Error connecting to database!");
//        }
//        Instant ter = Instant.now();
//        Date date1 = new Date();
//        Duration duration = Duration.between(fore, ter);
//        System.out.println("Time ended: " + formatter.format(date1)+"\n"+"Duration: " + duration.getSeconds() + " second/s");
//    }
    public void retrieveAvg1000() {
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
            MongoCollection<Document> dbCollection = (MongoCollection<Document>) db.getCollection("sqltesting");
            AggregateIterable<org.bson.Document> aggregate = dbCollection.aggregate(Arrays.asList(Aggregates.group("_id", new BsonField("Average", new BsonDocument("$avg", new BsonString("$col1"))))));
            Document result = aggregate.first();
            double age = result.getDouble("Average");
//            DBCollection collection = db.getCollection("sqltesting");
//            for (int i = 1; i < 6; i++) {
//                db.collection.aggregate(["{$group: {_id:null, Average of column "+i": {$avg:$col"+i"} } }"]);
//                collection.aggregate(
//                        (List<? extends DBObject>) Document.parse("{ $group: { _id: null, col" + 1 + ": { $avg: '$col'" + 1 + " } } }"));
//            }
            System.out.println(age);

        } catch (SecurityException e) {
            System.out.println(e);
        }

    }

}
