package com.sg.risk.profiling.domain;

import java.util.List;

public class GameData {
	
	private Game game;
	List<GameOption> gameoptions;
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public List<GameOption> getGameoptions() {
		return gameoptions;
	}
	public void setGameoptions(List<GameOption> gameoptions) {
		this.gameoptions = gameoptions;
	}
	public GameData(Game game, List<GameOption> gameoptions) {
		super();
		this.game = game;
		this.gameoptions = gameoptions;
	}
	public GameData() {
		super();
	}

}
