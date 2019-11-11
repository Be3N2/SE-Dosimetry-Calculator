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
				//HttpSession session = request.getSession(false);
				if (session != null && session.getAttribute("name") != null) {
					out.print("<li>| Welcome " + session.getAttribute("name") + "</li>");
				
				} else {
					response.sendRedirect("redirect.html");
				}
				%>
				<li><a href="create.html">Create</a></li>
				<li>Update</li>
				<li><a href="treatment.jsp">View</a></li>
			</ul>
		</div>
	</header>
	
</body>
</html>