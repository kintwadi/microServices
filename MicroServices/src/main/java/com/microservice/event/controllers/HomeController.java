package com.microservice.event.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.microservice.event.model.*;
import com.microservice.event.response.Response;
import com.microservice.event.service.EventService;




@Controller

public class HomeController {

	@Autowired
	private EventService service;
	@Autowired
	private User user;
	@Autowired
	private Event event;
	@Autowired
	private Placement placement;
	@Autowired
	private JoinEventHelper joinEventHelper;

	@Autowired
	private Profile profile;

	@Autowired
	private Category category;

	@Autowired
	private Manager manager;
	@Autowired
	private Ticket ticket;

	@RequestMapping("/")
	public String initializer( @ModelAttribute User user,Model model,HttpSession session) {


		return service.getInitPage().getView();
	}

	@PostMapping("/register_category")
	@ResponseBody
	public String addCategory(@RequestBody Category category, Model model) {

		Response reponse = service.addCategories(category);
		return reponse.getMessage();
	}

	@GetMapping("/list_categories/{lang}")
	@ResponseBody
	public List<Object>getCategoriesFromHomePage(@PathVariable String lang){

		return service.listCategories(category, "lang",lang).getReponseDataList();

	}
	@GetMapping("category/list_categories/{lang}")
	@ResponseBody
	public List<Object>getCategoriesFromCategoryPage(@PathVariable String lang){


		return service.listCategories(category, "lang",lang).getReponseDataList();

	}

	@GetMapping("/category/{page}")
	public String cetegoryPage(@PathVariable String page,Model model) {


		model.addAttribute("page", page);
		return "category_page";
	}

	// Users
	@PostMapping("/register_user")
	public String registerUser(@RequestBody User user, Model model) {

		Response response = service.addUser(user); 
		model.addAttribute("msg", response.getMessage());
		return response.getView();
	}

	@PostMapping("/update_user/{psw}/{email:.+")
	public String updateUser(@PathVariable String psw,@PathVariable String email,Model model) {

		user.setEmail(email);
		user.setPassword(psw);
		Response response = service.updateUser(user);
		model.addAttribute("msg", response.getMessage());
		return response.getView();
	}
	@PostMapping("/remove_user")
	public String removeUser(@RequestBody User user,Model model) {

		Response response = service.removeUser(user);
		model.addAttribute("msg", response.getMessage());
		return response.getView();
	}

	@GetMapping("/get_users")
	@ResponseBody
	public List <Object>getUsers(HttpSession session ) {


		return service.getUsers(user).getReponseDataList();
	}


	@GetMapping("/getUser_by_id/{id}")
	@ResponseBody
	public User getUserById(@PathVariable long id) {

		return (User)service.getUser(user, id).getResponseData();
	}

	@GetMapping("/get_user/{email:.+}")// allow .com extension on email
	@ResponseBody
	public Map<String,Object> getUserByEmail(@PathVariable String email) {

		Map <String,Object> map = new HashMap<>();
		profile = (Profile) service.getUserProfile(user,email);

		System.out.println("user: "+ profile.getUser().toString());
		map.put("profile", profile);
		map.put("user", profile.getUser());

		return map;
	}


	//EventsJoinEvent
	@PostMapping("/register_event/{eventOwnerEmail:.+}")
	@ResponseBody
	public String registerEvent(@RequestBody Event event,@PathVariable("eventOwnerEmail")String eventOwnerEmail, Model model) {

		user.setEmail(eventOwnerEmail);
		Response response = service.addEvent(user,event);
		return response.getStatus();
	}
	@PostMapping("/update_event")
	public String updateEvent(@RequestBody Event event, Model model) {

		Response response = service.addUser(user); 
		model.addAttribute("msg", response.getStatus());
		return response.getView();
	}

	@PostMapping("/delete_event")
	public String deleteEvent(@RequestBody Event event, Model model) {

		Response response = service.addUser(user); 
		model.addAttribute("msg", response.getStatus());
		return response.getView();
	}

	@GetMapping("/get_event_id/{eventId}")
	@ResponseBody
	public Event getEventById(@PathVariable long eventId){

		event = (Event) service.getTickts(ticket,"eventId", eventId);//retur ning null

		System.out.println("tickets: "+event.toString());
		return event;

	}
	
	@GetMapping("/get_ticket/{ticketId}/{eventId}")
	@ResponseBody
	public Event getEventTicket(@PathVariable long ticketId,@PathVariable long eventId){

		event = (Event) service.getTickt(ticketId,eventId);//retur ning null

		System.out.println("tickets: "+event.toString());
		return event;

	}
	
	@PostMapping("/add_tickets")
	public String addTickets(@RequestBody List<Ticket> tickets, Model model) {

		Response response = service.addTicket(tickets);
		
		return response.getMessage();
	}
	
	


	@PostMapping("/join_event/{eventId}/{userId}/{placementId}")
	@ResponseBody
	public String joinEvent(@RequestBody JoinEvent joinEvent,@PathVariable long eventId,@PathVariable long userId,@PathVariable long placementId) {


		user = (User)service.getById(user, userId);
		event = (Event)service.getById(event, eventId);
		placement = (Placement)service.getById(placement,placementId);

		joinEventHelper.setEventId(eventId);
		joinEventHelper.setUserId(userId);
		joinEventHelper.setPlacementId(placementId);

		joinEvent.addRelationShip(user).addRelationShip(event);	
		Response response = service.joinEvent(joinEvent);

		return response.getMessage();
	}

	@PostMapping("/book_event/{eventId}/{userId}/{placementId}")
	@ResponseBody
	public String bookEvent(@RequestBody JoinEvent joinEvent,@PathVariable long eventId,@PathVariable long userId,@PathVariable long placementId) {


		user = (User)service.getById(user, userId);
		event = (Event)service.getById(event, eventId);
		placement = (Placement)service.getById(placement,placementId);

		joinEventHelper.setEventId(eventId);
		joinEventHelper.setUserId(userId);
		joinEventHelper.setPlacementId(placementId);

		joinEvent.addRelationShip(user).addRelationShip(event);		
		Response response = service.bookEvent(joinEvent);

		return response.getMessage();
	}
	@PostMapping("/add_to_manager")
	@ResponseBody
	public String addToManager(@RequestBody Manager manager) {

		Response response = service.addManager(manager);
		return response.getMessage();

	}

	@GetMapping("/get_big_cards/{command}")
	@ResponseBody
	public List<Object>  listManager(@PathVariable String command) {

		Response response = service.getBigCards(manager, "command", command);

		return response.getReponseDataList();

	}

	@GetMapping("/recently_added")
	@ResponseBody
	public List<Object> recentlyAdded() {

		Response response = service.addedRecently(event);
		return response.getReponseDataList();

	}

	@GetMapping("/featured/{command}")
	@ResponseBody
	public List<Object> featured(@PathVariable String command) {

		Response response = service.featured(manager, "command", command);
		return response.getReponseDataList();

	}

	@GetMapping("/mainEvents/{command}")
	@ResponseBody
	public List<Object> main(@PathVariable String command) {

		Response response = service.mainEvents(manager, "command", command);
		return response.getReponseDataList();

	}

	@RequestMapping("/gethome")
	public String goHome() {

		return "home";
	}


}
