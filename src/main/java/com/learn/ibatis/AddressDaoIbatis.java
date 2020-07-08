package com.learn.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by dik81 on 24.05.19.
 */
public class AddressDaoIbatis implements AddressDao {
    @Override
    public UserAddress addUserAddress(UserAddress userAddress, SqlMapClient sqlMapClient) {


    try
    {
        sqlMapClient.insert("address.addUserAddress", userAddress);
        return userAddress;
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return null;

}

    @Override
    public UserAddress getUserAddressById(Integer id, SqlMapClient sqlMapClient) {
    try
    {
        UserAddress userAddress = (UserAddress)sqlMapClient.queryForObject("address.getUserAddressById", id);
        return userAddress;
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return null;
}
    @Override
    public UserAddress updateUserAddress(UserAddress userAddress, SqlMapClient sqlMapClient) {
     try
     {
         sqlMapClient.update("address.updateUserAddress", userAddress);
         return userAddress;
     }
     catch (Exception e)
     {
           e.printStackTrace();
     }
     return null;
}

    @Override
    public List<UserAddress> getAllAddresses(SqlMapClient sqlMapClient) {
        List<UserAddress> listAllAddresses;
        try {
            listAllAddresses = (List<UserAddress>)sqlMapClient.queryForList("address.getAllAddresses");
            return listAllAddresses;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
