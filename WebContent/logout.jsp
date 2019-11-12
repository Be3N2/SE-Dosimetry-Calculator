<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Redirect Page</title>

</head>
<body style="text-align: center;">
	<script>
		//forward user to log in page
         setTimeout(function(){
            window.location.href = 'login.jsp';
         }, 3000);
    </script>

	<%
		//delete user session
		try {
			session.invalidate(); 
		} catch (IllegalStateException e) {
			
		}
		//output redirect message after session is deleted
		out.print("<h1>You are now logged out</h1><h6>Page Redirecting in 3 seconds</h6>");
	%>
</body>
</html>