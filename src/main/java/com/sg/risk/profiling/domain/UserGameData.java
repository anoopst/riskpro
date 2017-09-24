package com.sg.risk.profiling.domain;

import java.util.List;

public class UserGameData {

	private List<UserGameDetail> gameDetails;
	private Game game;

	public List<UserGameDetail> getGameDetails() {
		return gameDetails;
	}

	public void setGameDetails(List<UserGameDetail> gameDetails) {
		this.gameDetails = gameDetails;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public UserGameData() {
		super();
	}

	public UserGameData(List<UserGameDetail> gameDetails, Game game) {
		super();
		this.gameDetails = gameDetails;
		this.game = game;
	}

}
