<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Dosimetry Calculator</title>

<link rel="stylesheet" href="css/head.css">
<link rel="stylesheet" href="css/lookup.css">
</head>
<body>
	<header>	
		<div class="navBar">
			<h3 class="header">View Patient</h3>
			
			<ul class="navigation">
				<%
				//if logged in display username and logout button
				if (session != null && session.getAttribute("name") != null) {
					out.print("<li><a href='logout.jsp'>Log out</a></li>");
					out.print("<li>| " + session.getAttribute("name") + "</li>");
				} else {
					//redirect to login page otherwise
					response.sendRedirect("login.jsp");
				}
				%>
				<li><a href="create.jsp">Create</a></li>
				<li><a href="Update.jsp">Update</a></li>
				<li>View</li>
			</ul>
		</div>
	</header>
	<form class="lookupForm" method="post" action="/Dosimetry_Calculator/Lookup">
		<div class="field"><label>Patient ID: </label>
		<input type="text" name="ID" placeholder="123456" required/> <br/></div>
		
		<div class="submit">
			<button type="submit">Submit</button>
		</div>
	</form>
</body>
</html>