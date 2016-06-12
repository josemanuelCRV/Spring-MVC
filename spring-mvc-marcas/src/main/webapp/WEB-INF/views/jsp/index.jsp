<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring 3 MVC Simple</title>
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css"
	var="bootstrapCss" />
<spring:url value="/resources/core/images/favicon.png" var="favicon" />

<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
<link rel="shortcut icon" href="${favicon}" />
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring 3 MVC - Buscador Marcas</a>
			</div>
		</div>
	</nav>

	<div class="jumbotron">
		<div class="container">
			<h1>${title}</h1>


			<div>
   				
				<form method="POST" action="CarForm">
		            Marca:<br> <br><input type="text" name="marca"/><br>
		            
		          <hr>     
		            <input type="submit" value="Enviar">
		            
		            
		        </form>  
				

				
			</div>



			<spring:url value="/resources/core/css/hello.js" var="coreJs" />
			<spring:url value="/resources/core/css/bootstrap.min.js"
				var="bootstrapJs" />

			<script src="${coreJs}"></script>
			<script src="${bootstrapJs}"></script>
			<script
				src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>