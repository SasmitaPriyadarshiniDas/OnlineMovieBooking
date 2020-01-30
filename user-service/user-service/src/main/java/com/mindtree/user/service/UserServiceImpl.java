package com.mindtree.user.service;

import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.mindtree.user.bean.UserBean;
import com.mindtree.user.dao.RoleDao;
import com.mindtree.user.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userRepository;

    @Autowired
    private RoleDao roleRepository;
    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(UserBean user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public UserBean findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
