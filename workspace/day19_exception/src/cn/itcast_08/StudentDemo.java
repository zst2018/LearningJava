package cn.itcast_08;

import java.util.Scanner;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午2:20:32 
* 类说明 
*/
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩");
		int score = sc.nextInt();
		
		Teacher t = new Teacher();
		try {
			t.check(score);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
