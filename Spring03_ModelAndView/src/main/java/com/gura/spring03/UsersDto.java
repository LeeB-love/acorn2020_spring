package com.gura.spring03;

public class UsersDto {
	private String id;
	private String pwd;
	
	public UsersDto() {}

	public UsersDto(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
