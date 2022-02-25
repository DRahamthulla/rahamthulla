package com.trf;

public class User {
	private String fname;
	private int age;
	private String email;
	private String password;
	private String gender;
	
	public User() {
	 	
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", age=" + age + ", email=" + email + ", password=" + password + ", gender="
				+ gender + "]";
	}



	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}





}

