package com.mircha.service;

import com.mircha.model.Interest;
import com.mircha.spring.model.Person;

import java.util.List;

public interface InterestService {

	public void addInterest(Interest interest);
	public void deleteInterest(Interest interest);
	public void updateInterest(Interest interest);
//	public void updatePerson(Person p);
	public List<Interest> getAllInterests();
//	public Person getPersonById(int id);
//	public void removePerson(int id);
	
}
