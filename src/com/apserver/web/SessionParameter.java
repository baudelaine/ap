package com.apserver.web;

public class SessionParameter {

	String id = "";
	String description = "";
	String SQLrequest = "";
	String userIdSimulation = "";
	String resultSimulation = "";

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSQLrequest() {
		return SQLrequest;
	}
	public void setSQLrequest(String sQLrequest) {
		SQLrequest = sQLrequest;
	}
	public String getUserIdSimulation() {
		return userIdSimulation;
	}
	public void setUserIdSimulation(String userIdSimulation) {
		this.userIdSimulation = userIdSimulation;
	}
	public String getResultSimulation() {
		return resultSimulation;
	}
	public void setResultSimulation(String resultSimulation) {
		this.resultSimulation = resultSimulation;
	}
	
}
