<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Employee Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>Name</td>
     <td><input type="text" name="Name" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    <tr>
     <td>Country</td>
     <td><input type="text" name="Country" /></td>
    </tr>
    <tr>
     <td>Age</td>
     <td><input type="number" name="Age" /></td>
    </tr>
    <tr>
     <td>Date of Birth</td>
     <td><input type="text" name="DOB" /></td>
    </tr>
    <tr>
     <td>Gender</td>
     <td><input type="text" name="Gender" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
  <div>
  <a href="display.jsp">View Users</a>
  </div>
 </div>
</body>
</html>