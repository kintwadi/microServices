package com.microservice.write.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Component
@Table(name = "PROFILE")
public class Profile implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String type;//basic, admin
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	
	public Profile() {
		
		setType("basic");//default profile
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", type=" + type + ", user=" + user + "]";
	}
	
	
	
	
	

}