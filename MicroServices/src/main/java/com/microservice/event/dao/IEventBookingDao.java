package com.microservice.event.dao;

import java.util.List;

import com.microservice.event.response.Response;


public interface IEventBookingDao {
	
	
	public void add(Object object) throws Response;
	public List<Object>getAll(Object clazz);
	public List<Object>getAllByCriteria(Object clazz,String criteria,String entry);
	public Object getByEmail(Object clazz,String email);
	public Object getById(Object clazz,long id);
	public void update(Object object);
	public void remove(Object object);
	public Object getElementByFieldName(String className,String field, String value);
	

}
