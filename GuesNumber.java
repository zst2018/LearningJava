/*
猜字小游戏
		分析：
			A：程序产生一个随机数，（被猜的）
			B:键盘录入数据（你猜的）
			C:把你猜的和被猜的做比较
			  a:大
			  b:小
			  c:猜中了、
			D：给出多次猜的机会，猜中就结束
				while（） 循环 ，猜中就break
*/
				//导包
import java.util.Scanner;
class GuesNumber{
	public static void main(String[] args){
		//生成一个随机数。调用工具类中的静态方法math.random()
		int number=(int)(Math.random()*100)+1;
		//System.out.println(number);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你猜测的数据（1~100）：");
		//获取猜的数字
		int s=sc.nextInt();
		//随机数和猜的数进行比较 s不等于number 的时候，进入while 循环，
	/*	while(s!=number){
			if(s>number){
				System.out.println("输入的数据大了");
			}else{
				System.out.println("输入的数据小了");	
			}
			System.out.println("请再次                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
				输入你猜测的数据（1~100）：");
		    s=sc.nextInt();
		    

		}

	
		System.out.println("恭喜你，回答正确");
		*/

while(true){
	if(s>number){
		System.out.println("你猜的数据大了");
	}else if(s<number){
		System.out.println("你猜的数据小了");

	}else{
		System.out.println("恭喜你，猜中了");
		break;//break 语句要加在 if 语句中
	}
	System.out.println("请再输入一次数据");
    s=sc.nextInt();
    
	
}
	}
}


/*
//该结构只能实现一次判断
while(true){
	if(s>number){
		System.out.println("你猜的数据大了");
	}else if(s<number){
		System.out.println("你猜的数据小了");

	}else{
		System.out.println("恭喜你，猜中了");
	}
	break;(在循环语句中，如果有if 语句，要考虑是否加break，   然后考虑  break 语句加在哪里)
}*/


/*
// 该结构可以实现猜字游戏的多次循环。但是不能够跳出程序，需要加break 语句
while(true){
	if(s>number){
		System.out.println("你猜的数据大了");
	}else if(s<number){
		System.out.println("你猜的数据小了");

	}else{
		System.out.println("恭喜你，猜中了");
	}
	System.out.println("请再输入一次数据");
    s=sc.nextInt();
	
}

*/