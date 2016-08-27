package com.entity;

public class TUser {
	private int userId;
	private long mobileNumber;
	private String roamingStatus;
	private String comLevel;
    private String isAvailable;
    private TCustomer customer;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getRoamingStatus() {
		return roamingStatus;
	}
	public void setRoamingStatus(String roamingStatus) {
		this.roamingStatus = roamingStatus;
	}
	public String getComLevel() {
		return comLevel;
	}
	public void setComLevel(String comLevel) {
		this.comLevel = comLevel;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	public TCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(TCustomer customer) {
		this.customer = customer;
	}

}
