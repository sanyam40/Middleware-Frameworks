<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PRODUCTS DISPLAY</title>
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
      <th>name</th>
      <th>category</th>
      <th>quantity</th>
      <th>description</th>
      <th>price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${list}" varStatus="status" >
    <tr>
    <td>${status.index+1}</td>
      <td>${item.name}</td>
      <td>${item.category}</td>
      <td>${item.quantity}</td>
      <td>${item.description}</td>
      <td>${item.price}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>