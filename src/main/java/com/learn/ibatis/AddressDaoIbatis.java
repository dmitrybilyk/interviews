package com.learn.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.util.List;

/**
 * Created by dik81 on 24.05.19.
 */
public class AddressDaoIbatis implements AddressDao {
    @Override
    public UserAddress addUserAddress(UserAddress userAddress, SqlMapClient sqlMapClient) {
        return null;
    }

    @Override
    public UserAddress getUserAddressById(Integer id, SqlMapClient sqlMapClient) {
        return null;
    }

    @Override
    public void changeUserAddress(Integer id, SqlMapClient sqlMapClient) {

    }

    @Override
    public List<UserAddress> getAllAddresses(SqlMapClient sqlMapClient) {
        return null;
    }
}
