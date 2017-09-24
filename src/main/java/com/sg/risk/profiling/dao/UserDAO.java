package com.sg.risk.profiling.dao;

import com.sg.risk.profiling.domain.User;

public interface UserDAO {
	
	User findById(Long id);

}
