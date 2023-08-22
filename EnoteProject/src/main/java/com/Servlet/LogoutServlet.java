package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          try {
        	  
        	  HttpSession session = req.getSession();
        	  session.removeAttribute("userD");
        	  
        	  HttpSession session2 =req.getSession();
        	  session.setAttribute("logoutMsg", "Logout SuccessFully");
        	  resp.sendRedirect("login.jsp");
          }catch(Exception e) {
        	  e.printStackTrace();
          }
	}
	
	

}
