package cn.itcast_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午9:05:08 
* 类说明 
* 
* 数据源
* 	a.txt---读取数据---字符转换流
* ---InputStreamReader--fileReader---BufferedReader
* 目的地
* 	b.txt---写出数据--字符转换流
* --OutputStreamWriter--FileWriter---BufferedWriter
*/
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		//两种方式
		char[] chs = new char[1024];
		int len = 0 ;
		while((len = br.read(chs)) != -1){
			bw.write(chs,0,len);
			bw.flush();
		}
		
		bw.close();
		br.close();
		
	}

}
