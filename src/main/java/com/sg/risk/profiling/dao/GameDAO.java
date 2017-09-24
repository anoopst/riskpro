package com.sg.risk.profiling.dao;

import com.sg.risk.profiling.domain.GameData;

public interface GameDAO {
	
	GameData findByLevel(int level);

}
