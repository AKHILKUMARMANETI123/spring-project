package com.mvc;

public class User {
	private String name;
	private String psw;
	private String email;
	private String gender;
	private String addr;
	public User() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public User(String name, String psw, String email, String gender, String addr) {
		super();
		this.name = name;
		this.psw = psw;
		this.email = email;
		this.gender = gender;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", psw=" + psw + ", email=" + email + ", gender=" + gender + ", addr=" + addr
				+ "]";
	}
	
		

}
