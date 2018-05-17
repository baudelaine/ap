package com.apserver.web;

import java.util.HashMap;
import java.util.Map;

public class User {
	
	String id = "";
	String password = "";
	String fullName = "";
	NameSpace nameSpace;
	String email = "";
	boolean connected = false;
	Map<String, Group> groups = new HashMap<String, Group>();
	LicenseType licenseType;
	Map<String, SessionParameter> sessionParameters = new HashMap<String, SessionParameter>(); 

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, SessionParameter> getSessionParameters() {
		return sessionParameters;
	}
	public void setSessionParameters(Map<String, SessionParameter> sessionParameters) {
		this.sessionParameters = sessionParameters;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void addGroup(Group group){
		this.groups.put(group.getId(), group);
	}
	public void delGroup(Group group){
		this.groups.remove(group.getId());
	}
	public Map<String, Group> getGroups() {
		return groups;
	}
	public void setGroups(Map<String, Group> groups) {
		this.groups = groups;
	}
	public LicenseType getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(LicenseType licenseType) {
		this.licenseType = licenseType;
	}
	public void addSessionParameter(SessionParameter sessionParameter){
		sessionParameters.put(sessionParameter.getId(), sessionParameter);
	}
	public void delSessionParameter(SessionParameter sessionParameter){
		sessionParameters.remove(sessionParameter.getId());
	}
	public NameSpace getNameSpace() {
		return nameSpace;
	}
	public void setNameSpace(NameSpace nameSpace) {
		this.nameSpace = nameSpace;
	}
	public boolean isConnected() {
		return connected;
	}
	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	
}
