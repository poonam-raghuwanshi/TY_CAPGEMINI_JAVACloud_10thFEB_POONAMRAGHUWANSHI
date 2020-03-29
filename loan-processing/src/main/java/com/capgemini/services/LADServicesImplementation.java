package com.capgemini.services;

import com.capgemini.exception.FormReviewChoiceException;
import com.capgemini.factory.FactoryClass;
import com.capgemini.validation.ValidationClass;

public class LADServicesImplementation implements LADServicesDeclaration {
ValidationClass validationClass = new ValidationClass();
	
	@Override
	public boolean viewLoanPrograms() {
		if (FactoryClass.getLadDao().viewLoanPrograms()) {
			return true;
		} else return false;
	}
	
	@Override
	public boolean ladReviewForms(String apid, String status) {
		if ((status.equalsIgnoreCase("approved")) || (status.equalsIgnoreCase("rejected"))) {
			FactoryClass.getLadDao().ladReviewForms(apid, status);
			return true;
		} else throw new FormReviewChoiceException("please write only approved or rejected.");
	}

	@Override
	public boolean ladViewForms(String planString) {
		if (FactoryClass.getLadDao().ladViewForms(planString)) {
			return true;
		} else return false;
	}
	
	@Override
	public boolean requestedForms() {
		if (FactoryClass.getLadDao().requestedForms()) {
			return true;
		} else return false;
	}

}