package net.javaguides.registration.controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import net.javaguides.registration.dao.update;
import net.javaguides.registration.model.Employee;
import java.sql.*;

@WebServlet("/update")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private update up;
	public display() {
		up=new update();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String id = request.getParameter("user");
		System.out.println("This"+id);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("id", id);
		RequestDispatcher dispatcher =request.getRequestDispatcher("/update.jsp");
		
		dispatcher.forward(request, response);
	}
	public void update(String name,String email,String country,String age, String dob,String gender,String id)throws SQLException,ClassNotFoundException {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String country = request.getParameter("Country");
        String age = request.getParameter("Age");
        String dob = request.getParameter("DOB");
        String gender = request.getParameter("Gender");
        String id = request.getParameter("user");
       
        try {
        	
			up.register(name,email,country,age,dob,gender,id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("inner");
			e.printStackTrace();
		}
       
        
        	
        

        
        RequestDispatcher dispatcher =request.getRequestDispatcher("/display.jsp");
        dispatcher.forward(request, response);
        //response.sendRedirect("employeedetails.jsp");
    }
}

