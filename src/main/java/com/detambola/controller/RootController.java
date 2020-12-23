package com.detambola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.detambola.dto.DeTambolaUser;

@RestController
public class RootController {

	@GetMapping("/")
	public String home() {
		return "Welcome to DeTambola!!!";
	}
	
	@GetMapping("/user")
	public DeTambolaUser getUser() {
		DeTambolaUser user = new DeTambolaUser(1,"Manish");
		return user;
	}
	
	@PostMapping("/setUser")
	public DeTambolaUser setUser(@RequestBody DeTambolaUser user) {
		return user;
	}
	
	@PostMapping("/setUser/{name}")
	public DeTambolaUser setUserName(@PathVariable (value="name") String name) {
		DeTambolaUser user = new DeTambolaUser(100, name);
		return user;
	}
}
