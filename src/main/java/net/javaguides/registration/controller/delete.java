package net.javaguides.registration.controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import net.javaguides.registration.dao.delete1;
import net.javaguides.registration.model.Employee;
import java.sql.*;

@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private delete1 del;
	public delete() {
		del=new delete1();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String id = request.getParameter("user");
		System.out.println("This"+id);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("id", id);
		
		try {
        	
			del.register(id);
			RequestDispatcher dispatcher =request.getRequestDispatcher("/display.jsp");
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("inner");
			e.printStackTrace();
		}
		
		
	}
	public void update(String name,String email,String country,String age, String dob,String gender,String id)throws SQLException,ClassNotFoundException {
		
		
	}
	
}

