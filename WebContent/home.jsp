<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Dosimetry Calculator</title>

<link rel="stylesheet" href="css/head.css">
</head>
<body>
	<header>	
		<div class="navBar">
			<h3 class="header">Dosimetry Calculator Project</h3>
			
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
				<li>Update</li>
				<li>View</li>
			</ul>
		</div>
	</header>
	
</body>
</html>