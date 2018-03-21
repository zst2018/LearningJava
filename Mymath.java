/*
定义一个mymath 类，实现基本的加减乘除

*/
//导包
import java.util.Scanner;
class MymathDemo{
	//加法
	public int add(int a,int b){
		return a+b;

	}
	//减法
	public int sub(int a,int b){
		return a-b;
	}
	//乘法
	public int mul(int a,int b){
		return a*b;
	}
	//除法
	public int div(int a,int b){
		return a/b;
	}
}
class Mymath{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int firstNumber=sc.nextInt();
		System.out.println("请输入第二个数据：");
		int secondNumber=sc.nextInt();
		//创建mymath 类
		MymathDemo m=new MymathDemo();
		//控制台输出
		System.out.println("加法的结果是："+m.add(firstNumber,secondNumber));
		System.out.println("减法的结果是："+m.sub(firstNumber,secondNumber));
		System.out.println("乘法的结果是："+m.mul(firstNumber,secondNumber));
		System.out.println("除法的结果是："+m.div(firstNumber,secondNumber));

	}
}