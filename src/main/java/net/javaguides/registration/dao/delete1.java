package net.javaguides.registration.dao;

import java.sql.*;


public class delete1 {
	public void register(String id) throws ClassNotFoundException, SQLException {
		System.out.println("inner1"+id); 
		Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "rahul9115");
	        Statement s = connection.createStatement();
	        
	        s.executeUpdate("Delete from register where id="+id);
 }
}
