<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>My Website</title>
	<style>
		body {
			background-color: #f2f2f2;
			font-family: Arial, sans-serif;
		}

		.container {
			max-width: 800px;
			margin: 0 auto;
			padding: 20px;
			background-color: #fff;
			box-shadow: 0 2px 4px rgba(0,0,0,0.1);
			border-radius: 5px;
		}

		h1 {
			text-align: center;
			font-weight: bold;
			margin-top: 0;
			margin-bottom: 30px;
		}

		h3 {
			font-weight: bold;
			margin-top: 20px;
			margin-bottom: 10px;
		}
		.link {
			display: block;
			margin-top: 20px;
			text-align: center;
			font-size: 14px;
			color: #333;
			text-decoration: none;
		}

		.link:hover {
			color: #4CAF50;
		}
	</style>
</head>
<body>
	<div class="container">
		<h1>ENTERED DETAILS ARE :</h1>
		<hr>
		<h3>Name : ${student.name}</h3>
		<h3>RollNo : ${student.rollno}</h3>
		<h3>PhnNo :${student.phnno}</h3>
		<h3>CourseCode:${student.coursecode}</h3>
		<br>
		<hr>
		<h1>DETAILS ARE SAVED IN DATABASE</h1>
		<a href="home">HOME PAGE</a>
	</div>
</body>
</html>
    