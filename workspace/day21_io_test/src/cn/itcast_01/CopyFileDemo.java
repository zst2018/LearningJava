package cn.itcast_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 上午9:20:28 
* 类说明 
* 复制文本文件
* 	分析  复制数据，如果能用记事本打开并能够读懂，就用字符流，否则用字节流
* 	字符流有5 种方式
* 
*/
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		String srcString = "c:\\a.txt";
		String destString = "d:\\b.txt";
	//	method1(srcString,destString);
	//method2(srcString,destString);
		//method3(srcString,destString);
	//method4(srcString,destString);
		method5(srcString,destString);
		
		
	}
	//字符缓冲流一次读写一个字符串
	private static void method5(String srcString, String destString) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		String line = null;
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

	private static void method4(String srcString, String destString) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		char[] chs = new char[1024];
		int len = 0 ;
		while((len = br.read(chs)) != -1){
			bw.write(chs,0,len);
		}
		bw.close();
		br.close();
		
	}

	private static void method3(String srcString, String destString) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
		
		int ch = 0 ;
		while((ch = br.read()) != -1){
			bw.write(ch);
		}
		bw.close();
		br.close();
	}

	private static void method2(String srcString, String destString) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);
		
		char[] chs = new char[1024];
		int len = 0 ;
		while((len = fr.read(chs)) != -1){
			fw.write(chs,0,len);
		}
		fw.close();
		fr.close();
	}

	private static void method1(String srcString, String destString) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(destString);
		
		int ch = 0 ;
		while((ch = fr.read()) != -1){
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	

}
