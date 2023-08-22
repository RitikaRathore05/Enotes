package com.DAO;

import java.sql.*;
import java.util.*;
import com.User.*;
public class PostDAO {
     
	private Connection con;

	

	public PostDAO(Connection con) {
		super();
		this.con = con;
	}



	public boolean AddNotes(String ti,String co,int ui) {
		boolean f = false;
		try {
			String query = "insert into post(title,content,uid) values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, ti );
			ps.setString(2, co);
			ps.setInt(3, ui);
			
			int i = ps.executeUpdate();
			
			if(i==1) {
			   	f = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	
	public List<Post> getData(int id){
	  List<Post> list= new ArrayList<Post>();
	  Post po = new Post();
	  
	  try {
		  
		  String query = "select*from post where id=?";
		  PreparedStatement ps = con.prepareStatement(query);
		  
		  ps.setInt(1, id);
		  
		  ResultSet rs = ps.executeQuery();
		  
		  while(rs.next()) {
			  po.setId(rs.getInt(1));
			  po.setTitle(rs.getString(2));
			  po.setContent(rs.getString(3));
			  po.setPdate(rs.getDate(4));
			  list.add(po);
		  }
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  return list;
	}
	
}
