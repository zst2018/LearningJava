package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午3:59:25 
* 类说明 
* System.in 标准输入流，就是从键盘获取数据的
* 键盘录入数据：
* 		A main方法的args接收参数
* 			java hello World hello world java 
* 
* 		B  Scanner 
* 			Scanner sc = new Scanner(System.in);
* 			String s = sc.nextString();
* 			int x = sc.nextInt();
* 		C 通过字符缓冲流包装标准输入流实现
* 
* 
*/
public class SystemOutDemo {
	public static void main(String[] args) throws IOException {
		//获取标准的输入流
//		InputStream is = System.in;
//		
//		//如果要实现一次读取一行，需要调用readLine()方法
//		//该方法在BUfferedReader中。
//		//创建BUfferedReader 对象
//		//BufferedReader br = new BufferedReader(is);
//		//编译报错原因是，字符缓冲流只能针对字符流操作。而现在是字节流，
//		
//		//把字节流转化成字符流，再通过字符流操作
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("请输入一个字符串：");
		String line = br.readLine();
		System.out.println("你输入的字符串是："+line);
		
		System.out.println("请输入一个数据：");
		//int i = Integer.parseInt(br.readLine());
		line = br.readLine();
		int i = Integer.parseInt(line);
		System.out.println("你输入的数据是："+i);
		
		
	}

}













