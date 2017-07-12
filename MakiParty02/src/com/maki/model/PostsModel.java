package com.maki.model;

public class PostsModel {
	
	private int id;
	private int fromName;
	private String postsTime;
	private String postsTitle;
	private String postsValue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFromName() {
		return fromName;
	}
	public void setFromName(int fromName) {
		this.fromName = fromName;
	}
	public String getPostsTime() {
		return postsTime;
	}
	public void setPostsTime(String postsTime) {
		this.postsTime = postsTime;
	}
	public String getPostsTitle() {
		return postsTitle;
	}
	public void setPostsTitle(String postsTitle) {
		this.postsTitle = postsTitle;
	}
	public String getPostsValue() {
		return postsValue;
	}
	public void setPostsValue(String postsValue) {
		this.postsValue = postsValue;
	}

}
