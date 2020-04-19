package com.capgemini.servletassignment.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capgemini.servletassignment.dto.UserBean;

public class UserDaoImpl implements UserDAO {
	
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;

	@Override
	public boolean addUser(UserBean bean) {
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}

	@Override
	public boolean removeUser(int id) {
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			UserBean bean = manager.find(UserBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(UserBean bean) {
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			UserBean userBean = manager.find(UserBean.class, bean.getUserId());
			userBean.setEmail(bean.getEmail());
			userBean.setName(bean.getName());
			userBean.setPassword(bean.getPassword());
			userBean.setGender(bean.getGender());
			userBean.setCountry(bean.getCountry());
			manager.persist(userBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}

	@Override
	public List<UserBean> viewAllUsers() {
		try {
			String jpql = "select u from UserBean u";
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			TypedQuery<UserBean> query = manager.createQuery(jpql, UserBean.class);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
