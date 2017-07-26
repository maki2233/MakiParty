package com.maki.model;

public class HuifuAndDianzanModel {
	private int id;
	private int fromId;//Ìû×ÓID
	public int getFromId() {
		return fromId;
	}
	public void setFromId(int fromId) {
		this.fromId = fromId;
	}
	private String fromName;
	private int zts;//ÔÞÍ¬Êý
	private String huifu;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public int getZts() {
		return zts;
	}
	public void setZts(int zts) {
		this.zts = zts;
	}
	public String getHuifu() {
		return huifu;
	}
	public void setHuifu(String huifu) {
		this.huifu = huifu;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}
