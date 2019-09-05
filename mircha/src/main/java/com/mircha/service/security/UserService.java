package com.mircha.service.security;

import com.mircha.model.security.User;

public interface UserService {

	void save(User user);
	
	User findById(int id);
	
	User findBySso(String sso);
	
}