package com.capgemini.servletassignment.dao;

import java.util.List;

import com.capgemini.servletassignment.dto.UserBean;

public interface UserDAO {
	
	boolean addUser(UserBean bean);
	boolean removeUser(int id);
	boolean updateUser(UserBean bean);
	List<UserBean> viewAllUsers();
	
}
