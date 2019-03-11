package com.microservice.write.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTHOR")
public class Author {
	

	@Id
	@GeneratedValue
	@Column(name="author_id")
	private long authorId;
	private String name;
    @Column(unique = true, nullable = false)
	private String email;
    private String biography;
	private String photo;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Topic> topics;
	
	public Author() {
		super();
	}
	public long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(long author_id) {
		this.authorId = author_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", email=" + email + ", biography=" + biography
				+ ", photo=" + photo + ", topics=" + topics + "]";
	}
	
	
	
	
	

}
