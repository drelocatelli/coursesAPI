package com.andressalocatelli.course.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	public User(int id, String name, String email, String phone, String password) {
		super();
		this.id = (long) id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
}
