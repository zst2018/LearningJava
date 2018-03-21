package cn.itcast_08;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午4:32:42 
* 类说明 
*/
public class GuessNumber {
	private GuessNumber(){}
	public static void start(){
		int number = (int)(Math.random()*100)+1;
		int count = 0;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数据");
			int guessNumber = sc.nextInt();
			count++;
			if (guessNumber > number) {
				System.out.println("输入数据大了 ");
			} else if (guessNumber < number) {
				System.out.println("输入数据小了 ");
			} else {
				System.out.println("恭喜 " + count);
				System.exit(0);
			}
		}
	}
		

}
