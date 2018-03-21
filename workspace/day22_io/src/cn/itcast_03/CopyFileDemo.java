package cn.itcast_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午3:06:56 
* 类说明 
* 需求：DataStreamDemo.java复制到copy.java 中
* 数据源
* 	DataStreamDemo.java---读取数据---FileReader--BufferedReader
*
* 目的地
* 	Copy.java--写出数据--FileWriter---BufferedWriter----PrintStream 
* 
* 
*/
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		
		//前版本
		//封装数据源
		//BufferedReader br = new BufferedReader(new FileReader("DataStreamDemo.java"));
		//封装目的地
//		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
//		
//		String line = null;
//		while((line = br.readLine()) != null){
//			bw.write(line);
//			bw.newLine();
//			bw.flush();
//		}
//		bw.close();
//		br.close();
		
		//打印流的改进版本
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("DataStreamDemo.java"));
		//封装目的地
		PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"),true);
		
		String line = null;
		while((line = br.readLine()) != null){
			
			pw.println(line);
		}
		br.close();
		pw.close();
		
	}

}
