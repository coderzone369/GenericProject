package com.coderszone.response.body;

import java.util.List;

public class UserRegisterLoginResponse {

	private Boolean isRegistrationSuccessful;
	private String successMessage;
	private List<String> errorMessageList;
	
	public Boolean getIsRegistrationSuccessful() {
		return isRegistrationSuccessful;
	}
	public void setIsRegistrationSuccessful(Boolean isRegistrationSuccessful) {
		this.isRegistrationSuccessful = isRegistrationSuccessful;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public List<String> getErrorMessageList() {
		return errorMessageList;
	}
	public void setErrorMessageList(List<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}
	
}
