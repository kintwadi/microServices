package com.microservice.write.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="TOPIC")
public class Topic {

	@Id
	@GeneratedValue
	@Column(name ="topic_id")
	private long topicId;
	
	private String text;
	
	@ManyToOne
	@JoinColumn(name="authorId")
	private Author author;
	
	@ManyToOne
	@JoinColumn(name="feedbackId")
	private Feedback feedback;
	public Topic() {
		super();
	}
	public long getTopicId() {
		return topicId;
	}
	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}
	public Author getAuthor() {
		return author;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", author=" + author + "]";
	}
	
	
	
	
	
	
	
}
