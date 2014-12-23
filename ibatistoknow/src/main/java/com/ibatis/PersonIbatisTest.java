package com.ibatis;

/**
 * Created by dik81 on 11/27/14.
 */

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.learn.model.Person;

import java.io.Reader;
import java.util.List;


public class PersonIbatisTest {
  public static void main(String[] args) throws Exception
  {
    //Initialize dao
    PersonDao manager = new PersonDaoIbatis();

    //Create the SQLMapClient
    Reader reader = Resources.getResourceAsReader("sqlmapclientPerson.xml");
    SqlMapClient sqlmapClient = SqlMapClientBuilder.buildSqlMapClient (reader);

    manager.addUser(new Person(),sqlmapClient);

    //Fetch the user detail


    Person person = manager.getUserById(1, sqlmapClient);
    System.out.println(person.getFirstName());
//
//    List<UserTEO> allUsers = manager.getUsers(sqlmapClient);
//
//    for (UserTEO selectedUser : allUsers) {
//      System.out.println(selectedUser.getName());
//    }

    //Lets delete the user
//    manager.deleteUserById(1, sqlmapClient);
  }
}
