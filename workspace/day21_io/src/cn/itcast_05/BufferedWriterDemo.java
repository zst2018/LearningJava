package cn.itcast_05;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午8:23:07 
* 类说明 
* 字符流称为高效读写，提供了相应的字符缓冲流
* BufferedWriter 字符缓冲输出流
* BufferedReader 字符缓冲输入流
* 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
* 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 
* 
*/
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//BufferedWriter(Writer out)
//		BufferedWriter bw = new BufferedWriter(
//				new OutputStreamWriter(new FileOutputStream("b.txt")));
//		
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		bw.write("hello");
		bw.write("world");
		bw.write("java");
		
		bw.flush();
		
		bw.close();
	}

}
