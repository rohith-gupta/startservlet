package com.rohith;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class PrivacyServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name = req.getAttribute("name").toString();
		
//		PrintWriter out = res.getWriter();
//		
//		out.println("Shhh.... Please dont share your password "+ name);
		
		String pass = "nothing";
		HttpSession session = req.getSession();
		
		
		session.setAttribute("name", name);
		
		res.sendRedirect("Redirect");
	}

}
