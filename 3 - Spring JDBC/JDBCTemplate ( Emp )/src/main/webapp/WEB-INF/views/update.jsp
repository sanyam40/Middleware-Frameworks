<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
<style>
		body {
			background-color: #f2f2f2;
			font-family: Arial, sans-serif;
		}

		.container {
			max-width: 500px;
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
		}

		form {
			display: flex;
			flex-wrap: wrap;
			align-items: center;
		}

		label {
			width: 100%;
			font-weight: bold;
			margin-bottom: 5px;
		}

		input[type=text] {
			width: 100%;
			padding: 10px;
			border: 1px solid #ccc;
			border-radius: 5px;
			margin-bottom: 20px;
			font-size: 16px;
			font-family: inherit;
			color: #333;
			box-sizing: border-box;
		}

		input[type=submit] {
			background-color: #4CAF50;
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			font-size: 16px;
			font-weight: bold;
			margin-left: auto;
		}

		input[type=submit]:hover {
			background-color: #45a049;
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
		.error{
		color:red
		}
	</style>

</head>
<body>
<div class="container">
		<h2>Employee Update Form</h2>
		<hr>
		<form:form action="processUpdate" method="post" modelAttribute="employee">
			<label for="emp_id">empId</label>
			<form:input type="text" path="emp_id" readonly="true"/>
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

			<input type="reset" value="clear" />
		</form:form>
		<hr>
	</div>
</body>
</html>