package com.coderszone.response.body;

public class UserLoginResponse {

	private Boolean isLoginSuccessFull;
	private String errorMessage;
	
	public Boolean getIsLoginSuccessFull() {
		return isLoginSuccessFull;
	}
	public void setIsLoginSuccessFull(Boolean isLoginSuccessFull) {
		this.isLoginSuccessFull = isLoginSuccessFull;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
