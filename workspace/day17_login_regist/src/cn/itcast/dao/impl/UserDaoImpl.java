package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午3:39:18 
* 类说明 
*/
public class UserDaoImpl implements UserDao {
//为了让多个方法能够使用同一个集合，就把集合定义为成员变量
	//为了保证安全性，将其定义为私有
	//为了让多个对象同用有个成员变量，用static 修饰
	private  static ArrayList<User> array =new ArrayList<User>();
	@Override
	public boolean isLogin(String username, String password) {
		// TODO Auto-generated method stub
		//遍历集合，获取一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
		boolean flag = false;
		
		for(User u:array){
			if(u.getUsername().equals(username)
					&& u.getPassword().equals(password)){
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		//把用户信息存入集合
		//ArrayList<User> array = ArrayList<User>();
		array.add(user);

	}

}
