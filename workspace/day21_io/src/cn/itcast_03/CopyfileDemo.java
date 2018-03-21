package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午7:30:50 
* 类说明 
* 数据源
* 	a.txt---读取数据---字符转换流---InputStreamReader
* 目的地
* 	b.txt---写出数据--字符转换流--OutputStreamWriter
* 
*/
public class CopyfileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("a.txt"));
		
		//封装目的地
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("b.txt"));
		
		//读数据
		int ch= 0 ;
		while((ch = isr.read()) != -1){
			osw.write(ch);
			
		}
	
		
		//方式2 
		char[] chs = new char[1024];
		int len = 0 ;
		while((len = isr.read(chs)) != -1){
			osw.write(chs,0,len);
		}
		
		
		osw.close();
		isr.close();
		
	}

}
