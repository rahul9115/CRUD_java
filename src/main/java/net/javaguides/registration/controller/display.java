package net.javaguides.registration.controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import net.javaguides.registration.dao.EmployeeDao;
import net.javaguides.registration.model.Employee;

@WebServlet("/udpate")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher =request.getRequestDispatcher("/udpate.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String country = request.getParameter("Country");
        String age = request.getParameter("Age");
        String dob = request.getParameter("DOB");
        String gender = request.getParameter("Gender");

        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setAge(age);
        employee.setDob(dob);
        employee.setGender(gender);
        

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        RequestDispatcher dispatcher =request.getRequestDispatcher("/display.jsp");
        dispatcher.forward(request, response);
        //response.sendRedirect("employeedetails.jsp");
    }
}

