package com.microservice.event.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;
@Component
@Embeddable
public class JoinEventHelper implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long userId;
	private long eventId;
	private long placementId;
	
	
	public JoinEventHelper() {
		super();
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public long getPlacementId() {
		return placementId;
	}
	public void setPlacementId(long placementId) {
		this.placementId = placementId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (eventId ^ (eventId >>> 32));
		result = prime * result + (int) (placementId ^ (placementId >>> 32));
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JoinEventHelper other = (JoinEventHelper) obj;
		if (eventId != other.eventId)
			return false;
		if (placementId != other.placementId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
	

}
