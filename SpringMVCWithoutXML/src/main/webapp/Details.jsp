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
background: lightblue;
border: 1px solid black; 
width: 350px;
border-radius: 17px;
}
.input1
{
	border-radius:30px;
	width: 300px;
	height: 35px;
	border-collapse: collapse;
}
#submit
{
background: orange;
width: 200px;
height: 30px;
}
</style>
</head>
<body>
	<center>
		<form action="inObject">
		    <h1>Registration Form</h1>
			<input placeholder="Enter Your Name" name="FristName" class="input1">
			<br><br>
			<input placeholder="Enter last Name" name="LastName" class="input1">
			 <br><br>
			 <input placeholder="Enter DateOfBirth" name="DateOfBirth" class="input1">
			 <br><br>
			 <input placeholder="Enter Address" name="Address" class="input1">
			 <br><br> <input placeholder="Enter Your Email" name="Email" class="input1">
			<br><br>
			<input placeholder="Enter Your Mobile Number" name="MobileNum" class="input1"> 
			<br><br>
			<input placeholder="Enter User Name" name="UserName" class="input1"> 
			<br><br>
			<input placeholder="password" type="password" class="input1" name="Password">
			<br><br>
			<label>Gender :-</label>
			<input type="radio" name="radio" value="Male"><label>Male</label>
			<input type="radio" name="radio" value="Female"><label>Female</label>
			<br><br>
			<label>Select Course : </label>
			<select name="options">
			<option>Select</option>
			<option value="Java">Java</option>
			<option value="Core JAva">Core Java</option>
			<option value="HTML">HTML</option>
			<option value="CSS">CSS</option>
			<option value="JavaScript">JavaScript</option>
			</select>
			 <br><br> <input type="submit" id="submit">
		</form>
		 ${msg}
	</center>
	   
</body>
</html>