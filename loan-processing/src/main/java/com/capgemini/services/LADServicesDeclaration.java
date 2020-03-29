package com.capgemini.services;

public interface LADServicesDeclaration {
	public boolean viewLoanPrograms();

	public boolean ladReviewForms(String apid, String status);

	public boolean ladViewForms(String planString);

	public boolean requestedForms();

}
