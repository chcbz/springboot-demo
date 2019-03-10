package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Controller
public class UserController {

	@Autowired
	UserDao userDao2;

	@RequestMapping("/get-by-email")
	@ResponseBody
	public String getByEmail(String email) {
		String userId;
		User user = userDao2.findByEmail(email);
		if (user != null) {
			userId = String.valueOf(user.getId());
			return "The user id is: " + userId;
		}
		return "user " + email + " is not exist.";
	}
}