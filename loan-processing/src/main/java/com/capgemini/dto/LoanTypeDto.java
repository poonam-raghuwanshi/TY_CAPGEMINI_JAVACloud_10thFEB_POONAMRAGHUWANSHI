package com.capgemini.dto;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class LoanTypeDto implements Serializable{
	private String loanType;
	private String timePeriod;
	private String interestRates;
	
	public LoanTypeDto(String loanType, String timePeriod, String interestRates) {
		super();
		this.loanType = loanType;
		this.timePeriod = timePeriod;
		this.interestRates = interestRates;
	}
}
