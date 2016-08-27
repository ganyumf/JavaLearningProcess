package com.testJDBC2;

public class Area {
	private int aid;
	private String aname;
	@Override
	public String toString() {
		return "Area [aid=" + aid + ", aname=" + aname + ", cityid=" + cityid
				+ "]";
	}
	private int cityid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
}
