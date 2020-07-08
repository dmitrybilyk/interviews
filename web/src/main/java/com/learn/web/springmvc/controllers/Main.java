package com.learn.web.springmvc.controllers;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
        public static void main(String[] args) throws IOException {
//                final URL url = new URL("http://localhost:8080/web/users.web");
                final URL url = new URL("http://localhost:8080/web/usersobjects.web");
                final String query = null;
                URL serverAddress = null;
                InputStream inputStream = null;
                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);
                try {
                        inputStream = connection.getInputStream();
                        InputStreamReader in = new InputStreamReader(inputStream, "UTF-8");
                        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
                        org.json.simple.JSONArray array = (org.json.simple.JSONArray) parser.parse(in);
//                        List<JSONObject> jsonObjects = new ArrayList<>();
                        List<User> users = new ArrayList<>();
                        Iterator<JSONObject> iterator = array.iterator();
                        while(iterator.hasNext()) {
                                JSONObject next = iterator.next();
                                User user = new User();
                                user.setId((String) next.get("id"));
                                user.setName((String) next.get("name"));
                                users.add(user);
                        }
                        for (User user : users) {
                                System.out.println(user);
                        }
//                        for (Object obj : array) {
//                                names.add(((User) obj));
//                        }
                } catch (Exception e) {
                        throw new RuntimeException(e);
                } finally {
                        // close the connection
                        if (connection != null && connection instanceof HttpURLConnection) {
                                ((HttpURLConnection) connection).disconnect();
                        }
                        try {
                                if (inputStream != null) {
                                        inputStream.close();
                                }
                        } catch (IOException e) {
                        }
                }
        }
}
