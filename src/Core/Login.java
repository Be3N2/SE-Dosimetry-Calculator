package Core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * Check username and password against database 
		 * (Right now just using an example array)
		 */
		String username = request.getParameter("username");
		String password = request.getParameter("password");
			
		if (username.equals("Admin") && password.equals("1234")) {
			/* Sessions are better than cookies as they hide sensitive information
			Cookie userCookie = new Cookie(username, String.valueOf(ID));
			response.addCookie(userCookie);
			response.sendRedirect("create.html");
			*/
			HttpSession session = request.getSession();  
	        session.setAttribute("name",username);  
	        response.sendRedirect("create.jsp");
		} else {
			response.setHeader("Failed", "Bad Username or Password");
			response.sendRedirect("login.jsp");
		}
		
		
	}

}
