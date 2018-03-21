package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午3:48:15 
* 类说明 
* 字节输入流操作步骤
* 	A 创建字节输入流对象
* 	B 调用read（） 方法读取数据，并输出在控制台
* 	C 释放资源
* 构造方法
* 	FileInputStream(String name)
* 
* 读取数据的方式
* 	A int read():一次读取一个字节
* 	B int read(byte[] b)：一次读取一个字节数组 
*/
public class FileINputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		//FileInputStream(String name)
		FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");
		
//		//调用read（） 方法，并输出在控制台
//		int by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
//		//第二次读取
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
//		//第三次读取
//		 by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
//		//代码重复度较高，用循环改进
//		//而循环的难点是，如何控制循环判断条件
//		
//		//第四次读取
//		 by = fis.read();
//		System.out.println(by);   //-1
//		System.out.println((char)by);  //-1
//		//如果控制台输出是-1 ，说明文件的读取已到末尾了
//		
		
		
		//改进
//		int by = fis.read();
//		while(by != -1){
//			System.out.print((char)by);
//			by = fis.read();
//		}
		//最终版
		int by = 0 ;
		//读取  赋值 判断
		while((by=fis.read()) != -1){
			System.out.print((char)by);
		}
		
		//释放资源
		fis.close();
		
	}

}
