<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<%@page import="com.database.* " %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  .back-img{
     background: url("img/writing-content.jpeg");
     width: 90%;
     height : 80vh;
     background-repeat: no-repeat;
     background-size:cover;
  }
</style>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="all_component/allcss.jsp" %>

</head>
<body>
   <%@include file="all_component/navbar.jsp" %>
   
   <%-- <%
     Connection con = DBConnect.getCon();
   System.out.print(con);
   %> --%>
   <div class="container-fluid back-img">
   <div class="text-center">
        <h1 class="text-white"><i class="fa fa-book mr-1" aria-hidden="true"></i>E Notes-Save Your Notes</h1>
        <a href="login.jsp" class="btn btn-light"><i class="fa fa-user-circle-o mr-1" aria-hidden="true"></i>Login</a>
        <a href="register.jsp" class="btn btn-light"><i class="fa fa-user-plus mr-1" aria-hidden="true"></i>Register</a>
   </div>
   </div>
   
   <%@include file="all_component/footer.jsp" %>
</body>
</html>