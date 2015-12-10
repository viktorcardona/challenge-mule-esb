package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mongodb.MongoDBQuery;

/**
 * Created by viccardo on 8/12/15.
 */

@RestController
public class DocumentController {

    @RequestMapping("/document")
    public String greeting(@RequestParam(value="fileName", defaultValue="log4j2.xml") String fileName) {

        final String collectionName = "myCollectionTest";

        MongoDBQuery mongoQuery = new MongoDBQuery();

        String jsonDoc = mongoQuery.getDocumentByFileName(collectionName,fileName);

        if(jsonDoc!=null && !jsonDoc.isEmpty()){
            return jsonDoc;
        }

        return "{Document does not exist}";
    }

}
