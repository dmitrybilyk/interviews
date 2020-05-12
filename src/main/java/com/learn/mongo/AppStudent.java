package com.learn.mongo;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.ArrayList;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 * Java + MongoDB Hello world Example
 * 
 */
public class AppStudent {
	public static void main(String[] args) {

//		try {

//		ConnectionString connectionString = new ConnectionString(System.getProperty("mongodb://127.0.0.1:27017"));
		CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());

		CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
			pojoCodecRegistry);


		MongoClientSettings clientSettings = MongoClientSettings.builder()
//			.applyConnectionString(connectionString)
			.codecRegistry(codecRegistry)
			.build();

		try (MongoClient mongoClient = MongoClients.create(clientSettings)) {
			MongoDatabase db = mongoClient.getDatabase("testdb");
			MongoCollection<Student> students = db.getCollection("students", Student.class);
			Student tDocument = new Student();
			tDocument.setAge(33);
			tDocument.setName("Dimon");
			ArrayList<Book> books = new ArrayList<>();
			Book b = new Book();
			b.setName("Some book");
			books.add(b);
			tDocument.setBooks(books);
			students.insertOne(tDocument);
		}


//
//			/**** Insert ****/
//			// create a document to store key and value
//			BasicDBObject document = new BasicDBObject();
//			document.put("name", "Dima");
//			document.put("age", 38);
//			document.put("createdDate", new Date());
//			table.insert(document);
//
//			/**** Find and display ****/
//			BasicDBObject searchQuery = new BasicDBObject();
//			searchQuery.put("name", "Dima");
//
//			DBCursor cursor = table.find(searchQuery);

//			while (cursor.hasNext()) {
//				System.out.println(cursor.next());
//			}

//			/**** Update ****/
//			// search document where name="mkyong" and update it with new values
//			BasicDBObject query = new BasicDBObject();
//			query.put("name", "mkyong");
//
//			BasicDBObject newDocument = new BasicDBObject();
//			newDocument.put("name", "mkyong-updated");
//
//			BasicDBObject updateObj = new BasicDBObject();
//			updateObj.put("$set", newDocument);
//
//			table.update(query, updateObj);
//
//			/**** Find and display ****/
//			BasicDBObject searchQuery2
//				= new BasicDBObject().append("name", "mkyong-updated");
//
//			DBCursor cursor2 = table.find(searchQuery2);
//
//			while (cursor2.hasNext()) {
//				System.out.println(cursor2.next());
//			}

			/**** Done ****/
			System.out.println("Done");

//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (MongoException e) {
//			e.printStackTrace();
//		}

	}
}
