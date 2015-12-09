package mongodb;

/**
 * Created by viccardo on 8/12/15.
 */

import java.util.Arrays;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public class MongoDBConnection {

    public MongoClient getConnection(){

        final String server = "localhost";
        final int port = 27017;

        final String userName = "reports";
        final String  database = "test";
        final String  password = "12345";

        MongoCredential credential = MongoCredential.createCredential(userName, database, password.toCharArray());

        MongoClient mongoClient = new MongoClient(new ServerAddress(server , port), Arrays.asList(credential));

        return mongoClient;
    }
}