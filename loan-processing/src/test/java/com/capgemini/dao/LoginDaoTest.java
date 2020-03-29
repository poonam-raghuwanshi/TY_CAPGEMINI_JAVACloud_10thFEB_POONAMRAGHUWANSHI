package com.capgemini.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.repository.Repository;

class LoginDaoTest {
	LoginDAOImplementation implementation = new LoginDAOImplementation();

	@Test
	void custLoginTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.custLogin("manoj191", "pass6");
		assertEquals(isBoolean, true);
	}

	@Test
	void custLoginTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.custLogin("asdasd", "ASdasd");
		assertEquals(isBoolean, false);
	}

	@Test
	void empLogin1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.empLogin("mayank191", "pass1");
		assertEquals(isBoolean, true);
	}

	@Test
	void empLogin2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.empLogin("mayank12123", "pass1");
		assertEquals(isBoolean, false);
	}

	@Test
	void empLogin3() {
		Repository.UserTable();
		Boolean isBoolean = implementation.empLogin("saswat191", "pass11");
		assertEquals(isBoolean, true);
	}

	@Test
	void registerTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank@123", "cus123",
				"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7611093264L, 50000.0);
		assertEquals(isBoolean, true);
	}

	@Test
	void registerTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.register("serviceman", "5/10/1996", "male", "anand@123", "cus123",
				"anand123@gmail.com", "Qwerty@123", "anand", "Singh", 7611093264L, 50000.0);
		assertEquals(isBoolean, true);
	}
}
