package com.rohith;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		req.setAttribute("name", name);
		
		// Using Request Dispatcher forwarded the data to privacy servlet with the help of set attribute
		RequestDispatcher rd = req.getRequestDispatcher("secret");// secret is initially set at deployment descriptor and then used it here.
		rd.forward(req, res);
	}

}
