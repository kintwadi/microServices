package com.microservice.event.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservice.event.model.User;

@Repository
public class Dao {

	@Autowired
	private SessionFactory sessionFactory;
	
   public void save(User user) {
	   Session session= null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
   }
}
