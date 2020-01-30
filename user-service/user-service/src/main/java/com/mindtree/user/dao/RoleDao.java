package com.mindtree.user.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.user.bean.Role;

@Repository
public interface RoleDao extends MongoRepository<Role, String> {

}
