package com.sg.risk.profiling.domain;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class User {
	
	private Long id;
	private String name;
	private Calendar dob;
	private String homeAddr1;
	private String homeAddr2;
	private String maritalStatus;
	private String occuptation;
	private int yearsToRetire;
	private List<Objectives> investmentObjectives;
	private List<FinancialDetails> financialDetails;
	
	private Map<Integer, UserGameData> gameData;
	private Long riskAppetite;
	private Long riskTolerance;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getDob() {
		return dob;
	}
	public void setDob(Calendar dob) {
		this.dob = dob;
	}
	public String getHomeAddr1() {
		return homeAddr1;
	}
	public void setHomeAddr1(String homeAddr1) {
		this.homeAddr1 = homeAddr1;
	}
	public String getHomeAddr2() {
		return homeAddr2;
	}
	public void setHomeAddr2(String homeAddr2) {
		this.homeAddr2 = homeAddr2;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getOccuptation() {
		return occuptation;
	}
	public void setOccuptation(String occuptation) {
		this.occuptation = occuptation;
	}
	public int getYearsToRetire() {
		return yearsToRetire;
	}
	public void setYearsToRetire(int yearsToRetire) {
		this.yearsToRetire = yearsToRetire;
	}	
	public List<Objectives> getInvestmentObjectives() {
		return investmentObjectives;
	}
	public void setInvestmentObjectives(List<Objectives> investmentObjectives) {
		this.investmentObjectives = investmentObjectives;
	}
	public List<FinancialDetails> getFinancialDetails() {
		return financialDetails;
	}
	public void setFinancialDetails(List<FinancialDetails> financialDetails) {
		this.financialDetails = financialDetails;
	}

	public Map<Integer, UserGameData> getGameData() {
		return gameData;
	}
	public void setGameData(Map<Integer, UserGameData> gameData) {
		this.gameData = gameData;
	}
	public Long getRiskAppetite() {
		return riskAppetite;
	}
	public void setRiskAppetite(Long riskAppetite) {
		this.riskAppetite = riskAppetite;
	}
	public Long getRiskTolerance() {
		return riskTolerance;
	}
	public void setRiskTolerance(Long riskTolerance) {
		this.riskTolerance = riskTolerance;
	}
	public User() {
		super();
	}
	public User(Long id, String name, Calendar dob, String homeAddr1, String homeAddr2, String maritalStatus,
			String occuptation, int yearsToRetire, List<Objectives> investmentObjectives,
			List<FinancialDetails> financialDetails, Map<Integer, UserGameData> gameData, Long riskAppetite,
			Long riskTolerance) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.homeAddr1 = homeAddr1;
		this.homeAddr2 = homeAddr2;
		this.maritalStatus = maritalStatus;
		this.occuptation = occuptation;
		this.yearsToRetire = yearsToRetire;
		this.investmentObjectives = investmentObjectives;
		this.financialDetails = financialDetails;
		this.gameData = gameData;
		this.riskAppetite = riskAppetite;
		this.riskTolerance = riskTolerance;
	}
}
