package com.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.sql.SQLException;
import java.util.List;

public class UserDaoIbatis implements UserDao
{
    @Override
    public UserTEO addUser(UserTEO user, SqlMapClient sqlmapClient) {
        try
        {
            Integer id = (Integer)sqlmapClient.queryForObject("user.getMaxId");
            id = id == null ? 1 : id + 1;
            user.setId(id);
            user.setStatus(1);
            sqlmapClient.insert("user.addUser", user);
            user = getUserById(id, sqlmapClient);
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
  public List<UserTEO> getUsers(SqlMapClient sqlmapClient) {
    try {
      return (List<UserTEO>) sqlmapClient.queryForList("user.getUsers");
    } catch (SQLException e) {
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
}