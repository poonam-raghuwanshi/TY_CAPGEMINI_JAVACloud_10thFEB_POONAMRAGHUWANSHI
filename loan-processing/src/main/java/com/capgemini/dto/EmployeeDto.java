package com.capgemini.dto;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class EmployeeDto implements Serializable{
	private String username;
	private String userid;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private long phone;
	private String role;
	
	public EmployeeDto(String username, String userid, String email, String password, String firstname, String lastname,
			long phone, String role) {
		super();
		this.username = username;
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.role = role;
	}

}
