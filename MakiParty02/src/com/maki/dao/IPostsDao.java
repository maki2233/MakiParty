package com.maki.dao;

import java.util.List;

import com.maki.model.PostsModel;

public interface IPostsDao {
	void insertPosts(PostsModel postsModel);
	List<PostsModel> show();
}
