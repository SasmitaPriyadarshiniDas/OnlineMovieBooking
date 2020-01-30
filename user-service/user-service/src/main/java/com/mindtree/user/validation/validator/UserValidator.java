package com.mindtree.user.validation.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mindtree.user.bean.UserBean;
import com.mindtree.user.service.UserService;

@Service
public class UserValidator implements Validator {
	@Autowired
	private UserService userService;

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserBean.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		 UserBean user = (UserBean) target;

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
	        if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
	            errors.rejectValue("username", "Size.userForm.username");
	        }
	        if (userService.findByUsername(user.getUsername()) != null) {
	            errors.rejectValue("username", "Duplicate.userForm.username");
	        }

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
	        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
	            errors.rejectValue("password", "Size.userForm.password");
	        }

	        if (!user.getPasswordConfirm().equals(user.getPassword())) {
	            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
	        }
		
		
	}

}
