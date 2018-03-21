/*
math  类  包含用于执行基本数学运算的方法
由于  其包是java.lang 不需要导包
特点：
	没有构造方法。应为其成员变量时静态的

	工具类中静态方法的调用方法：
		工具类名.方法名(形式参数)
	工具类中非静态方法的调用方式：
		定义对象，通过对象调用方法


获取随机数的方法
*/
import java.util.Scanner;
class MathDemo{
	public static void main(String[] args){
		//public static double random()
		double d=Math.random();
		System.out.println(d);
		//需求：获取一个1~100之间的随机数
		if(d>=0.01&&d<=1.0){
				System.out.println(d*100);
		}
		//获取1~100  整数类型的随机数
		for(int x=0;x<100;x++){
			//强制转换   +1  是为了取到  1  和100 两个数
			int number=(int)(Math.random()*100)+1;
			System.out.print(number+", ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据：");

		//获取一个int 类型的绝对值
		//int a=sc.nextInt();
		//System.out.println(Math.abs(a));

		//获取 一个 double 类型的绝对值
		double b=sc.nextDouble();
		//当数据类型是double float 或者其他类型时，要注意next后面的数据类型
		System.out.println(Math.abs(b));

		//获取最接近一个数的int 类型
		System.out.println(Math.round(b));

		//获取 一个double值的双曲线余弦
		System.out.println(Math.tanh(b));


	}
}