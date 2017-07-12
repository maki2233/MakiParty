package com.maki.dao;



import java.util.List;

import com.maki.model.UserModel;

public interface IUserDao {
	List<UserModel> showUser();
	void insertUser(UserModel userModel);
	UserModel login (UserModel userModel);
	UserModel selectUser(int id);
}
