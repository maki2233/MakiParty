package com.maki.service;

import java.util.List;

import com.maki.model.UserModel;

public interface IUserService {
	List<UserModel> showUser();

	void insertUser(UserModel userModel);
	UserModel login (UserModel userModel);
	UserModel selectUser(int id);

}
