
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

var flag = true;

function MenuBar(data,lang){

	this.data = data;

	this.writeMenuContent = (menu,lang)=>{

		var brand = document.getElementById("brand");
		//var home = document.getElementById("home");
		var contact = document.getElementById("contact");
		var login = document.getElementById("login");
		var signup = document.getElementById("signup");
		var categories = document.getElementById("categories");

		brand.textContent = menu.data.brand;
		//home.textContent = menu.data.home;
		contact.textContent = menu.data.phone;
		login.textContent = menu.data.login;
		signup.textContent = menu.data.signup;
		categories.textContent = menu.data.categories;


	}

	function categoryListener (e){

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

	this.listCategories = (menu,lang)=>{

		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange=function() {

			if (this.readyState == 4 && this.status == 200) {

				var categories = JSON.parse(this.responseText);

				var category_container = document.getElementById("category_container");

				for(var i = 0; i< categories.length; i++ ){

					var li = document.createElement("li");
					var a = document.createElement("a");
					a.addEventListener('click',categoryListener,false);
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

function createApplicationLayout(lang){

	var menu = null ;
	// setup the language
	if(lang == "en"){

		menu = new MenuBar(menuData);
		menu.listCategories(menu,lang);
		menu.writeMenuContent(menu,lang);
	}

}



//createApplicationLayout("en");


{
	class SliderClip {
		constructor(el) {
			this.el = el;
			this.Slides = Array.from(this.el.querySelectorAll('li'));
			this.Nav = Array.from(this.el.querySelectorAll('nav a'));
			this.totalSlides = this.Slides.length;
			this.current = 0;
			this.autoPlay = true; //true or false
			this.timeTrans = 4000; //transition time in milliseconds
			this.IndexElements = [];

			for(let i=0;i<this.totalSlides;i++) {
				this.IndexElements.push(i);
			}

			this.setCurret();
			this.initEvents();
		}
		setCurret() {
			this.Slides[this.current].classList.add('current');
			this.Nav[this.current].classList.add('current_dot');
		}
		initEvents() {
			const self = this;

			this.Nav.forEach((dot) => {
				dot.addEventListener('click', (ele) => {
					ele.preventDefault();
					this.changeSlide(this.Nav.indexOf(dot));
				})
			})

			this.el.addEventListener('mouseenter', () => self.autoPlay = false);
			this.el.addEventListener('mouseleave', () => self.autoPlay = true);

			setInterval(function() {
				if (self.autoPlay) {
					self.current = self.current < self.Slides.length-1 ? self.current + 1 : 0;
					self.changeSlide(self.current);
				}
			}, this.timeTrans);

		}
		changeSlide(index) {

			this.Nav.forEach((allDot) => allDot.classList.remove('current_dot'));

			this.Slides.forEach((allSlides) => allSlides.classList.remove('prev', 'current'));

			const getAllPrev = value => value < index;

			const prevElements = this.IndexElements.filter(getAllPrev);

			prevElements.forEach((indexPrevEle) => this.Slides[indexPrevEle].classList.add('prev'));

			this.Slides[index].classList.add('current');
			this.Nav[index].classList.add('current_dot');
		}
	}

	const slider = new SliderClip(document.querySelector('.slider'));
}






