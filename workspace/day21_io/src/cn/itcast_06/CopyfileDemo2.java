package cn.itcast_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午9:14:38 
* 类说明 
* 
*  数据源
* 	a.txt---读取数据---字符转换流
* ---InputStreamReader--fileReader---BufferedReader
* 目的地
* 	b.txt---写出数据--字符转换流
* --OutputStreamWriter--FileWriter---BufferedWriter
* public void newLine()throws IOException写入一个行分隔符。
* 行分隔符字符串由系统属性 line.separator 定义，
* 并且不一定是单个新行 ('\n') 符。
*/
public class CopyfileDemo2 {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//封装目的
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
				
		//读写数据
		String line = null;
		while((line = br.readLine()) != null){
			bw.write(line);//本身没有换行符
			bw.newLine();//换行
			bw.flush();
		}
		
		bw.close();
		bw.close();
	}

}
