package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月16日 下午4:48:37 
* 类说明 
* 模拟三次登录，给三次登录机会，并提示还有几次。
* 如果登录成功就可以玩猜数字小游戏了。
* 
* 
* 分析：
* 	A:定义用户名和密码，已经存在
* 	B：键盘录入用户名和密码
*   C: 计较用户名和密码
*   	如果相同，则登录成功
*   	如果失败，则登录失败
*   D:给三次机会，用循环改进，最好用for 循环
* 
* 
*/
import java.util.Scanner;
public class StringTest2 {
	public static void main(String[] args){
		//用户名和密码已经存在
		String username = "admin" ;
		String password = "pass";
		
		for(int i=0;i<3;i++){
		//键盘录入用户名和密码
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
		
		
			if (name.equals(username) && pwd.equals(password)){
				System.out.println("登录成功!");
				// 在此处调用猜数字游戏的start（） 方法,
				//而且start（） 方法是静态方法
				
				GuessNumberGame.start();
				break;
			//如果输入正确，跳出循环结构，程序结束
			}else if(i==2){
				System.out.println("您三次登录都不正确！");
			}else if(i!=2){
				System.out.println("登录失败！您还有"+(2-i)+"次机会。");
			
			}
		}
		
		
	}

}










