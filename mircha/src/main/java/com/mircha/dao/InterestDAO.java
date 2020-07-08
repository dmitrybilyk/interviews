package com.mircha.dao;

import com.mircha.model.Interest;

import java.util.List;

public interface InterestDAO {

	public void addInterest(Interest interest);
	public void deleteInterest(Interest interest);
	public void updateInterest(Interest interest);
//	public void updatePerson(Person p);
	public List<Interest> getAllInterests();
//	public Person getPersonById(int id);
//	public void removePerson(int id);
}
