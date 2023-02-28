<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display_Details</title>
<style 
table {
  border-collapse: collapse;
  width: 100%;
  font-family: Arial, sans-serif;
  font-size: 14px;
}

th, td {
  border: 1px solid #ccc;
  padding: 10px;
  text-align: left;
}

th {
  background-color: #f2f2f2;
}
></style>
</head>
<body>
<h2>ENTERED DETAILS ARE : </h2>
<hr>
<br>
<table>
<tr>
<th>Name</th>
<th>UserPassword</th>
<th>AaadharId</th>
<th>State</th>
<th>Gender</th>
<th>State</th>
<th>OtherOptions</th>
<th>ddress</th>
</tr>
<tr>
<td>${user.username}</td>
<td>${user.userpassword}</td>
<td>${user.aadharId}</td>
<td>${user.state}</td>
<td>${user.gender}</td>
<td>${user.state}</td>
<td>${user.otheroptions}</td>
<td>${user.address}</td>
</tr>
</table>
<a href="home">HOME PAGE</a>
<br>
<a href="DisplayData">DISPLAY ALL THE DATA</a>

</body>
</html>