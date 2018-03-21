package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月16日 下午5:23:30 
* 类说明 
*/
import java.util.Scanner;
public class GuessNumberGame {
	private GuessNumberGame(){}
	public static void start(){
		//产生一个随机数】、
		int number = (int)(Math.random()*100)+1;
		
		
		while(true){
		// 键盘录入一个数字
		
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜的数据(1~100):");
			int guessNumber = sc.nextInt();
		
			if(number>guessNumber){
				System.out.println("你输入的数据较小");
			}else if(number<guessNumber){
				System.out.println("你输入的数据较大");
			}else{
				System.out.println("输入正确！");
				break;
			}
		}
		
	}
	

}
