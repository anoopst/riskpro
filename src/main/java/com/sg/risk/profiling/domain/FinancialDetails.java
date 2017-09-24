package com.sg.risk.profiling.domain;

public class FinancialDetails {
	
	private String source;
	private Long amount;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public FinancialDetails(String source, Long amount) {
		super();
		this.source = source;
		this.amount = amount;
	}
	public FinancialDetails() {
		super();
	}
}
