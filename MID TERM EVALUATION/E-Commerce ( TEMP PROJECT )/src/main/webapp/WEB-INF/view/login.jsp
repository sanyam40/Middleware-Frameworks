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
		<h1 align="center">Welcome To NCU Store</h1>
		<h2 align="center">Place where u can buy diiferent things for yourself for others</h2>
		<br>
		<h4>Please login to comtinue or if you are a new user kindly Sign Up by pressing the button below</h4>
		
		<form action="new-register">
         <button type="submit">Sign Up</button>
         </form>
         
		<br>
		<br>
		<br>
		<form:form action="login" method="post" modelAttribute="user">
		
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