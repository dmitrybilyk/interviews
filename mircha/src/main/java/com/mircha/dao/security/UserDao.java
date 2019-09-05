package com.mircha.dao.security;

import com.mircha.model.security.User;

public interface UserDao {

	void save(User user);
	
	User findById(int id);
	
	User findBySSO(String sso);
	
}

