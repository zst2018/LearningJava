package cn.itcast_02;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午7:17:52 
* 类说明 
* InputStreamReader的方法
* int read（） 一次读取一个字符
* int read（char[] chs） 一次读取一个字符数组
* 
*/
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("StringDemo.java"));
		
		//一次读取一个字符
		int ch = 0 ;
		while((ch = isr.read()) != -1){
			System.out.println((char) ch);
		}
		
		//一次读取一个字符数组
		char[] chs = new char[1024];
		int len = 0 ;
		while((len=isr.read(chs)) != -1){
			System.out.print(new String(chs,0,len));
		}
		//关闭资源
		
		isr.close();
	}

}
