/*
注意：case后面只能是常量，不能是变量，而且多个case后面的值不能出现相同的

default 可以省略，但是不建议，因为default是对不正确的情况给出提示
特殊情况：
case就可以把值固定：A,B,C,D
break  可以省略，但是结果可能不是我们想要的，会出现case穿透
建议不要省略
default 可以出现在switch语句的任意位置，但是，建议在最后位置
switch 语句的结束条件：break

*/
import java.util.Scanner;
class SwitchDemo2{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据：");
		int month=sc.nextInt();
		switch(month){
			case 1:
			System.out.println("冬季");
			break;
			case 2:
			System.out.println("冬季");
			break;

			case 12:
			System.out.println("冬季");
			break;
			default:
			System.out.println("你输入的数据不是冬季");
			break;
	
		}

	}


}
