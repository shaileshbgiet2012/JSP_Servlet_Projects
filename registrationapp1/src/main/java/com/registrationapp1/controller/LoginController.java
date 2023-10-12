package com.registrationapp1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registrationapp1.model.DAOService;
import com.registrationapp1.model.DAOServiceImpl;


@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Email = request.getParameter("Email");
	String Password = request.getParameter("Password");
	
	DAOService dao=new DAOServiceImpl();
	dao.connectDB();
	
	boolean status = dao.verifyLogin(Email, Password);
	if(status==true) {
		HttpSession session = request.getSession(true);
		session.setAttribute("Email", Email);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
		rd.forward(request, response);
		
	}else {
		request.setAttribute("error", "Invalid Username/Password");
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
	
	}

}
