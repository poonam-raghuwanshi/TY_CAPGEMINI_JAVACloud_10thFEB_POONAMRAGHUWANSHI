package com.capgemini.services;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.capgemini.exception.FormReviewChoiceException;
import com.capgemini.repository.Repository;

class LADServicesTest {

LADServicesImplementation implementation = new LADServicesImplementation();
	
	@Test
	void ladReviewFormTest1() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.ladReviewForms("AP03", "asdasd");
			assertEquals(isBoolean, true);
		} catch (Exception e) {
			assertThrows(FormReviewChoiceException.class, ()->{
				implementation.ladReviewForms("AP03", "asdasd");
			});
		}
	}
	

	@Test
	void ladReviewFormTest2() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.ladReviewForms("AP031", "asdasd");
			assertEquals(isBoolean, false);
		} catch (Exception e) {
			assertThrows(FormReviewChoiceException.class, ()->{
				implementation.ladReviewForms("AP03", "asdasd");
			});
		}
	}
	
	@Test
	void viewLoanProgramsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.viewLoanPrograms();
		assertEquals(isBoolean, true);
	}
	
	@Test
	void ladViewFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladViewForms("Vehicle Loan");
		assertEquals(isBoolean, true);
	}
	
	
	
	
	@Test
	void ladViewFormsTest2() {
		Repository.UserTable();
		Boolean isBoolean = implementation.ladViewForms("asdasd");
		assertEquals(isBoolean, false);
	}
	
	@Test
	void requestedFormsTest1() {
		Repository.UserTable();
		Boolean isBoolean = implementation.requestedForms();
		assertEquals(isBoolean, true);
	}
}
