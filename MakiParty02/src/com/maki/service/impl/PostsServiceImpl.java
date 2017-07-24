package com.maki.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.maki.dao.IPostsDao;
import com.maki.model.PostsModel;
import com.maki.service.IPostsService;
@Service
public class PostsServiceImpl implements IPostsService{
	@Resource(name="PostsDao")
	private IPostsDao iPostsDao;

	public IPostsDao getiPostsDao() {
		return iPostsDao;
	}

	public void setiPostsDao(IPostsDao iPostsDao) {
		this.iPostsDao = iPostsDao;
	}

	@Override
	public void insertPosts(PostsModel postsModel) {
		// TODO Auto-generated method stub
		iPostsDao.insertPosts(postsModel);
	}

	@Override
	public List<PostsModel> show() {
		// TODO Auto-generated method stub
		return iPostsDao.show();
	}
}
