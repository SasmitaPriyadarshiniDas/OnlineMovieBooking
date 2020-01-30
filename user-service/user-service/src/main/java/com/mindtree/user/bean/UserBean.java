package com.mindtree.user.bean;

import java.util.Set;

import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserBean {

	
	@Id
	
	private String userId;
	
	
	private String username;
	private String password;
	private String emailId;
	private String passwordConfirm;
	private Set<Role> roles;

	public UserBean() {
	}

	
	public UserBean(String username, String password, String userId) {
		this.username = username;
		this.password = password;
		this.userId = userId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;

	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", username=" + username + ", password=" + password + ", emailId="
				+ emailId + ", passwordConfirm=" + passwordConfirm + ", roles=" + roles + "]";
	}
	
	

}
