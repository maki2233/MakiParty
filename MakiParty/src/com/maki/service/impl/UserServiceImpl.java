package com.maki.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.maki.dao.IUserDao;
import com.maki.model.UserModel;
import com.maki.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Resource(name="UserDao")
	private IUserDao iUserDao;
	public IUserDao getIUserDao() {
		return iUserDao;
	}
	public void setIUserDao(IUserDao iUserDao) {
		this.iUserDao = iUserDao;
	}
	@Override
	public List<UserModel> showUser() {
		// TODO Auto-generated method stub
		return iUserDao.showUser();
	}
	@Override
	public void insertUser(UserModel userModel) {
		// TODO Auto-generated method stub
		iUserDao.insertUser(userModel);
	}
	@Override
	public UserModel login(UserModel userModel) {
		// TODO Auto-generated method stub
		return iUserDao.login(userModel);
	}
	@Override
	public UserModel selectUser(int id) {
		// TODO Auto-generated method stub
		return iUserDao.selectUser(id);
	}

}
