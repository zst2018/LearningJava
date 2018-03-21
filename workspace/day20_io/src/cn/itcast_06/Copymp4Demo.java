package cn.itcast_06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午1:52:46 
* 类说明 
* 
* 需求：把E:\\哥有老婆.mp4 复制到当前项目目录下的copy.mp4中
* 
* 
* 字节流四种方式复制文件
* 基本字节流---一次读写一个字节
* 基本字节流---一次读写一个字节数组
* 高效字节流--一次读写一个字节
* 高效字节流---一次读写一个字节数组
* 
*/
public class Copymp4Demo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		method1("E:\\哥有老婆.mp4","copy.mp4");
//		method2();
//		method3();
//		method4();
		long end = System.currentTimeMillis();
		
		
		
	}
		//基本字节流---一次读写一个字节
	public static void method1(String srcString,String destString) throws IOException{
		FileInputStream fis = new FileInputStream(srcString);
		
		FileOutputStream fos = new FileOutputStream(destString);
		
		int by = 0 ;
		while((by = fis.read()) != -1){
			fos.write(by);
		}
		
		
		fos.close();
		fis.close();
				
	}
	
	//基本字节流---一次读写一个字节数组
	public static void method2(String srcString,String destString) throws IOException{
		FileInputStream fis = new FileInputStream(srcString);
		
		FileOutputStream fos = new FileOutputStream(destString);
		
		byte[] bys=new byte[1024];
		int len = 0 ;
		while((len = fis.read(bys)) != -1){
			fos.write(bys,0,len);
		}
		
		
		fos.close();
		fis.close();
				
	}
	
	//高效字节流--一次读写一个字节
	public static void method3(String srcString,String destString) throws IOException{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		
		int by = 0 ;
		while((by=bis.read()) != -1){
			bos.write(by);
		}
		bos.close();
		bis.close();
	}
	
	//高效字节流--一次读写一个字节
		public static void method4(String srcString,String destString) throws IOException{
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
			
			byte[] bys = new byte[1024];
			int len = 0 ;
			while((len=bis.read(bys)) != -1){
				bos.write(bys,0,len);
			}
			bos.close();
			bis.close();
		}
}
