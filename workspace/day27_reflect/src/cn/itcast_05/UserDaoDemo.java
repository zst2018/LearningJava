package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午2:14:55 
* 类说明 
*/
public class UserDaoDemo {
	public static void main(String[] args) {
		//基本的用户操作
		UserDao ud = new UerDaoImpl();
		ud.add();
		ud.delete();
		ud.find();
		ud.update();
		
		//真实的需求应该是这个样子的
		//在每个操作执行前，应该看看你是否有权限进行这个操作
		//而且，谁操作了这个东西，你应该给我留下记录
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		ud2.delete();
		ud2.find();
		ud2.update();
		
		//假如我还有一个学生类也有这样的功能
		//我还有一个老师类，具有同样的操作
		
		System.out.println("-----------");
		
		StudentDao sd = new StudentDaoImpl();
		sd.login();
		sd.regist();
		
		System.out.println("-----");
		//真实的需求应该是这个样子的
		//在每个操作执行前，应该看看你是否有权限进行这个操作
		//而且，谁操作了这个东西，你应该给我留下记录
		StudentDao sd2 = new StudentDaoImpl2();
		sd2.login();
		sd2.regist();
		
	}

}
