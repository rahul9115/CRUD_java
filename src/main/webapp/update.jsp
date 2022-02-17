<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "rahul9115");
Statement s = connection.createStatement();
ResultSet rs = s.executeQuery("SELECT * FROM register");
%>
<% while(rs.next()){ %>
 <div align="center">
  <h1>Employee Register Form</h1>
  <form action="<%= request.getContextPath() %>/update" method="post">
   <table style="with: 80%">
    <tr>
     <td>Name</td>
     <td><input type="text" value="<%=rs.getString(1) %>>" name="Name" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" value="<%=rs.getString(2) %>>" name="Email" /></td>
    </tr>
    <tr>
     <td>Country</td>
     <td><input type="text" value="<%=rs.getString(3) %>>" name="Country" /></td>
    </tr>
    <tr>
     <td>Age</td>
     <td><input type="number" value="<%=rs.getString(4) %>>" name="Age" /></td>
    </tr>
    <tr>
     <td>Date of Birth</td>
     <td><input type="text" value="<%=rs.getString(5) %>>" name="DOB" /></td>
    </tr>
    <tr>
     <td>Gender</td>
     <td><input type="text" value="<%=rs.getString(6) %>>" name="Gender" /></td>
    </tr>
   </table>
   <input type="submit" value="U" />
  </form>
  <% } %>
 </div>
</body>
</html>
</html>