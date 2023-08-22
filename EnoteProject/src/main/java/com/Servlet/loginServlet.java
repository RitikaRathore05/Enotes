package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAO;
import com.User.UserDetails;
import com.database.DBConnect;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("uemail");
		String password = req.getParameter("upassword");
		
		UserDetails us = new UserDetails();
		us.setEmail(email);
		us.setPassword(password);
		
		UserDAO dao = new UserDAO(DBConnect.getCon());
		UserDetails user = dao.loginUser(us);
		if(user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("userD", user);
			resp.sendRedirect("Home.jsp");
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("login-fail", "Invalid userName and Password");
		    resp.sendRedirect("login.jsp");
		}
		
	}

	
}
