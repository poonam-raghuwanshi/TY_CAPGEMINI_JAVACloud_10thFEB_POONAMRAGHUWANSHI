package com.capgemini.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.repository.Repository;

class LadDaoTest {

LadDAOImplementation implementation = new LadDAOImplementation();
	
	@Test
	void viewLoanProgramsTest() {
		Repository.UserTable();
		Boolean isBoolean = implementation.viewLoanPrograms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladReviewForms("AP03", "approved");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladReviewForms("AP03", "rejected");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladReviewFormsTest3() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladReviewForms("AP031", "approved");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void ladViewFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladViewForms("Vehicle loan");
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladViewFormsTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladViewForms("asd loan");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void requestedForms1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.requestedForms();
		assertEquals(isBoolean, true);
	}
}