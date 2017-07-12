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
	
	private UserModel um;
	
	
	public UserModel getUm() {
		return um;
	}
	public void setUm(UserModel um) {
		this.um = um;
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
	
	public void register(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService usi = (IUserService) ac.getBean("userServiceImpl");
		usi.insertUser(um);
	}
}
