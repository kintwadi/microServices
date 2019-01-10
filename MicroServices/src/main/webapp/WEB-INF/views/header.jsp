<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<c:set var="context" value="${pageContext.request.contextPath}"/>

<link href="/app_css/application.css"rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.2/css/bootstrap-select.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.2/js/bootstrap-select.min.js"></script>

<!-- (Optional) Latest compiled and minified JavaScript translation files -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.2/js/i18n/defaults-*.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.1.0/css/flag-icon.min.css" rel="stylesheet">
</head>
<body >

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#" id="brand"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#" id="home"></a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      	 <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span id="categories"></span> <span class="caret"></span></a>
          <ul class="dropdown-menu" id="category_container">
            
           
          </ul>
        </li>
      	<li ><a href ="#"  ><span class="glyphicon glyphicon-earphone" id = "contact"></span></a></li>
      	<li ><a href ="#" id = "facebook" ><span class="fa fa-facebook-square"></span></a></li>
      	<li><a href ="#" id = "tweeter"><span class="fa fa-twitter-square"></span></a></li>
      	<li><a href ="#" id = "instagram"><span class="fa fa-instagram"></span></a></li>
      	<li><a href ="#" id = "youtube"><span class="fa fa-youtube"></span></a></li>
        <li><a href="#"><span id="signup" class="glyphicon glyphicon-user"></span > </a></li>
        <li><a href="#"><span id="login" class="glyphicon glyphicon-log-in"></span > </a></li>
      </ul>
    </div>
    
    	<div class="search_container navbar-inverse">
  			<div class="lang_imprint_search_container">
  				<span class="lang_imprint_container">
  					
  					<select class="selectpicker" data-width="fit" id="lang_select">
  					
    					<option data-content='<span class="flag-icon flag-icon-us"></span> EN'>EN</option>
    					<option  data-content='<span class="flag-icon flag-icon-pt"></span> PT'>PT</option>
  						<option  data-content='<span class="flag-icon flag-icon-de"></span> DE'>DE</option>
					</select>
  				
  				</span>
  				<span class="search_input ">
  					<div>
  						<input class="form-control"  id="search_input"type="text" placeholder="Search" aria-label="Search">
					</div>
  				</span>
  				
  			</div>
		</div>
  		</div>
</nav>
  
<div class="container">
  <h3>Collapsible Navbar</h3>
  <p>In this example, the navigation bar is hidden on small screens and replaced by a button in the top right corner (try to re-size this window).
  <p>Only when the button is clicked, the navigation bar will be displayed.</p>
</div>

<script type="text/javascript" src="/app_script/application.js"></script>
 <!-- Bootstrap core JavaScript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<!-- AFTER LOAD SCRIPT -->

<script>
	//$('select').selectpicker();
</script>
</body>
</html>