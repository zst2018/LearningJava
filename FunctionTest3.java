/*

需求：键盘录入行数和列数，输出对应的星星



import java.util.Scanner;
class FunctionTest3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入行数：");
		int a=sc.nextInt();
		System.out.println("请输入列数：");
		int b=sc.nextInt();
		print(a,b);//单独调用


	}
	public static void print(int n,int m){
		for(int x=1;x<=n;x++){
			for(int y=1;y<=m;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
*/
/*
需求：键盘录入一个数据n(1<=n<=9),输出对应的乘法表

*/
import java.util.Scanner;
class FunctionTest3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据n(1<=n<=9):");
		int n=sc.nextInt();
		//判断n数据的合理行
		if(n<1 ||n>9){
			System.out.println("输入数据有误");
		}else{
			nine(n);//单独调用方法
		}
		//nine(n);  数据N>9
		

	}
	//方法nn乘法表
	public static void nine(int m){
		for(int a=1;a<=m;a++){
			for(int b=1;b<=a;b++){
				System.out.print(a+"*"+b+"="+a*b+" ");
			}
			System.out.println();
		}
	}
}