package cn.itcast.dao;

import cn.itcast.pojo.User;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午3:32:09 
* 类说明 
*/
public interface UserDao {
	public abstract boolean isLogin(String username,String password);
	public abstract void regist(User user);
	//因为用户因袭不止有登录名和密码，也许还有爱好性别等信息，所以此处传递的是有个用户信息的整体
	

}
