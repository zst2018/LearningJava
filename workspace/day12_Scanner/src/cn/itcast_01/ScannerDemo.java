package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月13日 上午10:14:23 
* 类说明 
* Scanner ：  用于接收键盘录入数据
* 导包，创建对象，调用方法
* System类下有一个静态的字段
* public static final InputStream in;
* 标准的输入流，对应着键盘录入，键盘录入的都是字符串的类型
* 
* System.in 是什么类型的   InputStream   
* InputStream  is = System.in ;
* 
* 
* class Demo{
* 	public static final int x = 10;//基本类型
* 	
* 	public static final Student s = new Student();//引用类型
* 
* 	
* }
* Demo.x;是个什么类型的值  是int的数据类型
* int y = Demo.x;  成立
* Demo.s ; 是什么类型的    学生对象
* Student s = Demo.s;
* 
* 
* 
* 
* 
* 
*/
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//  构造方法  Scanner（InputStream source）
		//类名后面括号里有声明，表示是带参的构造方法
		//system为类，.in 是变量 ,而且是静态变量  如果是方法，应该是 .in()
		//system.in 标准输入流，此流已打开并准备提供输入数据。通常此流对应于键盘输入或者主机环境或由主机环境或用户指定的另一个输入源。
		int x = sc.nextInt();
		System.out.println("x:"+x);
		
	}

}
