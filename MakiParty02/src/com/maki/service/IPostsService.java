package com.maki.service;

import java.util.List;

import com.maki.model.PostsModel;

public interface IPostsService {

	void insertPosts(PostsModel postsModel);
	List<PostsModel> show();

}
