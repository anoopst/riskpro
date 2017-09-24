package com.sg.risk.profiling.domain;

public class UserGameDetail {

	private int level;
	private Long k;
	private Long risk;
	private Long reward;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Long getK() {
		return k;
	}

	public void setK(Long k) {
		this.k = k;
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

	public UserGameDetail(int level, Long k, Long risk, Long reward) {
		super();
		this.level = level;
		this.k = k;
		this.risk = risk;
		this.reward = reward;
	}

	public UserGameDetail() {
		super();
	}
}
