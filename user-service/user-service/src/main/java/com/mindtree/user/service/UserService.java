package com.mindtree.user.service;

import com.mindtree.user.bean.UserBean;

public interface UserService {
	
	public void save(UserBean user);
	
	public UserBean findByUsername(String username);

	

}
