package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import net.javaguides.registration.model.Employee;

public class update {
	public void register(String name,String email,String country,String age, String dob,String gender,String id) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "rahul9115");
	        Statement s = connection.createStatement();
	        s.executeQuery("update register "
	        		+ "set id="+id+","
	        		+ "set name="+name+","
	        		+ "set email="+email+","
	        		+ "set country="+country+","
	        		+ "set age="+age+","
	        		+ "set DOB="+dob+","
	        		+ "set gender="+gender+
	        		"where id="+id+";"
	        		);
	}
}
