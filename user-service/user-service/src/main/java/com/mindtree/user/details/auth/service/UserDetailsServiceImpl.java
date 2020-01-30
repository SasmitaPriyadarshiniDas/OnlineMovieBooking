package com.mindtree.user.details.auth.service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.user.bean.Role;
import com.mindtree.user.bean.SignupRequest;
import com.mindtree.user.bean.UserBean;
import com.mindtree.user.dao.UserDao;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
    private UserDao userRepository;
	

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        UserBean user = userRepository.findByUsername(username);
        System.out.println(user.getUsername());
       
		  Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
		 
		  for (Role role : user.getRoles()){ 
			  grantedAuthorities.add(new
		  SimpleGrantedAuthority(role.getName())); 
			  }
		  if (user == null) {
	        	throw new UsernameNotFoundException("Invalid username or password.");
			}
		 
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),grantedAuthorities);
    }
    
    
    @Transactional(readOnly=false)
    public UserBean loadUserDetails(SignupRequest signupRequest) {
    	
    	UserBean user =// new UserBean();

		(UserBean) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	
    	user.setUsername(signupRequest.getUsername());
    	user.setPassword(signupRequest.getPassword());
    	user.setPasswordConfirm(signupRequest.getPasswordConfirm());
    	user.setEmailId(signupRequest.getEmailId());
    	user.setRoles(signupRequest.getRoles());
    	
    	return userRepository.save(user);
    }
    
    

}
