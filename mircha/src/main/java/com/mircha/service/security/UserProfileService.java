package com.mircha.service.security;

import com.mircha.model.security.UserProfile;

import java.util.List;

public interface UserProfileService {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
