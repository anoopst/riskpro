package com.sg.risk.profiling.service;

import com.sg.risk.profiling.domain.GameData;

public interface ComputationService {
	
	GameData compute(Long userId, int level);

}
