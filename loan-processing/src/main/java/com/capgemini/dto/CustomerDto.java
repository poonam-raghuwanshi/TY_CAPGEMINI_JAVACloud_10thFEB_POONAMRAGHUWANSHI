package com.capgemini.dto;

import java.io.Serializable;

import lombok.Data;
@Data
@SuppressWarnings("serial")
public class CustomerDto implements Serializable {
	private String username;
	private String userid;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private long phone;
	private double accountBal;
	private double loanAmount;
	private String role;
	
	public CustomerDto(String username, String userid, String email, String password, String firstname, String lastname,
			long phone, String role, double accountBal, double loanAmount) {
		super();
		this.username = username;
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.accountBal = accountBal;
		this.loanAmount = loanAmount;
		this.role = role;
	}

}
