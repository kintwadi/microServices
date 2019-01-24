<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<c:set var="context" value="${pageContext.request.contextPath}" />

<link href="/app_css/application.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
 <script src="/app_script/jquery.twbsPagination.js" type="text/javascript"></script>
    <!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.7.0/css/mdb.min.css" rel="stylesheet"> 

</head>
<body >
<div class="container"> 
	<nav class="navbar  navbar-default navbar-fixed-top" > 
	
	<span id="brand" class="" style="float: left; border-radius: 5px; margin-top: 5px;"></span>
	
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand" href="#" id="brand" style="float: left">Brand</a>  -->
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="navbar-collapse-1">

			<ul class="nav navbar-nav navbar-right">
				<li><a class="btn btn-default btn-outline btn-circle collapsed"
					data-toggle="collapse" href="#nav-collapse1" aria-expanded="false"
					aria-controls="nav-collapse1" id="categories">Categories</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-earphone"
						id="contact"></span></a></li>
				<li><a href="#" id="facebook"><span
						class="fa fa-facebook-square"></span></a></li>
				<li><a href="#" id="tweeter"><span
						class="fa fa-twitter-square"></span></a></li>
				<li><a href="#" id="instagram"><span
						class="fa fa-instagram"></span></a></li>
				<li><a href="#" id="youtube"><span class="fa fa-youtube"></span></a></li>
				<li><a href="#"><span id="signup"
						class="glyphicon glyphicon-user"></span> </a></li>
				<li><a href="#"><span id="login"
						class="glyphicon glyphicon-log-in"></span> </a></li>

			</ul>
			<ul class="collapse nav navbar-nav nav-collapse navbar-right"
				id="nav-collapse1">

			</ul>

		</div>
		<!-- /.navbar-collapse -->

	</div>
	<!-- /.container --> </nav>
	<!-- /.navbar -->
	
<br><br><br>
<div class="search">

	 <div class="col-lg-10  ">
    <div class="input-group ">
      <input type="text" class="form-control" aria-label=" search..." placeholder="search...">
      <span class="input-group-addon">
        <span class="fa fa-search  " ></span>
      </span>
    </div><!-- /input-group -->
  </div><!-- /.col-lg-6 -->
</div><!-- /.row -->

</div>


<br><br>
	<div class="container text-center">

		<section class="intro">
		<div class="left">

			<div id="big_card">

				<a href="#" target="_blank"></a>
				<div id="big_card_caption" class=" ">

					<div class="card well  " style="width: 18rem;">

						<span class="" id="big_card_title"> </span>

						<div class="card-body ">

							<div class="card-text">

								<h1 id="big_card_day"></h1>

								<h2 class="" id="big_card_month"></h2>
								<span class="" id="big_card_year"></span>
							</div>

						</div>
					</div>
					<div class="big_card_more_info btn btn-info">
						<span id="big_card_price"></span> &nbsp;&nbsp;<i
							class="fa fa-shopping-cart btn btn-success"> add to cart</i>

					</div>
					<span class="btn btn-danger"
						style="float: right; border-radius: 45px;">+</span>
				</div>
			</div>

		</div>

		 <div class="slider">
        <ul>
          <li style="background-image:url(https://images.unsplash.com/photo-1458640904116-093b74971de9?crop=entropy&fit=crop&fm=jpg&h=675&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1375)">
            <div class="center-y">
              <h3>Slider Title #1</h3>
              <a href="#">View Project</a>	
            </div>
          </li>
          <li style="background-image:url(https://images.unsplash.com/photo-1451906278231-17b8ff0a8880?crop=entropy&fit=crop&fm=jpg&h=675&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1375)">
            <div class="center-y">
              <h3>Slider Title #2</h3>
              <a href="#">View Project</a>	
            </div>
          </li>
          <li style="background-image:url(https://images.unsplash.com/photo-1456428199391-a3b1cb5e93ab?crop=entropy&fit=crop&fm=jpg&h=675&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1375)">
            <div class="center-y">
              <h3>Slider Title #3</h3>
              <a href="#">View Project</a>	
            </div>
          </li>
        </ul>

        <ul>
          <nav>
            <a href="#"></a>
            <a href="#"></a>
            <a href="#"></a>
          </nav>
        </ul>
      </div>
		</section>
		<br>
	
	<!-- AFTER LOAD SCRIPT -->
	<script type="text/javascript" src="/app_script/application.js"></script>
	</div>
</body>
</html>