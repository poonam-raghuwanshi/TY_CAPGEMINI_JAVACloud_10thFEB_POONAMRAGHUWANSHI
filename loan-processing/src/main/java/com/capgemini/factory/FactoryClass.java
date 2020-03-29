package com.capgemini.factory;

import com.capgemini.dao.AdminDAODeclaration;
import com.capgemini.dao.AdminDAOImplementation;
import com.capgemini.dao.CustomerDAODeclaration;
import com.capgemini.dao.CustomerDAOImplementation;
import com.capgemini.dao.DAODeclaration;
import com.capgemini.dao.DAOImplementation;
import com.capgemini.dao.LadDAODeclaration;
import com.capgemini.dao.LadDAOImplementation;
import com.capgemini.dao.LoginDAODeclaration;
import com.capgemini.dao.LoginDAOImplementation;
import com.capgemini.services.AdminServicesDeclaration;
import com.capgemini.services.AdminServicesImplementation;
import com.capgemini.services.CustomerServicesDeclaration;
import com.capgemini.services.CustomerServicesImplementation;
import com.capgemini.services.LADServicesDeclaration;
import com.capgemini.services.LADServicesImplementation;
import com.capgemini.services.LoginServicesDeclaration;
import com.capgemini.services.LoginServicesImplementation;
import com.capgemini.services.ServicesDeclaration;
import com.capgemini.services.ServicesImplementation;

public class FactoryClass {
	public static ServicesDeclaration getServices() {
		return new ServicesImplementation();
	}
	
	public static DAODeclaration getDAO() {
		return new DAOImplementation();
	}
	
	public static CustomerServicesDeclaration getCustomerServices() {
		return new CustomerServicesImplementation();
	}
	
	public static CustomerDAODeclaration getCustomerDao() {
		return new CustomerDAOImplementation();
	}
	
	public static AdminServicesDeclaration getAdminServices() {
		return new AdminServicesImplementation();
	}
	
	public static AdminDAODeclaration getAdminDao() {
		return new AdminDAOImplementation();
	}
	
	public static LoginServicesDeclaration getLoginServices() {
		return new LoginServicesImplementation();
	}
	
	public static LoginDAODeclaration getLoginDao() {
		return new LoginDAOImplementation();
	}
	
	public static LADServicesDeclaration getLadServices() {
		return new LADServicesImplementation();
	}
	
	public static LadDAODeclaration getLadDao() {
		return new LadDAOImplementation();
	}
}
