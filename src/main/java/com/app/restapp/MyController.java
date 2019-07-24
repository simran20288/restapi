package com.app.restapp;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
//	
//	@GetMapping("/welcome")
//	@ResponseBody
//	public String sayWelcome() {
//		return "Welcome to My App";
//	}


	HashMap<String, String> reg = new HashMap<String, String>();
	@GetMapping("/login")
	//@ResponseBody
	public String login() {
		return "login";
	}
	@PostMapping("/loginValid")
	@ResponseBody
	public String loginValid(@RequestParam("uname") String name, @RequestParam("pwd")String password) {
		
		if(name.equals(reg.get(name)) && password.equals(reg.get(password)))
			return "login successful";
		else
			return "login failed";
				
		
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/registerValid")
	public String registerValid(@RequestParam("uname") String name, @RequestParam("pwd") String password) {
		reg.put(name, password);
	
			return "login";
	}
	
}
