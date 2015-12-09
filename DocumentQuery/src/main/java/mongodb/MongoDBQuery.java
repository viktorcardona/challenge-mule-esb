package mongodb;

/**
 * Created by viccardo on 8/12/15.
 */
import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBQuery {

    public String getDocumentByFileName(final String collectionName, final String fileName){

        MongoClient mongoClient = null;

        try {
            mongoClient = (new MongoDBConnection()).getConnection();

            final String dataBaseName = "test";

            MongoDatabase databaseConn = mongoClient.getDatabase(dataBaseName);

            MongoCollection<Document> collection = databaseConn.getCollection(collectionName);

            FindIterable<Document> iterable = collection.find(new Document("name", fileName));

            String docJson = null;

            Iterator<Document> it = iterable.iterator();

            while (it.hasNext()) {

                Document document = it.next();

                docJson = document.toJson();
            }

            return docJson;

        }finally {
            if(mongoClient!=null){
                mongoClient.close();
            }
        }
    }

}
