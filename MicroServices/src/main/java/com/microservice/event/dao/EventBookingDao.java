package com.microservice.event.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservice.event.model.*;
import com.microservice.event.response.Response;



@Repository
public class EventBookingDao implements IEventBookingDao {

	@Autowired
	private SessionFactory factory;

	private Session getSession() {
		Session session = null;
		try {
			session = factory.openSession();
		} catch (HibernateException ex) {
			session = factory.openSession();
		}
		return session;
	}

	@Override
	public void add(Object object) {

		
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		try {
	
			tx = session.beginTransaction();
			session.save(object);
			tx.commit();
			
		} catch (Exception e) {
			if (tx!=null) tx.rollback();
		}finally {
			session.close();
		}
				

	}
	
	public void update(Object object) {
		
		
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		try {
	
			tx = session.beginTransaction();
			session.saveOrUpdate(object);
			tx.commit();
			
		} catch (Exception e) {
			if (tx!=null) tx.rollback();
		}finally {
			session.close();
		}
	}

	@Override
	public void remove(Object object) {
	
		
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		try {
	
			tx = session.beginTransaction();
			session.delete(object);
			tx.commit();
			
		} catch (Exception e) {
			if (tx!=null) tx.rollback();
		}finally {
			session.close();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getAll(Object clazz) {
		
		
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		
		List<Object>list = null;
		
		try{
			
			tx = session.beginTransaction();
			
			if(clazz instanceof User) {
				
				list = session.createCriteria(User.class).list();
				tx.commit();
			}
			if(clazz instanceof Event) {
				
				list = session.createCriteria(Event.class).list();
				tx.commit();
			}
			if(clazz instanceof Comment) {
				
				list = session.createCriteria(Comment.class).list();
				tx.commit();
			}
	       if(clazz instanceof Image) {
				
	    	   list = session.createCriteria(Image.class).list();
	    	   tx.commit();
			}
	       
	       if(clazz instanceof Category) {
			
	    	   list = session.createCriteria(Category.class).list();
	    	   tx.commit();
			}
	       if(clazz instanceof Ticket) {
				
	    	   list = session.createCriteria(Ticket.class).list();
	    	   tx.commit();
			}
			
		}catch (Exception e) {
		   if(tx != null)tx.rollback();
		}finally {
			session.close();
		}
		
		
		return list;
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getAllByCriteria(Object clazz, String criteria,Object entry) {
		
		List<Object> list = null;
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		try{
			tx = session.beginTransaction();
			list = session.createCriteria(clazz.getClass()).add(Restrictions.eq(criteria, entry)).list();
			tx.commit();
			
		}catch (Exception e) {
			if(tx != null)tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
		
	}

	@Override
	public Object getById(Object clazz,long id) {
		
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		try{
			tx = session.beginTransaction();
			clazz = session.get(clazz.getClass(), id);
			tx.commit();
		}catch (Exception e) {
			if(tx != null)tx.rollback();
		}finally {
			session.close();
		}
		
		return  clazz;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getByEmail(Object clazz, String email) {
		
		List <Object>list = null;
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		try{
			tx = session.beginTransaction();
			list = session.createCriteria(clazz.getClass()).add(Restrictions.eq("email", email)).list();
			tx.commit();
		}catch (Exception e) {
			if(tx != null)tx.rollback();
		}finally {
			session.close();
		}
		return list!= null ? list.get(0):  null;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getElementByFieldName(String className, String field, String value) {
		
		List<Object> list = null;
		Transaction tx = null;
		getSession().clear();
		getSession().flush();
		Session session = factory.openSession();
		try{
			
			tx = session.beginTransaction();
			StringBuilder str = new StringBuilder("From ");
			str.append(className);
			str.append(" where ");
			str.append(field);
			str.append(" =:"+field);
			Query query  = session.createQuery(str.toString());
			query.setParameter(field,value );
			list = query.list();
			tx.commit();
			
		}catch (Exception e) {
			if(tx != null) tx.rollback();
		}finally {
			session.close();
		}
		//System.out.println("object: "+ list.toString());
			
		return list.get(0);
	}
	
	@Override
	public void closeSessionFactory(){
	/*	if(factory!= null && factory.getCurrentSession().isConnected()){
			factory.getCurrentSession().close();
			//factory.close();
		}*/
		
	}
	



}