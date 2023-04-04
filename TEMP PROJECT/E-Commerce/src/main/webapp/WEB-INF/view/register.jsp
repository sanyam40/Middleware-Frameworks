<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>REGISTRATION</title>
</head>
<style>
.error{
		color:red
		}
</style>
<body>
	<div class="container">
		<h1>Registration Page</h1>
		
		<form:form action="add-user" method="post" modelAttribute="user">
		
		<label for="firstname">First Name</label>
		<form:input type="text" path="firstname" />
		<form:errors path="firstname" cssClass="error"/>
		<br>
		<br>
		<label for="lastname">Last Name</label>
		<form:input type="text" path="lastname" />
		<form:errors path="lastname" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="username">UserName</label>
		<form:input type="text" path="username" />
		<form:errors path="username" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="password">password</label>
		<form:input type="password" path="password" />
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="emailId">EmailId</label>
		<form:input type="text" path="emailId" />
		<form:errors path="emailId" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="usertype">usertype</label>
		<select name="usertype" id="usertype">
		<option value="seller">Seller</option>
		<option value="customer">Customer</option>
		</select>
		<br>
		<br>
		<input type="submit" value="Register" />
		<input type="reset" value="clear" />
	</form:form>
	<br>
	<br>
	</div>
</body>
</html>