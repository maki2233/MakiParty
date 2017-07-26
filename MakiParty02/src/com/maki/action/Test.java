package com.maki.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maki.model.HuifuAndDianzanModel;
import com.maki.model.PostsAndUser;
import com.maki.model.PostsModel;
import com.maki.model.UserModel;
import com.maki.service.IHuifuAndDianzanService;
import com.maki.service.IPostsService;
import com.maki.service.IUserService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPostsService psi = (IPostsService) ac.getBean("postsServiceImpl");
		IUserService usi = (IUserService) ac.getBean("userServiceImpl");*/
//		UserModel userModel = new UserModel();
//		userModel.setUserId("admin");
//		userModel.setUserPass("admin");
//		System.out.println(usi.login(userModel));
//		UserModel user = usi.showUser();
//		System.out.println(user.getUserName()+"  "+user.getName());
//		List<UserModel> list = usi.showUser();
//		for (UserModel userModel : list) {
//			System.out.println(userModel.getUserName()+"  "+userModel.getEmail());
//		}
	/*	UserModel u = new UserModel();
		String a = "admin";
		u.setUserId(a);
		u.setUserPass(a);*/
//		u.setEmail(a);
//		u.setUserName(a);
//		usi.insertUser(u);
//		System.out.println(usi.login(u).getUserName());
//		PostsModel ps = new PostsModel();
//		
//		ps.setFromName(2);
//		ps.setPostsTime(new SimpleDateFormat("yyyy-MM-dd-hh-mmss").format(new Date()));
//		ps.setPostsTitle("第二个帖子");
//		ps.setPostsValue("测试添加");
//		usi.insertPosts(ps);
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		IPostsService psi = (IPostsService) ac.getBean("postsServiceImpl");
//		IUserService usi = (IUserService) ac.getBean("userServiceImpl");
//		HashMap<PostsModel, UserModel> map = new HashMap<PostsModel, UserModel>();
//		List<PostsModel> list = psi.show();
//		for (PostsModel postsModel : list) {
//			map.put(postsModel, usi.selectUser(postsModel.getId()));
//		}
//		List<PostsAndUser> list2 = new ArrayList<PostsAndUser>();
//		for(Map.Entry<PostsModel, UserModel> entry:map.entrySet()){
//			PostsAndUser pu = new PostsAndUser();
//			pu.setFromName(entry.getKey().getFromName());
//			pu.setPostsTime(entry.getKey().getPostsTime());
//			pu.setPostsTitle(entry.getKey().getPostsTitle());
//			pu.setPostsValue(entry.getKey().getPostsValue());
//			pu.setUserId(entry.getValue().getUserId());
//			pu.setUserPass(entry.getValue().getUserPass());
//			pu.setUserName(entry.getValue().getUserName());
//			list2.add(pu);
//		}
//		
//		for (PostsAndUser postsAndUser : list2) {
//			System.out.println(postsAndUser.getPostsTitle());
//		}
//	}
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IHuifuAndDianzanService ifz = (IHuifuAndDianzanService) ac.getBean("huifuAndDianzanServiceImpl");
		HuifuAndDianzanModel a = new HuifuAndDianzanModel();
		a.setId(1);
		ifz.createTable(a);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}