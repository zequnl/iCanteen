package com.wuyufei.domain;
// Generated 2015-7-4 15:27:37 by Hibernate Tools 3.4.0.CR1

/**
 * Bussiness generated by hbm2java
 */
public class Bussiness implements java.io.Serializable {

	private String username;
	private Userinfo userinfo;
	private int time;
	private String area;
	private float fare;

	public Bussiness() {
	}

	public Bussiness(Userinfo userinfo, int time, String area, float fare) {
		this.userinfo = userinfo;
		this.time = time;
		this.area = area;
		this.fare = fare;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public float getFare() {
		return this.fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

}
