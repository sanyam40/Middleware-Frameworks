<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display_Details</title>
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
<h2>ENTERED DETAILS ARE : </h2>
<hr>
<br>
<h1>ENTERED DETAILS ARE :</h1>
		<hr>
		<h3>Name : ${user.username}</h3>
		<h3>AadharId : ${user.aadharId}</h3>
		<h3>Email :${user.email}</h3>
		<h3>DOB:${user.dob}</h3>
		<h3>PhnNo:${user.phnno}</h3>
		<h3>State:${user.state}</h3>
		<h3>Gender:${user.gender}</h3>
		<h3>OtherOptions:${user.otheroptions}</h3>
		<h3>AddressDetails:${user.address}</h3>
		<h3>userpassword:${user.userpassword}</h3>
		<br>
		<hr>
<a href="home">HOME PAGE</a>
<br>
<a href="DisplayData">DISPLAY ALL THE DATA</a>

</body>
</html>