package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午4:45:05 
* 类说明 
* 判断功能
* 	String类的public boolean matches(String regex)
* 需求
* 	判断手机号码是否满足要求
* 分析L
* 	键盘录入手机号码
* 	定义手机号码规则
*   15109213065
*   1 11位
*   2 以1开头
*   3 后面[0`9]
* 	调用功能，判断即可
*   输出结果
*   
*/
import java.util.Scanner;
public class RegexDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的手机号：");
		String phone = sc.nextLine();
		
		//定义手机号码规则
		String regex = "1[38]\\d{9}";
		System.out.println("phone.matches(regex):"+phone.matches(regex));
	}

}
