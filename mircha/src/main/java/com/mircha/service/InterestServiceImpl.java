package com.mircha.service;

import com.mircha.dao.InterestDAO;
import com.mircha.model.Interest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterestServiceImpl implements InterestService {

	@Autowired
	private InterestDAO interestDAO;

	@Override
	public void addInterest(Interest interest) {
		interestDAO.addInterest(interest);
	}

	@Override
	public List<Interest> getAllInterests() {
		return interestDAO.getAllInterests();
	}
}
