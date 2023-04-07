<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>NCU-STORE</title>
</head>
<style>
.error{
		color:red
		}
</style>
<body>
	<div class="container">
	<form:form action="home">
	<input type="submit" value="Go Back"/>
	</form:form>
		<h1>Seller Login Page</h1>     
		<br>
		<form:form action="sellerLogin" method="post" modelAttribute="user">
		
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
	<br>
	</div>
</body>
</html>