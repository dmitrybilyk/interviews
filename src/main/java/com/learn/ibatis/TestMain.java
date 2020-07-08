package com.learn.ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.Reader;
import java.util.List;

public class TestMain {
    public static void main(String[] args) throws Exception {
        //Initialize dao
        UserDao userDao = new UserDaoIbatis();
        AddressDao addressDao = new AddressDaoIbatis();

        //Create the SQLMapClient
        Reader reader = Resources.getResourceAsReader("ibatis/sql-maps-config.xml");
        SqlMapClient sqlmapClient = SqlMapClientBuilder.buildSqlMapClient(reader);


        UserAddress userAddress2 = new UserAddress();
     //   userAddress2.setId(5);
        userAddress2.setCity("Kharkiv");
        userAddress2.setNumber(88);
        userAddress2.setStreet("Tankopiya");



        addressDao.addUserAddress(userAddress2, sqlmapClient);
        //Create a new user to persist

        UserTEO user = new UserTEO();
        user.setName("Petya");
        user.setEmail("Petya7@gmail.com");
        user.setPassword("Petya777");
        user.setAddress(addressDao.getUserAddressById(2, sqlmapClient));
        userDao.addUser(user, sqlmapClient);

      //  user.getAddress().setCity("Poltava");
        addressDao.updateUserAddress(user.getAddress(), sqlmapClient);


        List<UserTEO> listAllUsers = userDao.getAllUsers(sqlmapClient);
        for (UserTEO listUser : listAllUsers) {
            System.out.print(listUser.getId() + "   ");
            System.out.print(listUser.getName() + "  ");
            System.out.print(listUser.getEmail() + "  ");
            System.out.println(listUser.getAddress().getCity());
        }


    }

}



        //System.out.println(Arrays.toString(manager.getAllUsers(sqlmapClient).toArray()));

 
        //Fetch the user detail
        //UserTEO createdUser = manager.getUserById(1, sqlmapClient);
        //System.out.println(createdUser.getEmail());

        // UserTEO userByMail = manager.getUserByEmail("demo-user@howtodoinjava.com", sqlmapClient);
        //System.out.println("User By Email: " + userByMail.getName());

        //Lets delete the user
//       manager.getEmailByUserId().deleteUserById(1, sqlmapClient);
