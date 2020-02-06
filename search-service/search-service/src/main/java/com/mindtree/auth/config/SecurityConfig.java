package com.mindtree.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mindtree.service.MovieServiceImpl;

@Configuration
//@EnableWebSecurity
public class SecurityConfig {//extends WebSecurityConfigurerAdapter{
	
	/*@Autowired
	private MovieServiceImpl movieService;
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().disable().csrf().disable()
		.authorizeRequests().antMatchers("/movie",  "*")
		.permitAll().anyRequest().authenticated().and().httpBasic();
	}

	protected void configure(AuthenticationManagerBuilder builder) throws Exception {
	
	}*/
	
}
