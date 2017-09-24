package com.sg.risk.profiling.domain;

public class Objectives {
	
	private int priority;
	private String purpose;
	private Long amount;
	private User user;
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Objectives() {
		super();
	}
	public Objectives(int priority, String purpose, Long amount, User user) {
		super();
		this.priority = priority;
		this.purpose = purpose;
		this.amount = amount;
		this.user = user;
	}
}
