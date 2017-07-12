package com.maki.model;

public class PostsAndUser {
	private int id;
	private int fromName;
	private String postsTime;
	private String postsTitle;
	private String postsValue;
	private String userId;
	private String userPass;
	private String userName;
	private String email;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
