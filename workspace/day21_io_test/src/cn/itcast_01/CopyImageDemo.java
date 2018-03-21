package cn.itcast_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 上午9:49:15 
* 类说明 
*/
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 使用字符串作为路径
		 * String srcString = "c:\\a.txt";
		 * String destString = "d:\\b.txt";
		 * */
		//使用File对象作为参数
		File srcFile =new File("c:\\a.txt");
		File destFile = new File("d:\\b.txt");
		
		method1(srcFile,destFile);
//		method2(srcFile,destFile);
//		method3(srcFile,destFile);
//		method4(srcFile,destFile);
		
		
	}
	//一次读写一个字节
	private static void method1(File srcFile, File destFile) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		int by = 0 ;
		while((by = fis.read()) != -1){
			fos.write(by);
		}
		
		fos.close();
		fis.close();
	}

}
