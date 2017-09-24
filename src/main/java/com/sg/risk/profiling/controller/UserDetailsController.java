package com.sg.risk.profiling.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.risk.profiling.domain.User;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User save(@RequestBody User user) {
		return user;
	}
	
	@RequestMapping(value="/get/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User get(@PathVariable Long id) {
		return null;
	}
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User getAll() {
		return null;
	}
}
