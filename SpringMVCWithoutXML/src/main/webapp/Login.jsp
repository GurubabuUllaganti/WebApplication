<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
form
{
background: aqua;
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
.acn
{
text-decoration: none;
}
</style>
</head>
<body>
	<center>
		<form action="select">
			<h1>Login Form</h1>
			<input placeholder="Enter Email or mobile" class="in" name="Email">
			<br><br>
			<input placeholder="PassWord"  class="in" name="Password">
			<br><br>
			<a href="Details.jsp" class="acn">Create Account</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="UpdatePassword.jsp" class="acn">Forgot Password</a>
			<br><br>
			<input type="submit" id="sub">
		</form>
		${mssg}
	</center>
</body>
</html>