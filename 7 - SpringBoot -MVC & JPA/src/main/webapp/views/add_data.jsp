<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Data</title>
</head>
<body>
<form:form action="ProcessForm" method="post" modelAttribute="user">

		<label for="name">Name : </label>
		<form:input type="text" path="name" placeholder="enter your name"/>
		<form:errors path="name" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="phn">Phone No : </label>
		<form:input type="text" path="phn" placeholder="enter your phn"/>
		<form:errors path="phn" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</form:form>
	<br>
	<a href="home">HOME PAGE</a>
	<br>
	<a href="DisplayData">DISPLAY ALL THE DATA</a>
</body>
</html>