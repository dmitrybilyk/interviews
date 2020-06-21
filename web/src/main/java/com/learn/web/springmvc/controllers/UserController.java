package com.learn.web.springmvc.controllers;

import com.learn.web.springmvc.controllers.model.User;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

   Map<Integer, User> userMap = new HashMap<>();

   {
      User user = new User();
      user.setName("First");
      user.setAge(33);
      user.setId(0);
      userMap.put(user.getId(), user);
   }

   @RequestMapping(value = "/users", method = RequestMethod.GET)
   public @ResponseBody List<String> getUsers(){
//      ArrayList<User> users = new ArrayList<>();
//      User user = new User();
//      user.setId(1);
//      user.setAge(33);
//      user.setName("name");
//      users.add(user);
//      return users;
      ArrayList<String> strings = new ArrayList<>();
      strings.add("dfdf");
      return strings;
   }

   @GET
   @Path("/usersstring")
//   @RequestMapping(value = "/usersstring", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
   public Response getUsersString(){
      JSONArray jsonArray = new JSONArray();
      jsonArray.add("Some name");
      String json = jsonArray.toJSONString();
      return Response.ok(json, MediaType.APPLICATION_JSON).build();
//              .header("Access-Control-Allow-Origin", "*")
//              .header("Content-Type", MediaType.APPLICATION_JSON + ";charset=UTF-8").build();
   }

   @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
   @ResponseBody
   public User getUser(){
      return userMap.get(0);
   }

   @RequestMapping(value = "/update", method = RequestMethod.PUT, produces="application/json")
   @ResponseBody
   public Collection<User> updateUsers(User userUpdate){
	   User user = userMap.get(userUpdate.getId());
	   user.setAge(userUpdate.getAge());
	   user.setName(userUpdate.getName());
      return userMap.values();
   }

   @RequestMapping(value = "/add", method = RequestMethod.POST, produces="application/json")
   @ResponseBody
   public Collection<User> addUser(User user){
      user.setId(System.identityHashCode(user));
      userMap.put(user.getId(), user);
      return userMap.values();
   }

   @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces="application/json")
   @ResponseBody
   public Collection<User> deleteUser(User user){
      userMap.remove(user.getId());
      return userMap.values();
   }

 
}
