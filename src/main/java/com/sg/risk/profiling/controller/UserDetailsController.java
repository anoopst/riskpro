package com.sg.risk.profiling.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.risk.profiling.dao.UserDAO;
import com.sg.risk.profiling.domain.User;

@RestController
@RequestMapping("/user")
public class UserDetailsController {
	
	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User save(@RequestBody User user) {
		return userDAO.save(user);
	}
	
	@RequestMapping(value="/get/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User get(@PathVariable Long id) {
		return userDAO.findById(id);
	}
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Collection<User> getAll() {
		return userDAO.findAll();
	}
}
