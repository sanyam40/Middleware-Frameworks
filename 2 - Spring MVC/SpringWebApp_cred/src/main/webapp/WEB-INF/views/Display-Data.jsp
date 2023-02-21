<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AADHAR CARD DETAILS</title>
</head>
<body>
	<h1 align="center">AADHAR CARD DETAILS</h1>
	
	<br>
	<div align="center">
	<table border=1>
		<thead>
			<tr>
				<td>Name</td>
				<td>Password</td>
				<td>AadharId</td>
				<td>State</td>
				<td>Gender</td>
				<td>Address</td>
			</tr>
		</thead>

		
		<c:forEach var="User" items="${User}">
			<tr>
				<td>${User.Username }</td>
				<td>${User.Userpassword }</td>
				<td>${User.Gender }</td>
				<td>${User.State }</td>
				<td>${User.AadharId }</td>
				<td>${User.Address }</td>
				<td>
				</td>
			</tr>
		</c:forEach>

	</table> 
	</div>
</body>
</html>