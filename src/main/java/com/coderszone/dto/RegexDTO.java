package com.coderszone.dto;

public class RegexDTO {

	private String regexValue;
	private String regexMessage;

	public RegexDTO(String regexValue, String regexMessage) {
		super();
		this.regexValue = regexValue;
		this.regexMessage = regexMessage;
	}

	public String getRegexValue() {
		return regexValue;
	}

	public void setRegexValue(String regexValue) {
		this.regexValue = regexValue;
	}

	public String getRegexMessage() {
		return regexMessage;
	}

	public void setRegexMessage(String regexMessage) {
		this.regexMessage = regexMessage;
	}

}
