package cn.itcast_04;

import java.io.PrintStream;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午3:48:58 
* 类说明 
* 标准输入输出流
* System类中的两个成员变量
* 
* 		public static final InputStream in  “标准”输入流
* 		public static final PrintStream out  “标准”输出流
* 
* 		InputStrem    is = system.in
* 		Printstream   ps = System.out
* 
* 
*/
public class SystemInDemo {
	public static void main(String[] args) {
		//这个输出语句的本质是IO流操作，把数据输出到控制台
		System.out.println("helloworkd");
		
		//获取标准输出流对象
		PrintStream ps = System.out;
		ps.println("helloworld");
		
		
		ps.println();
		//ps.print();;
		//print() 方法不存在
		
	}

}
