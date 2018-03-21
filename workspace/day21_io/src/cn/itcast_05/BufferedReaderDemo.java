package cn.itcast_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午8:39:02 
* 类说明 
* BufferedReader 
* 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。 
* 可以指定缓冲区的大小，或者可使用默认的大小。大多数情况下，默认值就足够大了
* BufferedReader(Reader in)
* 
*/
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建字符缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
		
		//方式1
		int ch = 0 ;
		while((ch = br.read()) != -1){
			System.out.print((char)ch);
			
		}
		
		//方式2 
		char[] chs = new char[1024];
		int len = 0 ;
		while((len = br.read(chs)) != -1){
			System.out.println(new String(chs,0,len));
		}
		
		//释放资源
		br.close();
		
		
		
	}

}
