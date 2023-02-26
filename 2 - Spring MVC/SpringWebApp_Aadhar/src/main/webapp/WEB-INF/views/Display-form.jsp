<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display_Details</title>
</head>
<body>
<h2>ENTERED DETAILS ARE : </h2>
<hr>
<br>
<h3>Name : ${user.username}</h3>
<h3>Password : ${user.userpassword}</h3>
<h3>aadharId : ${user.aadharId}</h3>
<h3>State : ${user.state}</h3>
<h3>Gender : ${user.gender}</h3>
<h3>OtherOptions : ${user.otheroptions}</h3>
<h3>Address : ${user.address}</h3>
<hr>
<a href="home">HOME PAGE</a>
<br>
<a href="DisplayData">DISPLAY ALL THE DATA</a>

</body>
</html>