package com.sg.risk.profiling.dao;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.sg.risk.profiling.domain.User;

public class UserDAOImpl implements UserDAO {
	
	private Map<Long, User> users;
	
	private AtomicLong nextId = new AtomicLong(1);

	@Override
	public User findById(Long id) {
		return users.get(id);
	}

	@Override
	public User save(User user) {
		if(user.getId()!=null && !users.containsKey(user.getId())) {
			user.setId(nextId.incrementAndGet());
		}
		users.put(user.getId(), user);
		return user;
	}

	@Override
	public Collection<User> findAll() {
		return users.values();
	}

}
