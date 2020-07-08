package com.mircha.dao;

import com.mircha.model.Interest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class InterestDAOImpl implements InterestDAO {

	private static final Logger logger = LoggerFactory.getLogger(InterestDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addInterest(Interest interest) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(interest);
	}

	@Override
	public void deleteInterest(Interest interest) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(interest);
	}

	@Override
	public void updateInterest(Interest interest) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(interest);
	}

	@Override
	public List<Interest> getAllInterests() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Interest> interests = session.createQuery("from Interest").list();
//		for(Person p : personsList){
//			logger.info("Person List::"+p);
//		}
		return interests;
	}
}
