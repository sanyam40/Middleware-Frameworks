<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Input Form</title>
</head>
<body>
<div align="center">

		<h2>Employee Input Form</h2>
		<br>
		<hr>

		<form:form action="processForm" method="post" modelAttribute="employee">

			<label for="emp_id">Employee ID</label>
			<form:input type="text" path="emp_id" />
			<br>
			<br>

			<label for="emp_name">Employee Name</label>
			<form:input type="text" path="emp_name" />
			<br>
			<br>
			
			<label for="emp_salary">Employee Salary</label>
			<form:input type="text" path="emp_salary" />
			<br>
			<br>

			<label for="emp_address">Employee Address</label>
			<br>
			<form:textarea path="emp_address" rows="5" cols="30" />
			<br>
			<br>

			<input type="submit" value="submit" />

		</form:form>
		<hr>

	</div>
</body>
</html>