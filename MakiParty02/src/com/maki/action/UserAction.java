package com.maki.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maki.model.UserModel;
import com.maki.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction {
	private String userId;
	private String userPass;
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	
	
	public String login(){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService usi = (IUserService) ac.getBean("userServiceImpl");
		UserModel userModel = new UserModel();
		userModel.setUserId(userId);
		userModel.setUserPass(userPass);
		UserModel u1 = usi.login(userModel);
		if(u1!=null){
			ServletActionContext.getRequest().getSession().setAttribute("user", u1);
			return "ok";
		}
		return null;
	}
	
	public String register(){
		UserModel userModel = new UserModel();
		userModel.setUserId(userId);
		userModel.setUserPass(userPass);
		userModel.setUserName(userName);
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService usi = (IUserService) ac.getBean("userServiceImpl");
		usi.insertUser(userModel);
		return "ok";
	}
	
}
