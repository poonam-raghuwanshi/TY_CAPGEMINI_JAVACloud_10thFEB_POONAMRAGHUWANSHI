package com.capgemini.dao;

public interface LadDAODeclaration {
	public boolean viewLoanPrograms();
	public boolean ladReviewForms(String apid, String status);
	public boolean ladViewForms(String planString);
	public boolean requestedForms();
}
