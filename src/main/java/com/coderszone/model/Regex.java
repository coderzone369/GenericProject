package com.coderszone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Regex {

	@Id
	@GeneratedValue
	Integer id;
	String regexName;
	String regexValue;
	String regexMessage;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRegexName() {
		return regexName;
	}
	public void setRegexName(String regexName) {
		this.regexName = regexName;
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
