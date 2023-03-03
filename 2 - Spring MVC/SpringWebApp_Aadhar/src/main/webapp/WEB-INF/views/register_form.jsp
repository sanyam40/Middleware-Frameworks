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
	<h2>Aadhar Verification Registration Form</h2>

	<hr>
	<br>
	<form:form action="display" method="post" modelAttribute="user">

		<label for="name">User Name</label>
		<form:input type="text" path="username" placeholder="enter your name"/>
		<form:errors path="username" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="aadharId">AadharId</label>
		<form:input type="text" path="aadharId" placeholder="enter your AadharId"/>
		<form:errors path="aadharId" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="email">email</label>
		<form:input type="text" path="email" placeholder="enter your email"/>
		<form:errors path="email" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="dob">DOB</label>
		<form:input type="date" path="dob" />
		<form:errors path="dob" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="phnno">PhnNo</label>
		<form:input type="text" path="phnno" />
		<form:errors path="phnno" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Enter State:</label>
		<form:select path="state">
			<form:option value="Delhi" label="Delhi" />
			<form:option value="UP" label="Uttar Pradesh" />
			<form:option value="HR" label="Haryana" />
			<form:option value="MH" label="Maharashtra" />
			<form:option value="PB" label="Punjab" />
			<form:errors path="state" cssClass="error"></form:errors>
		</form:select>
		<br>
		<br>
		<label>Gender: </label>
		Male<form:radiobutton path="Gender" value="Male" />  
        Female<form:radiobutton path="Gender" value="Female" />
        <form:errors path="Gender" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Other Verification Options: </label>
		PAN<form:checkbox path="otheroptions" value="PAN" />  
        Driving License<form:checkbox path="otheroptions"
			value="Driving License" />  
        Voter Id
        <form:errors path="otheroptions" cssClass="error"></form:errors>
        <form:checkbox path="otheroptions" value="Voter Id" />
		<br>
		<br>

		<label>Address Details</label>
		<br>
		<form:textarea path="address" rows="5" cols="30" />
		<br>
		<br>
		<br>
		<label for="userpassword">UserPassword</label>
		<form:input type="text" path="userpassword" placeholder="enter your Password"/>
		<form:errors path="userpassword" cssClass="error"></form:errors>
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