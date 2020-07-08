package com.learn.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.engine.execution.BatchException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoIbatis implements UserDao
{

	@Override
	public UserTEO addUser(UserTEO user, SqlMapClient sqlmapClient) {
		try
		{
//			Integer id = (Integer)sqlmapClient.queryForObject("user.getMaxId");
//			id = id == null ? 1 : id + 1;
//			user.setId(id);
			sqlmapClient.insert("user.addUser", user);

			//user = getUserById(id, sqlmapClient);
			return user;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		return null;
	}

	@Override
	public UserTEO getUserById(Integer id, SqlMapClient sqlmapClient) {
		try
		{
			UserTEO user = (UserTEO)sqlmapClient.queryForObject("user.getUserById", id);
			return user;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		return null;
	}

	@Override
	public void deleteUserById(Integer id, SqlMapClient sqlmapClient) {
		try
		{
			sqlmapClient.delete("user.deleteUserById", id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	@Override
	public UserTEO getUserByEmail(String email, SqlMapClient sqlMapClient) {
		try {
			UserTEO user = (UserTEO)sqlMapClient.queryForObject("user.getUserByEmail", email);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<UserTEO> getAllUsers(SqlMapClient sqlMapClient) {
		List<UserTEO> listAllUsers;
		try {
			listAllUsers = (List<UserTEO>)sqlMapClient.queryForList("user.getAllUsers");
			return listAllUsers;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

//		ResultSet rs = null;
//		try {
//			rs = (ResultSet)sqlMapClient.executeBatchDetailed();
//
//		listAllUsers = new ArrayList<>();
//		while (rs.next()){
//			UserTEO user = new UserTEO();
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			String email = rs.getString("email");
//			String password = rs.getString("password");
//			int status = rs.getInt("status");
//			user.setId(id);
//			user.setEmail(email);
//			user.setName(name);
//			user.setPassword(password);
//			user.setStatus(status);
//
//			listAllUsers.add(user);
//			return listAllUsers;
//
//		}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (BatchException e) {
//			e.printStackTrace();
//		}


}