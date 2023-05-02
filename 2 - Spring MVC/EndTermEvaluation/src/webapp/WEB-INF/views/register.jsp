<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aadhar Registration Form</title>
<style>
.error{
 color:red
 }
</style>
</head>
<body>
	<hr>
	<br>
	<form:form action="display" method="post" modelAttribute="user">

		<label for="name">User Name</label>
		<form:input type="text" path="username" placeholder="enter your name"/>
		<form:errors path="username" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="rollno">RollNo</label>
		<form:input type="text" path="rollno" placeholder="enter your rollno"/>
		<form:errors path="rollno" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="email">email</label>
		<form:input type="text" path="email" placeholder="enter your email"/>
		<form:errors path="email" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="password">password</label>
		<form:input type="password" path="password" placeholder="enter your password"/>
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</form:form>
	<br>
	<a href="home">HOME PAGE</a>

</body>

</html>