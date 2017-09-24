package com.sg.risk.profiling.dao;

import java.util.Map;

import com.sg.risk.profiling.domain.User;

public class UserDAOImpl implements UserDAO {
	
	private Map<Integer, User> users;

	@Override
	public User findById(Long id) {
		return users.get(id);
	}

}
