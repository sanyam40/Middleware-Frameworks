<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MODEL</title>
</head>
<body>
<!-- BELOW CODE IS FOR MODEL USING EXPRESSION TAG-->
<%/*
String name=(String)request.getAttribute("Name");*/
%>
<h1>Hello 
${Name}
<%-- <%=name%> --%>
</h1>

<!-- BELOW CODE IS FOR MODEL&VIEW USING EXPRESSION TAG-->

<%/*
String namee=(String)request.getAttribute("Namee");*/
%>
<h1>Hello 
${Namee}
<%-- <%=name%> --%>
</h1>

<!-- USING JSTL TAG -->
<c:forEach var="item" items="${marks}">
<h1>${item}</h1>
</c:forEach>

<br>
<br>

</body>
</html>