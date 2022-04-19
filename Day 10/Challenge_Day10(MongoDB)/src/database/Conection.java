package database;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Conection {
    private String dbName;
    private  MongoClient mongoClient;
    private List<Document> database;

    public Conection(String db){
        mongoClient = MongoClients.create();
        database = mongoClient.listDatabases().into(new ArrayList<Document>());
        dbName = db;
    }

    public  MongoDatabase getDb() {
        return mongoClient.getDatabase(dbName);
    }
}
