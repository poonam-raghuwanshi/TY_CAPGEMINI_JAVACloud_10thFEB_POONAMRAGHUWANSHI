package com.capgemini.servletassignment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.servletassignment.dto.UserBean;
import com.capgemini.servletassignment.service.UserService;
import com.capgemini.servletassignment.service.UserServiceImpl;

public class UserController extends HttpServlet {
	
	private UserService service = null;

	public UserController() {
		this.service = new UserServiceImpl();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserBean bean = new UserBean();
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		
		bean.setName(name);
		bean.setPassword(password);
		bean.setEmail(email);
		bean.setGender(gender);
		bean.setCountry(country);
		
		service.addUser(bean);
	}
	
}
