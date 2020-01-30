package com.mindtree.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.mindtree.user.bean.LoginRequest;
import com.mindtree.user.bean.LoginResponse;
import com.mindtree.user.bean.SignupRequest;
import com.mindtree.user.bean.UserBean;
import com.mindtree.user.details.auth.service.UserDetailsServiceImpl;
import com.mindtree.user.validation.validator.UserValidator;

@RestController
public class UserController {

	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private UserValidator validator;

	@PostMapping("/signup")
	public ResponseEntity<UserBean> signUp(@RequestBody SignupRequest request ) {
		userDetailsService.loadUserDetails(request);
		return new ResponseEntity<UserBean>(HttpStatus.OK);

	}

	@PostMapping("/user/login")
	public LoginResponse login(@RequestBody LoginRequest loginRequest) throws UsernameNotFoundException {
		encoder.encode(loginRequest.getPassword());
		UserDetails user = userDetailsService.loadUserByUsername(loginRequest.getUsername());
		LoginResponse loginresponse = new LoginResponse();
		loginresponse.setUserName(user.getUsername());
		return loginresponse;
	}
	
	@PostMapping("/admin/signup")
	public UserBean AdminSignUp(@RequestBody SignupRequest request ) {
		
		
		return userDetailsService.loadUserDetails(request);
		
	}

}
