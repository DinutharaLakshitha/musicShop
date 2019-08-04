package com.musicShop;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;

    public Repository(){
        mongoClient = new MongoClient();
        mongoClient.getDatabase("musicWarehouse");
        collection = database.getCollection("musicItems");
    }

    public void addItem(){

    }

}
