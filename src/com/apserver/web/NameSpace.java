package com.apserver.web;

import java.util.HashMap;
import java.util.Map;

public class NameSpace {
	
	String id = "";
	String description = "";
	Map<String, User> users = new HashMap<String, User>();
	
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
	public void addUser(User user){
		this.users.put(user.getId(), user);
	}
	public void delUser(User user){
		this.users.remove(user.getId());
	}
	
}
