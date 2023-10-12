package com.registrationapp1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrationapp1.model.DAOService;
import com.registrationapp1.model.DAOServiceImpl;
@WebServlet("/saveReg")
public class SaveRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SaveRegistration() {
        super();
    }
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("Name");
		String City = request.getParameter("City");
		String Email = request.getParameter("Email");
		String Mobile = request.getParameter("Mobile");
		
		DAOService dao= new DAOServiceImpl();
		dao.connectDB();
		dao.SaveRegistration(Name, City, Email, Mobile);
		
		request.setAttribute("msg", "Record is saved!!!");
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
		rd.forward(request, response);
	}
		}
	
