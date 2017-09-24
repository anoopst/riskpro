package com.sg.risk.profiling.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sg.risk.profiling.domain.Game;
import com.sg.risk.profiling.domain.GameData;
import com.sg.risk.profiling.domain.GameOption;

@Component
public class CardGameDAO implements GameDAO {

	private long INITIAL_BET = 1000000;
	// private long BET_INCREMENT = 1000000;

	public CardGameDAO() {
		super();
	}

	private GameOption computeGameOption(int level, long k) {
		Long betAmount = INITIAL_BET * k;
		Long reward = betAmount + (betAmount * (long) Math.abs((level + k) / (level * k)));
		Long risk = k * reward;
		return new GameOption(betAmount, k, level, risk, reward);
	}

	@Override
	public GameData findByLevel(int level) {
		GameData gameData = null;
		if (level <= 2) {
			List<GameOption> gameOptions = new ArrayList<>();
			gameData = new GameData(new Game(1L, "Card Game"),gameOptions);
			for (int k = 1; k < 11; k++) {
				GameOption gameOption = computeGameOption(level, k);
				gameOptions.add(gameOption);
			}
		}
		return gameData;
	}

}
