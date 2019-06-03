package com.learn.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.util.List;

/**
 * Created by dik81 on 24.05.19.
 */
public interface AddressDao {
    public UserAddress addUserAddress (UserAddress userAddress, SqlMapClient sqlMapClient);
    public UserAddress getUserAddressById (Integer id, SqlMapClient sqlMapClient);
    public UserAddress updateUserAddress(UserAddress userAddress, SqlMapClient sqlMapClient);
    public List<UserAddress> getAllAddresses (SqlMapClient sqlMapClient);
}
