<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL THE DATA IN DATABSE</title>
<style type="text/css">
.styled-table {
  border-collapse: collapse;
  margin: 25px 0;
  font-size: 0.9em;
  font-family: sans-serif;
  min-width: 400px;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.styled-table thead tr {
  background-color: #009879;
  color: #ffffff;
  text-align: left;
}

.styled-table th,
.styled-table td {
  padding: 12px 15px;
}

.styled-table tbody tr {
  border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
  background-color: #f3f3f3;
}

.styled-table tbody tr:last-of-type {
  border-bottom: 2px solid #009879;
}

</style>
</head>
<body>

<table class="styled-table">
  <thead>
    <tr>
    <th>Sno</th>
      <th>Name</th>
      <th>RollNo</th>
      <th>PhnNo</th>
      <th>CourseCode</th>
      <th>Operation</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${list}" varStatus="status">
    <tr>
    <td>${status.index+1}</td>
      <td>${item.name}</td>
      <td>${item.rollno}</td>
      <td>${item.phnno}</td>
      <td>${item.coursecode}</td>
      <td>
      <a href="updateForm?rollno=${item.rollno}">Edit</a>
      <a href="deleteStudent?rollno=${item.rollno}">Delete</a>
      </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>