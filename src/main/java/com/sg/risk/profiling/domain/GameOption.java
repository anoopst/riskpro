package com.sg.risk.profiling.domain;

public class GameOption {
	
	private Long betAmount;
	private Long k;
	private int level;
	private Long risk;
	private Long reward;
	public Long getBetAmount() {
		return betAmount;
	}
	public void setBetAmount(Long betAmount) {
		this.betAmount = betAmount;
	}
	public Long getK() {
		return k;
	}
	public void setK(Long k) {
		this.k = k;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Long getRisk() {
		return risk;
	}
	public void setRisk(Long risk) {
		this.risk = risk;
	}
	public Long getReward() {
		return reward;
	}
	public void setReward(Long reward) {
		this.reward = reward;
	}
	public GameOption() {
		super();
	}
	public GameOption(Long betAmount, Long k, int level, Long risk, Long reward) {
		super();
		this.betAmount = betAmount;
		this.k = k;
		this.level = level;
		this.risk = risk;
		this.reward = reward;
	}
}
