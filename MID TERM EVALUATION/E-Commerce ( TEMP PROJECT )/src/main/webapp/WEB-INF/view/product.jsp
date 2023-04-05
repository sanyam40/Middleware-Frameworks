<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>ADD-PRODUCT</title>
</head>
<style>
.error{
		color:red
		}
</style>
<body>
	<div class="container">
		<h1>ADD-PRODUCT</h1>
		
		<form:form action="product" method="post" modelAttribute="product">
		
		<label for="name">Product Name</label>
		<form:input type="text" path="name" />
		<form:errors path="name" cssClass="error"/>
		<br>
		<br>
		<label for="category">Product Category</label>
		<form:input type="text" path="category" />
		<form:errors path="category" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="quantity">Product quantity</label>
		<form:input type="text" path="quantity" />
		<form:errors path="quantity" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="description">Product description</label>
		<form:input type="text" path="description" />
		<form:errors path="description" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="price">Product price</label>
		<form:input type="text" path="price" />
		<form:errors path="price" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="Add-Product" />
		<input type="reset" value="clear" />
	</form:form>
	<br>
	<br>
	</div>
</body>
</html>