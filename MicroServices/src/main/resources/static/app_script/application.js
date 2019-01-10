

var menuData = {
	
	logo:"logo",
	brand:"Bodasbue",
	home: "home",
	contact:"Contact:",
	phone:" (49)124589660",
	categories:" Categories",
	signup:" Sign Up",
	login:" Login",
	
	
};



function MenuBar(data,lang,baselink){
	
	this.data = data;
	this.lang = lang;
	this.listCategories = (lang)=>{
		
		var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange=function() {
			  
		    if (this.readyState == 4 && this.status == 200) {
		    	
		      var categories = JSON.parse(this.responseText);
		      
		      var category_container = document.getElementById("category_container");
		      category_container.innerHTML = "";
		     
		      for(var i = 0; i< categories.length; i++ ){
		    	
		    	  var li = document.createElement("li");
		    	  var a = document.createElement("a");
			      a.param = categories;
			      a.innerHTML = categories[i]["name"].toUpperCase();
			      a.setAttribute('href',baselink+""+categories[i]["page"]);
			      a.setAttribute('class',"category");
			      a.setAttribute('id',"category"+i);
			     
			      li.appendChild(a);
			      category_container.appendChild(li);
		      }
		   
		    }
		  };
		  xhttp.open("GET", "list_categories/"+lang, true);
		  xhttp.send();
	}
}

function createMenubar(lang,baselink){
	
	var menu = null ;
	// setup the language
	if(lang == "en"){
		
		menu = new MenuBar(menuData,lang,baselink);
		
		menu.listCategories(lang);
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

createMenubar("en","category/");



