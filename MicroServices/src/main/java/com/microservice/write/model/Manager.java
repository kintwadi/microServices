package com.microservice.write.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name ="Manager")
public class Manager  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	
	@GeneratedValue
	private long id;
	private  long eventId;
	private String title;
	private String description;
	private String command;
	private String imagePath;
	public Manager() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", eventId=" + eventId + ", title=" + title + ", description=" + description
				+ ", command=" + command + ", imagePath=" + imagePath + "]";
	}
	
	
	
}
