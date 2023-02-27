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
<p>
/* --> SENDING DATA FROM CONTROLLER TO VIEW<br>
	       METHOD 1 : MODEL <br>
	       METHOD 2 : MODELANDVIEW<br>
	*/<br>
	<br>
	@RequestMapping(value="/Model")<br>
	public String Model(Model model) {<br>
		model.addAttribute("Name","SANYAM");<br>
		return"Model";<br>
	}<br>
	<br>
	@RequestMapping(value="/Model-View")<br>
	public ModelAndView Model_View() {<br>
		ModelAndView modelandview=new ModelAndView();<br>
		<br>
		modelandview.addObject("Namee", "SANYAM NARANG");<br>
		List<Integer> list=new ArrayList<Integer>();<br>
		list.add(45);<br>
		list.add(89);<br>
		
		modelandview.addObject("marks", list);<br>
		<br>
		// TO SET THE JSP PAGE<br>
		modelandview.setViewName("Model");<br>
		<br>
		return modelandview;<br>
		</p>

</body>
</html>