package com.coderszone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	Integer id;
	String firstName;
	String lastName;
	Long mobileNo;
	String eMailId;
	String password;
	Boolean isPasswordChange;
	Byte roleType;


	public String geteMailId() {
		return eMailId;
	}

	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsPasswordChange() {
		return isPasswordChange;
	}

	public void setIsPasswordChange(Boolean isPasswordChange) {
		this.isPasswordChange = isPasswordChange;
	}

	public Byte getRoleType() {
		return roleType;
	}

	public void setRoleType(Byte roleType) {
		this.roleType = roleType;
	}

}
