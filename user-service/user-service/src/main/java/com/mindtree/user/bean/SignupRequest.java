package com.mindtree.user.bean;

import java.util.Set;

public class SignupRequest {

	private String username;
	private String password;
	private String emailId;
	private String passwordConfirm;
	private Set<Role> roles;

	public SignupRequest() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	@Override
	public String toString() {
		return "SignupRequest [username=" + username + ", password=" + password + ", emailId=" + emailId
				+ ", passwordConfirm=" + passwordConfirm + ", roles=" + roles + "]";
	}
	
	

}
