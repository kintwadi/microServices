package com.microservice.write.service;

import java.awt.color.ProfileDataException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.microservice.write.dao.IDao;
import com.microservice.write.model.*;
import com.microservice.write.response.Response;
import com.microservice.write.response.Validator;


@Configuration
@ComponentScan(basePackages = { "com.event.booking.*" })
@PropertySources({
	@PropertySource("classpath:config.properties"),
	//@PropertySource("classpath:db.properties")
})
@Service
@Transactional
public class EventService {
	@Autowired
	private IDao dao;
	@Autowired
	private Response response ;

	@Autowired
	private Environment env;

	public Response addUser(User user) {


		if(!Validator.emailValidation(user.getEmail())) {

			response.setStatus(getMessage("user.add.error")+ user.getClass());
			response.setMessage(getMessage("user.email.erro"));
			response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
			response.setLogger(user.getClass().getName(), response.getMessage(), "severe");
			response.setView("home");
			return response;	
		}

		try {

			dao.add(user);
			Profile profile = new Profile();
			profile.setUser(user);
			dao.add(profile);
			
			response.setStatus(getMessage("user.update.success")+ user.getClass());
			response.setMessage("operation success ");
			response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
			response.setView("home");
			response.setResponseData(user);
			return response;

		} catch (Response ex) {

			response.setStatus(getMessage("user.update.error")+ user.getClass());
			response.setMessage(ex.getLocalizedMessage());
			response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
			response.setLogger(user.getClass().getName(), response.getMessage(), "severe");
		}

		dao.closeSessionFactory();
		return response;
	}
	public Response updateUser(User user) {

		if(!Validator.emailValidation(user.getEmail())) {

			response.setStatus(getMessage("user.update.error")+ user.getClass());
			response.setMessage(getMessage("user.email.error"));
			response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
			response.setLogger(user.getClass().getName(), response.getMessage(), "severe");
			response.setView("home");
			return response;	
		}
		User usr = (User) dao.getByEmail(user, user.getEmail());
		usr.setPassword(user.getPassword());
		dao.update(usr);
		response.setStatus(getMessage("user.update.success")+ user.getClass());
		response.setMessage("operation success ");
		response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
		response.setView("home");
		response.setResponseData(user);
		
		return response;
	}

	public Response removeUser(User user) {


		if(!Validator.emailValidation(user.getEmail())) {

			response.setStatus(getMessage("user.remove.error")+ user.getClass());
			response.setMessage(getMessage("user.email.erro"));
			response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
			response.setLogger(user.getClass().getName(), response.getMessage(), "severe");
			response.setView("home");
			return response;	
		}

		try {

			dao.add(user);
			response.setStatus(getMessage("user.remove.success")+ user.getClass());
			response.setMessage("operation success ");
			response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
			response.setView("home");
			response.setResponseData(user);
			return response;

		} catch (Response ex) {

			response.setStatus(getMessage("user.remove.error")+ user.getClass());
			response.setMessage(ex.getLocalizedMessage());
			response.setTxDate(new SimpleDateFormat("dd/mm/yyyy HH:mm:ss a").format(new Date()));
			response.setLogger(user.getClass().getName(), response.getMessage(), "severe");
		}

		dao.closeSessionFactory();
		return response;
	}

	private String getMessage(String key) {

		return  env.getProperty(key);	
	}

	public Response getUsers(User user){


		List<Object> users = dao.getAll(user);
		
		response.setReponseDataList(users);
		response.setMessage("list of users");
		dao.closeSessionFactory();
		return response;	
	}
	
	public Response getUser(User user,long id){
		
		user = (User) dao.getById(user, id);
		response.setResponseData(user);
		response.setMessage("single  user");
		dao.closeSessionFactory();
		return response;	
	}

	public Response getInitPage() {
		Response response = new Response();
		response.setView("home");
		return response;	
	}

	public void extractParrams(Object obj,HttpServletRequest request) {

		if(obj instanceof User) {

			((User) obj).setName(request.getParameter("userName"));
			((User) obj).setEmail(request.getParameter("email"));
			((User) obj).setPassword(request.getParameter("password"));	
		}

	}

	public Response addEvent(User user,Event event) {


		if(!userExist(user,user.getEmail())) {


			response.setStatus("user for this event  does not exist");
			return response;
		}
		try {

			user = (User) dao.getByEmail(user, user.getEmail());

			List<Event> events = new ArrayList<>();

			buildTransactionPedriod(event);// fill date, day ,hour etc...

			events.add(event);

			user.setEvents(events);

			event.setUser(user);

			dao.add(event);	

			response.setStatus("event added");

		} catch (Response e) {

			e.printStackTrace();
		}
		dao.closeSessionFactory();
		return response;
	}

	public Response updateEvent(Event event) {
		dao.update(event);
		response.setStatus("event updated");
		dao.closeSessionFactory();
		return response;
	}

	public Response deleteEvent(Event event) {
		dao.remove(event);
		response.setStatus("event added");
		dao.closeSessionFactory();
		return response;
	}

	public Response getElementByFieldName(String className,String field, String value) {

		response.setResponseData(dao.getElementByFieldName(className, field, value));
		response.setStatus("success");
		dao.closeSessionFactory();
		return response;

	}
	
	public Object getTickts(Object clazz,String property, long value){

		Event event = (Event)dao.getById(new Event(), value);
		System.out.println("event: "+ event.toString());
		List<Object> tickets = dao.getAllByCriteria(clazz, property, value);
		System.out.println("ti: "+tickets);
		event.setTickets(tickets);
		System.out.println("tickts: "+ event.toString());
		
		
		

		return event;
	}
	
	public Object getTickt(long ticketId, long eventId){

		Ticket ticket = (Ticket)dao.getById(new Ticket(), ticketId);
		
		Event event = (Event)dao.getById(new Event(), eventId);
		event.setTicket(ticket);
	
		System.out.println("tickts: "+ event.toString());

		return event;
	}
	
	
	public Response addTicket(List<Ticket> tickets){
		
		try {
			for(Ticket ticket : tickets){
				
				dao.add(ticket);
			}
			
			response.setMessage("tickt added");
		} catch (Response e) {
		
			e.printStackTrace();
		}
		return response;
	}
	
	/**
	 * OBS: get a profile according to the user ID
	 * @param user
	 * @param email
	 * @return
	 */
	public Object getUserProfile(User user,String email){
		
		user = (User) dao.getElementByFieldName("User", "email", email);
		Profile profile = (Profile) dao.getElementByFieldName("Profile", "user_id", String.valueOf(user.getUserId())) ;
		profile.setUser(user);
		response.setResponseData(profile);
		System.out.println("profile: "+profile.toString());
		return response.getResponseData();
	}

	public Object getById(Object object,long id) {
		
		response.setResponseData( dao.getById(object, id));
		dao.closeSessionFactory();
		return response.getResponseData();
	}


	private boolean userExist(User user, String eventOwnerEmail) {

		user = (User)dao.getByEmail(user, eventOwnerEmail);

		return user != null ? true : false;
	}

	public Response joinEvent(JoinEvent joinEvent) {

		buildTransactionPedriod(joinEvent);

		try {
			dao.add(joinEvent);
			response.setMessage("event joined ");
		} catch (Response e) {

			e.printStackTrace();
		}

		dao.closeSessionFactory();
		return response;
	}
	public Response addEventTickets(long eventId, Ticket ticket){
		
		buildTransactionPedriod(ticket);

		try {
			dao.add(ticket);
			response.setMessage("ticket added ");
		} catch (Response e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dao.closeSessionFactory();
		return response;
	}
	

	public Response bookEvent(JoinEvent joinEvent) {

		buildTransactionPedriod(joinEvent);

		dao.update(joinEvent);
		response.setMessage("event booked on update");

		dao.closeSessionFactory();
		return response;
	}

	public Response addSeat(JoinEvent joinEvent){


		return null;

	}


	private void buildTransactionPedriod(Object object){

		LocalDateTime currentTime = LocalDateTime.now();

		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int hour =currentTime.getHour();
		int minuts = currentTime.getMinute();
		int seconds = currentTime.getSecond();
		Date date = Date.from(currentTime.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant());

		if(object instanceof Event) {

			Event event = (Event) object;
			event.setDate(date);
			event.setHour(String.valueOf(hour));
			event.setMinuts(String.valueOf(minuts));
			event.setSeconds(String.valueOf(seconds));

		}
		if(object instanceof JoinEvent) {

			JoinEvent joinEvent = (JoinEvent) object;
			joinEvent.setDate(date);
			joinEvent.setMonth(month.name());
			joinEvent.setDay(String.valueOf(day));

			joinEvent.setHour(String.valueOf(hour));
			joinEvent.setMinuts(String.valueOf(minuts));
			joinEvent.setSeconds(String.valueOf(seconds));

		}
		if(object instanceof Comment) {

			Comment comment = (Comment) object;
			comment.setDate(date);
			comment.setMonth(month.name());
			comment.setDay(String.valueOf(day));
			comment.setHour(String.valueOf(hour));
			comment.setMinuts(String.valueOf(minuts));
			comment.setSeconds(String.valueOf(seconds));

		}


	}


	public Response addCategories(Category category) {


		try {
			dao.add(category);
			response.setMessage(getMessage("category.add.success"));

		} catch (Response e) {

			response.setMessage(getMessage("category.add.error"));
			e.printStackTrace();
		}

		dao.closeSessionFactory();
		return response;

	}
	public Response listCategories(Object category,String criteria,String lang) {

		List<Object> categories = dao.getAllByCriteria(category,criteria, lang);
		response.setReponseDataList(categories);
		response.setMessage("list of categories");
		dao.closeSessionFactory();
		return response;	

	}

	public Response addManager(Object manager) {

		try {
			dao.add(manager);
			response.setMessage("manager added");
		} catch (Response e) {

			response.setMessage(e.getLocalizedMessage());
			System.out.print(e.getLocalizedMessage());
		}

		dao.closeSessionFactory();
		return response;
	}


	public Response getBigCards(Manager manager,String criteria,String command) {

		List<Object> managers = dao.getAllByCriteria(manager,criteria, command);
		List<Object>events = new ArrayList<Object>();
	
		for(int i = 0; i< managers.size(); i++){

			manager = (Manager) managers.get(i); 
			Event event = (Event)dao.getById(new Event(), manager.getEventId());
			if(event != null)events.add(event);

		}

		
		response.setReponseDataList(events);
		dao.closeSessionFactory();
		return response;	

	}

	public Response addedRecently(Event evt) {

		List<Object> obj = dao.getAll(evt);
		List<Object>events = new ArrayList<Object>();
		Date crrentDate = new Date();
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(crrentDate);
		int currentYear = cal.get(Calendar.YEAR);
		
		int currentMonth = cal.get(Calendar.MONTH);
		
		
		int currentDay = cal.get(Calendar.DAY_OF_MONTH);

		System.out.println("size: "+obj.size());
		System.out.println("currentYear: "+currentYear);
		System.out.println("currentMonth : "+currentMonth );
		System.out.println("currentDay:  "+currentDay);
		
		for(int i = 0; i< obj.size(); i++){

			Event event = (Event) obj.get(i); 
			String month = event.getMonth().toUpperCase();
			int eventYear = Integer.parseInt(event.getYear().toUpperCase()); 
			int eventMonth = getMonth(month); 
			int eventDay = Integer.parseInt(event.getDay().toUpperCase());
			
			LocalDate dateBefore = LocalDate.of(currentYear, currentMonth, currentDay);

			LocalDate dateAfter = LocalDate.of(eventYear, eventMonth, eventDay);

			long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

			if(noOfDaysBetween <= 7) {

				events.add(event);

			} 

		}


		response.setReponseDataList(events);
		dao.closeSessionFactory();
		return response;

	}
	
	
	
	public Response featured(Manager manager,String criteria,String command) {

		List<Object> managers = dao.getAllByCriteria(manager,criteria, command);
		List<Object>events = new ArrayList<Object>();
	
		for(int i = 0; i< managers.size(); i++){

			manager = (Manager) managers.get(i); 
			Event event = (Event)dao.getById(new Event(), manager.getEventId());
			if(event != null)events.add(event);

		}

		
		response.setReponseDataList(events);
		dao.closeSessionFactory();
		return response;

	}
	

	public Response mainEvents(Manager manager,String criteria,String command) {

		List<Object> managers = dao.getAllByCriteria(manager,criteria, command);
		List<Object>events = new ArrayList<Object>();
	
		for(int i = 0; i< managers.size(); i++){

			manager = (Manager) managers.get(i); 
			Event event = (Event)dao.getById(new Event(), manager.getEventId());
			if(event != null)events.add(event);

		}

		
		response.setReponseDataList(events);
		dao.closeSessionFactory();
		return response;

	}
	
	
	
	private int getMonth(String month) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		 map.put("January".toUpperCase(),1);
	     map.put("February".toUpperCase(),2);
	     map.put("March".toUpperCase(),3);
	     map.put("April".toUpperCase(),4);
	     map.put("May".toUpperCase(),5);
	     map.put("June".toUpperCase(),6);
	     map.put("July".toUpperCase(),7);
	     map.put("August".toUpperCase(),8);
	     map.put("September".toUpperCase(),9);
	     map.put("October".toUpperCase(),10);
	     map.put("November".toUpperCase(),11);
	     map.put("December".toUpperCase(),12);
	     return map.get(month);
	  
	}






}