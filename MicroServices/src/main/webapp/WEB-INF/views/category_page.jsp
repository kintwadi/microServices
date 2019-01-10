<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title >Category</title>

<c:set var="context" value="${pageContext.request.contextPath}"/>
<%@ include file="header.jsp" %>
</head>

<body >

<h5>${page}</h5>


<script>
function updateCategoryLinks(lang){


	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange=function() {
		  
	    if (this.readyState == 4 && this.status == 200) {
	    	
	      var categories = JSON.parse(this.responseText);
	      
	      var category_container = document.getElementById("category_container");
	      console.log("category_container before:"+category_container.innerHTML);
	      category_container.innerHTML = "";
	     
	      for(var i = 0; i< categories.length; i++ ){
	    	
	    	  var li = document.createElement("li");
	    	  var a = document.createElement("a");
		      a.param = categories;
		      a.innerHTML = categories[i]["name"].toUpperCase();
		      a.setAttribute('href',categories[i]["page"]);
		     a.setAttribute('class',"category");
		     a.setAttribute('id',"category"+i);
		     
		      li.appendChild(a);
		      category_container.appendChild(li);
		      
	      }
	      console.log("category_container after:"+category_container.innerHTML);
	   
	    }
	  };
	  xhttp.open("GET", "list_categories/"+lang, true);
	  xhttp.send();
	
	
}

updateCategoryLinks("en");


</script>

</body>
</html>