package com.learn.ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.Reader;
import java.util.List;

public class TestMain
{
    public static void main(String[] args) throws Exception
    {
        //Initialize dao
        UserDao manager = new UserDaoIbatis();
 
        //Create the SQLMapClient
        Reader reader = Resources.getResourceAsReader("ibatis/sql-maps-config.xml");
        SqlMapClient sqlmapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
 
        //Create a new user to persist

        UserTEO user = new UserTEO();
        user.setId(1);
        user.setName("DemoUser");
        user.setPassword("password");
        user.setEmail("demo-user@howtodoinjava.com");
        UserAddress userAddress = new UserAddress();
        userAddress.setId(1);
        user.setAddress(userAddress);
 
        //Add the user
        manager.addUser(user, sqlmapClient);

        List<UserTEO> listAllUsers = manager.getAllUsers(sqlmapClient);
        for ( UserTEO listUser: listAllUsers){
            System.out.print(listUser.getId()+"   ");
            System.out.print(listUser.getName()+"  ");
            System.out.println(listUser.getEmail());
        }





        //System.out.println(Arrays.toString(manager.getAllUsers(sqlmapClient).toArray()));

 
        //Fetch the user detail
        //UserTEO createdUser = manager.getUserById(1, sqlmapClient);
        //System.out.println(createdUser.getEmail());

        // UserTEO userByMail = manager.getUserByEmail("demo-user@howtodoinjava.com", sqlmapClient);
        //System.out.println("User By Email: " + userByMail.getName());

        //Lets delete the user
//       manager.getEmailByUserId().deleteUserById(1, sqlmapClient);
    }
}