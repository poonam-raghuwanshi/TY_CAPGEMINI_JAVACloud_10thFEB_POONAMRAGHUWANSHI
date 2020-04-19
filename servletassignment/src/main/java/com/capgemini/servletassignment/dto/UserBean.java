package com.capgemini.servletassignment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_info")
public class UserBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int userId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	private String country;
	
}
