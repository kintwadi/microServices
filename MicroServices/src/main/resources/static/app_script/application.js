
var menuData = {
	
	logo:"logo",
	brand:"Bodadbue",
	home: "home",
	contact:"Contact:",
	phone:" (49)124589660",
	categories:" Categories",
	signup:" Sign Up",
	login:" Login",
	
	
};



function MenuBar(data){
	
	this.data = data;
		
}


function createMenubar(lang){
	
	var menu = null ;
	// setup the language
	if(lang == "en"){
		
		menu = new MenuBar(menuData);
	}
	var brand = document.getElementById("brand");
	var home = document.getElementById("home");
	var contact = document.getElementById("contact");
	var login = document.getElementById("login");
	var signup = document.getElementById("signup");
	var categories = document.getElementById("categories");
	
	brand.textContent = menu.data.brand;
	home.textContent = menu.data.home;
	contact.textContent = menu.data.phone;
	login.textContent = menu.data.login;
	signup.textContent = menu.data.signup;
	categories.textContent = menu.data.categories;
	
	

}
createMenubar("en");