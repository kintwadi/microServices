package com.microservice.write.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Component
@Entity
@Table(name="LIKE_EVENT")
public class Like implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long likeId;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String month;
	private String day;
	private String hour;
	private String minuts;
	private String seconds;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="eventId")
	private Event event;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	public Like(){
		
	}
	
	public Like addRelationShip(Object object) {

		if(object instanceof User) {
			this.user = (User)object;
			return this;
		}

		this.event = (Event)object;
		return this;

	}

	public long getLikeId() {
		return likeId;
	}

	public void setLikeId(long likeId) {
		this.likeId = likeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinuts() {
		return minuts;
	}

	public void setMinuts(String minuts) {
		this.minuts = minuts;
	}

	public String getSeconds() {
		return seconds;
	}

	public void setSeconds(String seconds) {
		this.seconds = seconds;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Like [likeId=" + likeId + ", date=" + date + ", month=" + month + ", day=" + day + ", hour=" + hour
				+ ", minuts=" + minuts + ", seconds=" + seconds + ", event=" + event + ", user=" + user + "]";
	}
	
	
	
	
	

}
