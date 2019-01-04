package com.microservice.event.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.event.dao.Dao;
import com.microservice.event.model.User;

@Service
@Transactional
public class EventService {

	@Autowired
	private Dao dao;
	
	public void addUser(User user) {
		
		
		dao.save(user);
		
	}
}
