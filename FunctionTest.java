/*
需求：比较两个数据的大小，输出较大数据
明确：参数列表  2 个 int 类型
返回值  ：int 较大值
需求：比较两个数书否相等
明确：参数列表 2 个 int类型
返回值  Boolean 类型
需求： 键盘录入三个数据。返回最大值、
明确： 参数列表  3个 int类型
返回值类型  int

*/
import java.util.Scanner;
class FunctionTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int x=sc.nextInt();
		System.out.println("请输入第二个数据：");
		int y=sc.nextInt();
		System.out.println("请输入第三个数据：");
		int z=sc.nextInt();
		int max1=sum1(x,y,z);
		System.out.println("最大数是："+max1);

		//int max=compare(x,y);
		//System.out.println("较大值是："+max);
		boolean eq=equal(x,y);
		System.out.println(eq);

	}
	public static int compare(int a,int b){
		int c=(a>=b)?(a):b;

		return c;
	}
	public static boolean equal(int a,int b){
		boolean c =(a==b)?(true):(false);
		return c;
		//return a==b;//（最终优化结果）
	}
	public static int sum1(int a,int b,int c){
		int d;
		d=(a>=b)?(a>=c?a:c):(b>=c?b:c);
		return d;
		//int tempt=(a>b)?a:b ;
		//int max=(tempt>c)?tempt:c ;    





		       
	}


}