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
         setTimeout(function(){
            window.location.href = 'login.jsp';
         }, 3000);
    </script>

	<%
		try {
			session.invalidate(); 
		} catch (IllegalStateException e) {
			
		}
		out.print("<h1>You are now logged out</h1><h6>Page Redirecting in 3 seconds</h6>");
	%>
</body>
</html>