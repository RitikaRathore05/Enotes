package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.PostDAO;
//import com.User.Post;
import com.database.DBConnect;

@WebServlet("/AddNoteServlet")
public class AddNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int uid = Integer.parseInt(req.getParameter("uid"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		
		PostDAO dao = new PostDAO(DBConnect.getCon());
		
		boolean f  = dao.AddNotes(title, content, uid);
		if(f) {
		     System.out.println("success");
		     
		}else {
			System.out.println("not success");
		}
	}

}
