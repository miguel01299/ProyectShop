package com.registration;

import java.util.Date;

public class CustomerRegistration {

	public CustomerRegistration() {
		super();
	}

	private String name;
	private String surname;
	private Date birthsday;
	private String email;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthsday() {
		return birthsday;
	}

	public void setBirthsday(Date birthsday) {
		this.birthsday = birthsday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerRegistration(String name, String surname, Date birthsday, String email, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthsday = birthsday;
		this.email = email;
		this.password = password;
	}

}
