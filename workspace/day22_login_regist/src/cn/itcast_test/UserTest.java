package cn.itcast_test;

import java.util.Scanner;

import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;
import cn.itcast_01.UserDao;
import cn.itcast_02.UserDaoImpl;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午3:58:55 
* 类说明 
*/
public class UserTest {
	public static void main(String[] args) {
		while(true){
			System.out.println("------------welcome--------------");
			System.out.println("1登录");
			System.out.println("2注册");
			System.out.println("请输入你的选择：");
		//键盘录入
			Scanner sc = new Scanner(System.in);
		//用字符串接受
			String choiceString = sc.nextLine();
		
		//登录和注册都要使用
			UserDao ud = new UserDaoImpl();
		//选择用switch
			switch (choiceString){
			case"1":
			//登录界面
				System.out.println("--------------登录界面-------------");
				System.out.println("请输入用户名：");
				String username=sc.nextLine();
				System.out.println("请输入密码：");
				String password = sc.nextLine();
			//调用登录功能
			//UserDao ud = new UserDaoImpl();
				boolean flag=ud.isLogin(username,password);
				if(flag){
					System.out.println("登录成功");
					//break;  //这里的break结束的是switch
					//System.exit(0);
					System.out.println("你要玩游戏吗？y/n");
					while(true){
					String resultString= sc.nextLine();
					if(resultString.equalsIgnoreCase("y")){
					GuessNumber.start();
					System.out.println("ni hai wan ma ? y/n");
					}else{
						break;
					
					}
					}
					System.exit(0);
					System.out.println("谢谢使用");
				}else{
					System.out.println("用户名或密码有误，登录失败");
				}
			
				break;
			case "2":
			//注册界面
				System.out.println("--------------注册界面-------------");
				System.out.println("请输入用户名：");
				String newUsername=sc.nextLine();
				System.out.println("请输入密码：");
				String newPassword = sc.nextLine();
			
			
			//把用户名和密码封装到有个对着那个中
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);
			//调用注册工嗯呢该
			//多态
			//UserDao ud = new UserDaoImpl();
			//具体类使用
			//UserDaoImpl udi = new UserDaoImpl();
			
				ud.regist(user);
				System.out.println("注册成功！");
				break;
			case "3":
				System.out.println("谢谢使用，欢迎下次再来！");
			//break;
			default:
				System.out.println("谢谢使用，欢迎下次再来！");
				System.exit(0);
				break;
			}
		}
	}

}
