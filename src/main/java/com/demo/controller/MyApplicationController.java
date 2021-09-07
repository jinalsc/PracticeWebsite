package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.demo.Service.MyApplicationService;

@Controller
public class MyApplicationController {

	@Autowired
	MyApplicationService service;
	
	@ResponseBody
	@RequestMapping("/print")
	public String print() {
		return "---------Hello To My App----------------";
	}
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("/saveUser") public String saveUser(@RequestParam String
	 * name, @RequestParam String password) { User user = new User(name,password);
	 * service.saveUser(user); return "User Saved"; }
	 */
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("/SignUp") public String createUser() { return null; }
	 */
	
}
