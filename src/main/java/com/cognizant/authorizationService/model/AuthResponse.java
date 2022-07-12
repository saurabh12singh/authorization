package com.cognizant.authorizationService.model;

public class AuthResponse {
/*
 * This model class will hold the data for user id,
 * name and isValid
 */
	private String uid;
	private String name;
	private boolean isValid;
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
