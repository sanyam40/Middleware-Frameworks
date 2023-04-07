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
		<h4>Please login to continue or if you are a new user kindly Sign Up by pressing the button below</h4>
		
		<form action="new-register">
         <button type="submit">Sign Up</button>
         </form>
		<br>
		
		<a href="sellerLoginForm">FOR SELLER LOGIN</a>
		<br>
		<br>
		<a href="customerLoginForm">FOR CUSTOMER LOGIN</a>
		<br>
		<br>
	</div>
</body>
</html>