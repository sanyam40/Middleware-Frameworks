<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aadhar Registration Form</title>
</head>
<body>
	<h2>Aadhar Verification Registration Form</h2>

	<hr>
	<br>
	<form:form action="AddData" method="post" modelAttribute="user">

		<label for="name">User Name</label>
		<form:input type="text" path="username" />
		<br>
		<br>
		<label for="password">Password</label>
		<form:input type="password" path="userpassword" />
		<br>
		<br>
		<label for="id">Aadhar ID</label>
		<form:input type="text" path="aadharId" />
		<br>
		<br>
		<label>Enter State:</label>
		<form:select path="state">
			<form:option value="Delhi" label="Delhi" />
			<form:option value="UP" label="Uttar Pradesh" />
			<form:option value="HR" label="Haryana" />
			<form:option value="MH" label="Maharashtra" />
			<form:option value="PB" label="Punjab" />
		</form:select>
		<br>
		<br>
		<label>Gender: </label>
		Male<form:radiobutton path="Gender" value="Male" />  
        Female<form:radiobutton path="Gender" value="Female" />
		<br>
		<br>
		<label>Other Verification Options: </label>
		PAN<form:checkbox path="otheroptions" value="PAN" />  
        Driving License<form:checkbox path="otheroptions"
			value="Driving License" />  
        Voter Id<form:checkbox path="otheroptions" value="Voter Id" />
		<br>
		<br>

		<label>Address Details</label>
		<br>
		<form:textarea path="address" rows="5" cols="30" />
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