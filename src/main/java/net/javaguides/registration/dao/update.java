package net.javaguides.registration.dao;

import java.sql.*;
import net.javaguides.registration.model.Employee;

public class update {
	public void register(String name,String email,String country,String age, String dob,String gender,String id) throws ClassNotFoundException, SQLException {
		System.out.println("inner1"+id); 
		Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "rahul9115");
	        Statement s = connection.createStatement();
	        System.out.println("update register \n"
	        		+ "set id="+id+","+ "name= '"+name+"'," + " email='"+email+"',"+ " country='"+country+"',"+ " age='"+age+"',"+" DOB='"+dob+"',"+ " gender='"+gender+"'\n"+"where id="+id+";");
	        s.executeUpdate("update register \n"
	        		+ "set id="+id+","+ "name= '"+name+"'," + " email='"+email+"',"+ " country='"+country+"',"+ " age='"+age+"',"+" DOB='"+dob+"',"+ " gender='"+gender+"'\n"+"where id="+id+";");
	}
}
