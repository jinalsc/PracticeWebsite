package com.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.PatientInfo;
import com.demo.Model.User;
import com.demo.Service.ApplicationService;
import com.demo.Service.MyApplicationService;

@RestController
public class MyRestController {

	@Autowired
	MyApplicationService service;
	
	@Autowired
	ApplicationService appService;
	
	@GetMapping("/saveUser")
	public String saveUser(@RequestParam String name, @RequestParam String password) {
		User user = new User(name,password);
		service.saveUser(user);
		return "User Saved";
	}
	
	@PostMapping(value="/createUser",consumes = "application/json")
	public String createUser(@RequestBody PatientInfo info) {
		appService.createUser(info);
		return "Created";
	}
	
	@GetMapping("/FetchUserDetails")
	public Optional<PatientInfo> getUserDetails(@RequestParam int id) {
		return appService.getUserInfo(id);
	}
	
	@PatchMapping(value="/updateForget")
	public PatientInfo updateInfo(@RequestBody PatientInfo info,@RequestParam int id) {
		return appService.updateInfo(info,id);
	}
}
