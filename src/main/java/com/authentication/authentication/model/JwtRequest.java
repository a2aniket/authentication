package com.authentication.authentication.model;

public class JwtRequest {
	String usrename;
	String password;
	
	public JwtRequest(String usrename, String password) {
		super();
		this.usrename = usrename;
		this.password = password;
	}

	public JwtRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsrename() {
		return usrename;
	}
	public void setUsrename(String usrename) {
		this.usrename = usrename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtRequest [usrename=" + usrename + ", password=" + password + "]";
	}
	
	
	
	
	
}
