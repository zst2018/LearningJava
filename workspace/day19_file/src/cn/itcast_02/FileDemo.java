package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午4:41:45 
* 类说明 
* 创建功能
* public boolean createNewFile() 创建文件，如果存在这样的文件，就不创建了。返回false
* public boolean mkdir()   创建文件夹，如果存在这样的文件夹，就不创建了。返回false
* public boolean mkdirs()  创建文件夹，如果父文件夹不存在，会帮你创建出来
*/
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//需求：在E盘目录下创建一个文件夹Demo
		File file = new File("E:\\demo");
		System.out.println("mkdir:"+file.mkdir());
		//返回true  创建文件夹成功
		
		
		
		//需求：在E盘目录demo下创建一个文件 a.txt
		File file2 = new File("E:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		
	
		//注意：要想在某个目录下创建内容，该目录首先必须存在
		
		
		
		//需求：在E盘目录test下创建aaa文件
		
		//注意：要想在某个目录下创建内容，该目录首先必须存在
		
		/*File file3 = new File("E:\\test\\aaa");
		System.out.println("mkdir:"+file3.mkdir());
		*/
		
		
		//改进前
	/*	File file4 = new File("E:\\test");
		File file5 = new File("E:\\test\\aaa");
		System.out.println("mkdir:"+file4.mkdir());
		System.out.println("mkdir:"+file5.mkdir());*/
		
		
		//改进后
		File file6 = new File("E:\\test\\eee\\ff\\yy");
		System.out.println("mkdir:"+file6.mkdirs());
		
		
		
		File file7 = new File("E:\\test\\eee\\ff\\yy.txt");
		System.out.println("mkdir:"+file7.mkdirs());
		
	}
	

}
