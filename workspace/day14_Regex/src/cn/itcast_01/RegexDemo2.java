package cn.itcast_01;

import java.util.Scanner;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午3:39:51 
* 类说明 
*/
public class RegexDemo2 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号码：");
		String qq = sc.nextLine();
		System.out.println("checkQQ:"+checkQQ(qq));
		
	}
	//椒盐方法
	public static boolean checkQQ(String qq){
		/*
		String regex = "[1-9][0-9]{4,14}";
		//public boolean matchs(String regex)
		//告知此字符串是否匹配给定的正则表达式
		boolean flag = qq.matches(regex);
		return flag;
		*/
		return qq.matches("[1-9][0-9]{4,14}");
	}

}
