package com.microservice.event.response;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.microservice.event.controllers.HomeController;

/*@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)*/
@Component
public class Response extends Exception{

	private static final long serialVersionUID = 1L;
	private String status;
	private String message;
	private String txDate;
	private String view;
	private Object responseData;
	private List<Object>reponseDataList;
	private Map<Object, Object> map;
	private static Logger logger = null;


	public Response() {}
	public Response (String message, String status) {
		this.status = status;
		this.message = message;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTxDate() {
		return txDate;
	}

	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	
	public List<Object> getReponseDataList() {
		return reponseDataList;
	}
	public void setReponseDataList(List<Object> reponseDataList) {
		this.reponseDataList = reponseDataList;
	}
	
	
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + ", txDate=" + txDate + ", view=" + view
				+ ", responseData=" + responseData + ", reponseDataList=" + reponseDataList + ", map=" + map + "]";
	}
	
	
	
	public void setLogger(String className,String message, String level) {
		
		logger = Logger.getLogger(HomeController.class.getName());
		if(level.equals("info")) {
			 logger.log(Level.INFO,message);
		}
		if(level.equals("severe")) {
			 logger.log(Level.SEVERE,message);
		}
		if(level.equals("debuger")) {
			 logger.log(Level.WARNING,message);
		}
		
	}
}
