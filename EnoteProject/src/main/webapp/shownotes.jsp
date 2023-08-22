<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.DAO.*" %>
    <%@page import="com.database.*" %>
    <%@page import ="java.util.*" %>
    
    <%
      UserDetails user3 = (UserDetails)session.getAttribute("userD");     
     if(user3 == null){
    	 response.sendRedirect("login.jsp");
    	 session.setAttribute("Login-error", "Please Login ....");
     }
       
   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Notes</title>
<%@include file="all_component/allcss.jsp" %>
</head>
<body>
<%@include file="all_component/navbar.jsp" %>

      <div class="container">
         <h2 class="text-center">All Notes:</h2>
         
         <div class="row">
           <div class="col-md-12">
				<%
				if (user3 != null) {
					PostDAO ob = new PostDAO(DBConnect.getCon());
					List<Post> post = ob.getData(user3.getId());

					for (Post po : post) {
				%>
				
                
				<%
				}
				}
				%>

               <div class="card mt-3">
					<img alt="" src="img/hand.jpeg" class="card-img-top mt-4 mx-auto"
						style="max-width: 200px;">

					<div class="card-body p-4">
						<h5 class="card-title">What is Java</h5>
						<p>Java is plateform independent lang.</p>

						<p>
							<b class="text-success">Published By:</b><br>
							<b class="text-primary"></b>
						</p>

						<p>
							<b class="text-success">Published Date:</b><br>
							<b class="text-Success"></b>
						</p>

						<div class="container text-center mt-2">
							<a href="" class="btn btn-danger">Delete</a> <a href=""
								class="btn btn-success">Edit</a>
						</div>
					</div>
				</div>
			</div>
         </div>
      </div>
	
</body>
</html>