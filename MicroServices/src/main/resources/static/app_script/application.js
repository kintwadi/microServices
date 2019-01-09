
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



function MenuBar(data,lang){
	
	this.data = data;
	this.listCategories = (lang)=>{
		
		var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange=function() {
			  
		    if (this.readyState == 4 && this.status == 200) {
		    	
		      var categories = JSON.parse(this.responseText);
		      
		      var category_container = document.getElementById("category_container");
		      //a.setAttribute('href',"category/");
		      for(var i = 0; i< categories.length; i++ ){
		    	
		    	  var li = document.createElement("li");
		    	  var a = document.createElement("a");
			      a.addEventListener('click',getCategory,false);
			      a.param = categories;
			      a.innerHTML = categories[i]["name"].toUpperCase();
			      a.setAttribute('class',"category");
			     
			      li.appendChild(a);
			      category_container.appendChild(li);
		      }
		   
		    }
		  };
		  xhttp.open("GET", "list_categories/"+lang, true);
		  xhttp.send();
	}
}
var flag = true;
function getCategory(e){
	
 var a = document.getElementsByClassName("category");	
 var categories = a[0].param;

	for(var i = 0; i< categories.length; i++ ){

		if(flag){
			a = document.getElementsByClassName("category");
			a[i].setAttribute('href',"category/"+categories[i]["page"]);
			flag = false;
		}else{
			a = document.getElementsByClassName("category");
			a[i].setAttribute('href',categories[i]["page"]);
			
		}
	}
	
	
}




function createMenubar(lang){
	
	var menu = null ;
	// setup the language
	if(lang == "en"){
		
		menu = new MenuBar(menuData);
		
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

createMenubar("en");



