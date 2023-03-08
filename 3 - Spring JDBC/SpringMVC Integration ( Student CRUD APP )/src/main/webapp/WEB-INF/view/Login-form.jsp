<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin-Login</title>
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
		<h1>Admin Login</h1>
		<form:form action="login" method="post" modelAttribute="Admin">
		<label for="username">username</label>
		<form:input type="text" path="username" />
		<form:errors path="username" cssClass="error"/>
		<br>
		<br>
		<label for="password">password</label>
		<form:input type="password" path="password" />
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="Login" />
		<input type="reset" value="clear" />
	</form:form>
	<br>
	<a href="home">HOME PAGE</a>
	<br>
	</div>
</body>
</html>
