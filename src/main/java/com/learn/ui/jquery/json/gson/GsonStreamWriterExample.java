package com.learn.ui.jquery.json.gson;

import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;

public class GsonStreamWriterExample {
    public static void main(String[] args) {

        JsonWriter writer;
        try {
            writer = new JsonWriter(new FileWriter("d:\\user.json"));

            writer.beginObject(); // {
            writer.name("name").value("mkyong"); // "name" : "mkyong"
            writer.name("age").value(29); // "age" : 29

            writer.name("messages"); // "messages" :
            writer.beginArray(); // [
            writer.value("msg 1"); // "msg 1"
            writer.value("msg 2"); // "msg 2"
            writer.value("msg 3"); // "msg 3"
            writer.endArray(); // ]

            writer.endObject(); // }
            writer.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}