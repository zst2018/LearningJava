package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午2:41:39 
* 类说明 
* 需求：设计一个方法，可以实现获取任意一个范围内的随机数
* 分析：
* 	A键盘录入两个数据
* 	int start
* 	int end
* 	B 想办法获取在start和end之间的随机数
* 	C 输出这个随机数
* 
* 
*/
import java.util.Scanner;
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int start = sc.nextInt();
		System.out.println("请输入第二个数据：");
		int end = sc.nextInt();
		int min = Math.min(start,end);
		int abs =Math.abs((start-end));
		
		System.out.println("产生的在"+start+"和"+end+"之间的随机数是："
							+(Math.round(Math.random()*abs+min)));
		
	}

}
