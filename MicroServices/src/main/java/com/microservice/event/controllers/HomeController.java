package com.microservice.event.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.microservice.event.model.User;
import com.microservice.event.service.EventService;

@Controller
public class HomeController {

	@Autowired
	private EventService service;
	@RequestMapping("/")
	public ModelAndView firstPage() {
		
		User user = new User();
		user.setEmail("antonio@gmail.com");
		user.name("Antonio");
		service.addUser(user);
		return new ModelAndView("home");

		
	}

}
