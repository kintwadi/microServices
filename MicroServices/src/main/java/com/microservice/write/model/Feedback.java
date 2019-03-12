package com.microservice.write.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="FEEDBACK")
public class Feedback {
	
	@Id
	@GeneratedValue
	@Column(name="feedback_id")
	private long feedbackId;
	
	@JsonIgnore
	@OneToMany(mappedBy ="feedback", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Topic> topics = new ArrayList<>();

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	
	

}
