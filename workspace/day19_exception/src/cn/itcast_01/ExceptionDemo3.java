package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 下午7:30:16 
* 类说明 
* JDK7 新的异常处理方案
*/
public class ExceptionDemo3 {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0 ;
		int[] arr = {1,2,3};
		try{
			System.out.println(a/b);
			System.out.println(arr[3]);
			//System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办嗯？");
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ae){
		
			System.out.println("出问题了");
			
		}
		System.out.println("over");
	}

}
