package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.DAO.UserDAO;
import com.User.UserDetails;
import com.database.DBConnect;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
	  String name = req.getParameter("fname");
	  String email = req.getParameter("uemail");
	  String password = req.getParameter("upassword");
	  
	  UserDetails us = new UserDetails();
	  us.setName(name);
	  us.setEmail(email);
	  us.setPassword(password);
	  
	  UserDAO dao = new UserDAO(DBConnect.getCon());
	  boolean f=dao.addUser(us);
	  HttpSession session;
	  
	  if(f) {
		session = req.getSession();
		session.setAttribute("reg-success", "Registration Successfully...");
		resp.sendRedirect("register.jsp");
	  }else {
		 session = req.getSession() ;
		 session.setAttribute("failed-msg", "Something went wrong on server");
		 resp.sendRedirect("register.jsp");
	  }
   }
}
