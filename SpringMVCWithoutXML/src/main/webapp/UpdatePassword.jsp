<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form
{
background: lime;
border-radius: 20px;
width: 300px;
}
.in
{
border: 7px 10px 5px 15px;
height: 27px;
width:250px; 
}
#sub
{
width: 120px;
height: 25px;
background: pink;
}
</style>
</head>
<body>
	<center>
		<form action="update">
			<h1>Update Form</h1>
			<input placeholder="Enter Email Or Mobile" class="in" name="Email">
			<br><br>
			<input placeholder="Enter Password" class="in" name="Password">
			<br><br>
			<input placeholder="Re-Enter Password" class="in" name="Password">
			<br><br>
			<input type="submit" id="sub">
		</form>
		${msg}
	</center>
</body>
</html>