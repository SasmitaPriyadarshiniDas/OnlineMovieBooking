package com.mindtree.user.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.user.bean.UserBean;

@Repository
public interface UserDao extends MongoRepository<UserBean, String>{
	
	public UserBean findByUsername(String username);


	

}
