package com.sg.risk.profiling.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.risk.profiling.dao.UserDAO;
import com.sg.risk.profiling.domain.Game;
import com.sg.risk.profiling.domain.GameData;
import com.sg.risk.profiling.domain.GameOption;
import com.sg.risk.profiling.domain.User;
import com.sg.risk.profiling.domain.UserGameData;
import com.sg.risk.profiling.domain.UserGameDetail;

@Service
public class CardComputationService implements ComputationService {

	@Autowired
	private UserDAO userDAO;

	private long INITIAL_BET = 1000000;
	// private long BET_INCREMENT = 1000000;

	@Override
	public GameData compute(Long userId, int level) {
		User user = userDAO.findById(userId);
		return findByLevel(user, level);
	}

	private GameOption computeGameOption(int level, long k, int option) {
		Long betAmount = INITIAL_BET * option;
		Long reward = betAmount + (betAmount * (long) Math.abs((level + k) / (level * k)));
		Long risk = k * reward;
		return new GameOption(betAmount, k, level, risk, reward);
	}

	public GameData findByLevel(User user, int level) {
		int i = 1;
		GameData gameData = null;
		List<GameOption> gameOptions = new ArrayList<>();
		gameData = new GameData(new Game(1L, "Card Game"), gameOptions);
		if (level <= 2) {

			for (long k = 1L; k < 11; k++) {
				GameOption gameOption = computeGameOption(level, k, i++);
				gameOptions.add(gameOption);
			}
		} else {
			UserGameData userGameData = user.getGameData().get(1L);
			Long avgK = 0L;
			List<Long> ks = new ArrayList<>();
			for (UserGameDetail gameDetail : userGameData.getGameDetails()) {
				avgK += gameDetail.getK();
			}
			avgK = avgK / 10;
			Collections.sort(ks);

			for (Long low = ks.get(0); low <= ks.get(ks.size() - 1); low += avgK) {
				GameOption gameOption = computeGameOption(level, low, i++);
				gameOptions.add(gameOption);
			}

		}
		return gameData;
	}

}
