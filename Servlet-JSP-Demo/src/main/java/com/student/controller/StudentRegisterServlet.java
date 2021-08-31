package com.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDao;
import com.student.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentRegisterServlet")
public class StudentRegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student = new Student();
		
		student.setFname(request.getParameter("fname"));
		student.setLname(request.getParameter("lname"));
		student.setEmail(request.getParameter("email"));
		student.setPasword(request.getParameter("password"));
		student.setContact(request.getParameter("contact"));
		
		System.out.println(student.toString());
		
	}
}