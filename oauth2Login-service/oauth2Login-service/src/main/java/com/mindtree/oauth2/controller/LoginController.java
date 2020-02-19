package com.mindtree.oauth2.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/facebook/login")
	public String facebookLogin() throws IOException {
		return "welcome";
	}

}
