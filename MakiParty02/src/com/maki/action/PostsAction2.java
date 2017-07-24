package com.maki.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maki.model.PostsAndUser;
import com.maki.model.PostsModel;
import com.maki.model.UserModel;
import com.maki.service.IPostsService;
import com.maki.service.IUserService;

public class PostsAction2 {
	private UserModel userModel;
	
	public UserModel getUserModel() {
		return userModel;
	}


	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}


	private List<PostsAndUser> list2;

	
	public List<PostsAndUser> getList2() {
		return list2;
	}


	public void setList2(List<PostsAndUser> list2) {
		this.list2 = list2;
	}
	

	public String testPosts(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPostsService psi = (IPostsService) ac.getBean("postsServiceImpl");
		IUserService usi = (IUserService) ac.getBean("userServiceImpl");
		List<PostsModel> list = psi.show();
		HashMap<PostsModel, UserModel> map = new HashMap<PostsModel, UserModel>();
//		HashMap<PostsModel, UserModel> map2 = new HashMap<PostsModel, UserModel>();
		for (PostsModel postsModel : list) {
			map.put(postsModel, usi.selectUser(postsModel.getId()));
		}
		ArrayList<PostsAndUser> listTest = new ArrayList<PostsAndUser>();
		for(Map.Entry<PostsModel, UserModel> entry:map.entrySet()){
			PostsAndUser pu = new PostsAndUser();
			pu.setFromName(entry.getKey().getFromName());
			pu.setPostsTime(entry.getKey().getPostsTime());
			pu.setPostsTitle(entry.getKey().getPostsTitle());
			pu.setPostsValue(entry.getKey().getPostsValue());
//			pu.setUserId(entry.getValue().getUserId());
//			pu.setUserPass(entry.getValue().getUserPass());
			pu.setUserName(entry.getValue().getUserName());
			listTest.add(pu);
		}
		list2 = listTest;
		String str="ok";
		System.out.println(str);
		userModel = (UserModel) ServletActionContext.getRequest().getSession().getAttribute("user");

		return "ok";
	}

}
