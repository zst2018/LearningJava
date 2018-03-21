package cn.itcast_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午4:25:07 
* 类说明 
* 转换流的应用
* 
* 
*/
public class SystemOutDemo2 {
	public static void main(String[] args) throws IOException {
		//获取标准输入流
//		PrintStream ps = System.out;
//		
//		OutputStream os = ps;
		
//		OutputStream os = System.out;   //多态
//		
//		//把标准的字节流转成字符流
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		bw.write("hewll0");
		bw.newLine();
		bw.write("world");
		bw.newLine();
		bw.write("java");
		bw.flush();
		
		bw.close();
		
	}

}
