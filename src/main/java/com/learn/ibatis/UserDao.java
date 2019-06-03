package com.learn.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.sql.SQLException;
import java.util.List;

public interface UserDao 
{
	public UserTEO addUser(UserTEO user, SqlMapClient sqlmapClient);
	public UserTEO getUserById(Integer id, SqlMapClient sqlmapClient);
	public void deleteUserById(Integer id, SqlMapClient sqlmapClient);
	public UserTEO getUserByEmail(String email, SqlMapClient sqlmapClient);
	public List<UserTEO> getAllUsers(SqlMapClient sqlmapClient);
//	public UserAddress addUserAddress (UserAddress userAddress, SqlMapClient sqlMapClient);
}
