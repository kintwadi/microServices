

var menuDataEN = {
	
	logo:"logo",
	brand:"Bodasbue",
	home: "home",
	contact:"Contact:",
	phone:" (49)124589660",
	categories:" Categories",
	login:" Login",
	signup:" Sign Up"

	
	
};

var menuDataPT = {
		
		logo:"logo",
		brand:"Bodasbue",
		home: "home",
		contact:"Contacto:",
		phone:" (49)124589660",
		categories:" Categorias",
		login:" Login",
		signup:" Cadastrar"
		
		
		
};




function MenuBar(data,lang,baselink){
	
	this.data = data;
	this.lang = lang.toUpperCase();
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
			      a.setAttribute('href',baselink+""+categories[i]["page"]+"/"+lang);
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
	if(lang == "EN"){
		
		menu = new MenuBar(menuDataEN,lang,baselink);
		
		menu.listCategories(lang);
		
		
	}
	if(lang == "PT"){
		
		menu = new MenuBar(menuDataPT,lang,baselink);
		
		menu.listCategories(lang);
	
	
	}
	var brand = document.getElementById("brand");
	var home = document.getElementById("home");
	var contact = document.getElementById("contact");
	var login = document.getElementById("login");
	var signup = document.getElementById("signup");
	var categories = document.getElementById("categories");
	//categories.addEventListener('click',setLanguageOnCategoryGo);
	
	brand.textContent = menu.data.brand;
	home.textContent = menu.data.home;
	contact.textContent = menu.data.phone;
	login.textContent = menu.data.login;
	signup.textContent = menu.data.signup;
	categories.textContent = menu.data.categories;
		

}



// default language

var lang_select = document.getElementById("lang_select");


createMenubar(lang_select.value,"category/");

lang_select.addEventListener('change',onLanguageChange);

function onLanguageChange(e){
	
	
	var selectedLang = document.getElementById("lang_select").value;
	
	createMenubar(selectedLang,"category/");
}



