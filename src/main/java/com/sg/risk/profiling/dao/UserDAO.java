package com.sg.risk.profiling.dao;

import java.util.Collection;

import com.sg.risk.profiling.domain.User;

public interface UserDAO {
	
	User findById(Long id);

	User save(User user);

	Collection<User> findAll();


}
