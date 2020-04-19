package com.capgemini.servletassignment.service;

import java.util.List;

import com.capgemini.servletassignment.dto.UserBean;

public interface UserService {
	
	boolean addUser(UserBean bean);
	boolean removeUser(int id);
	boolean updateUser(UserBean bean);
	List<UserBean> viewAllUsers();
	
}
