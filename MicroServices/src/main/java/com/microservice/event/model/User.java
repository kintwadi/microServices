package com.microservice.event.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "USER")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User extends UserDetails implements Serializable{
	
	private static final long serialVersionUID = 6305492665756801120L;
	private String name;
	private String password;
	@Column(unique = true)
	private String email;
	
	
	public User() {
		super();
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String userName) {
		this.name = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	



	@Override
	public String toString() {
		return "User [userName=" + name + ", password=" + password + ", email=" + email + "]";
	}

	
	
	
	
		

}
