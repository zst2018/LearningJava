package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 下午6:53:03 
* 类说明 
* 多个异常
*/
public class ExceptionDemo2 {
	public static void main(String[] args) {
	//	method1();
		//method2();
		//method3();
		method4();
		
		
	}

	public static void method4() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0 ;
		int[] arr = {1,2,3};
		try{
			System.out.println(a/b);
			System.out.println(arr[3]);
			System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办嗯？");
			
		}catch(ArithmeticException ae){
			System.out.println("除数不能是0");
		}catch(ArrayIndexOutOfBoundsException am){
			System.out.println("你访问了不该访问的索引");
		}catch(Exception e){
			//在不确定议程类名的时候，可以用其父类表示，
			System.out.println("出问题了");
			
		}
		System.out.println("over");
		
	}

	public static void method3() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0 ;
		int[] arr = {1,2,3};
		try{
			System.out.println(a/b);
			System.out.println(arr[3]);
			
		}catch(ArithmeticException ae){
			System.out.println("除数不能是0");
		}catch(ArrayIndexOutOfBoundsException am){
			System.out.println("你访问了不该访问的索引");
		}
		System.out.println("over");
		
	}

	public static void method2() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0 ;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException ae){
			System.out.println("除数不能是0");
		}
		int[] arr = {1,2,3};
		try{
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException am){
			System.out.println("你访问了不该访问的索引");
		}
		System.out.println("over");
		
	}

	public static void method1() {
		// TODO Auto-generated method stub
		//第一阶段程序
				int a = 10;
				//int b = 2;
				int b = 0;//运行时异常
				try{
				System.out.println(a/b);
				//第二阶段程序
				}catch(ArithmeticException ae){
					System.out.println("除数不能是0");
					
				}
				System.out.println("over");	
			}
	

}
