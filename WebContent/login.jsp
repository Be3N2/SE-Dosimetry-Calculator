<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome, Please Log In</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
	<form method="post" action="/Dosimetry_Calculator/Login" class="loginForm">
		<h3>Dosimetry Calculator</h3>
		<h4>Log in </h4>
		<div class="field">
		<%
			String str[] = request.getHeader("referer").split("/");
			if (str[4].compareTo("login.jsp") == 0) {
				out.print("<h5 style='color: red; margin: 0px;'>Bad username or password</h5>");
			}
		%><label>Username: </label>
		<input type="text" name="username" placeholder="Username"/> <br/></div>
		<div class="field"><label>Password: </label>
		<input type="password" name="password" placeholder="Password"/> <br/></div>
		<div class="submit">
			<button type="submit">Submit</button>
		</div>
	</form>
	
</body>
</html>