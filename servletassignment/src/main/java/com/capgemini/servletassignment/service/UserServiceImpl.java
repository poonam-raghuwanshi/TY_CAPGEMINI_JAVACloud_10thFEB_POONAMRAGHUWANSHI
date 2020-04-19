package com.capgemini.servletassignment.service;

import java.util.List;

import com.capgemini.servletassignment.dao.UserDAO;
import com.capgemini.servletassignment.dao.UserDaoImpl;
import com.capgemini.servletassignment.dto.UserBean;

public class UserServiceImpl implements UserService {
	
	UserDAO dao = new UserDaoImpl();

	@Override
	public boolean addUser(UserBean bean) {
		return dao.addUser(bean);
	}

	@Override
	public boolean removeUser(int id) {
		if (id < 1) {
			return false;
		} else {
			return dao.removeUser(id);
		}
	}

	@Override
	public boolean updateUser(UserBean bean) {
		return dao.updateUser(bean);
	}

	@Override
	public List<UserBean> viewAllUsers() {
		return dao.viewAllUsers();
	}

}
