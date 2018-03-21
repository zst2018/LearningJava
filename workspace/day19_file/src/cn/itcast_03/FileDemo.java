package cn.itcast_03;

import java.io.File;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午7:26:19 
* 类说明 
* 删除功能
* public boolean delete()  删除文件，文件夹
* 
* 注意：
* 	如果创建文件或者目录没有写盘符路径，则默认在项目路径下
* 	java中的删除不走回收站
*   要删除一个文件夹，文件夹内不能包含文件或其他的文件夹
* 	
* 
*/
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//创建文件
		/*File file = new File("E:\\a.txt");
		System.out.println("createNewFile:"+file.createNewFile());*/
		
		//不小心写成这个样子了
		File file = new File("a.txt");
		System.out.println("createNewFile:"+file.createNewFile());
		//E:\ZHANFSUTING\javacode\workspace\day19_file\src\cn\itcast_03\FileDemo.java
		//如果创建文件或者目录没有写盘符路径，则默认在项目路径下
		
		//继续
		File file2 = new File("aaa\\bb\\c");
		System.out.println("mkdirs:"+file2.mkdirs());
		
		//删除a.txt 文件
		File file3 = new File("a.txt");
		System.out.println("delete:"+file3.delete());
		
		//删除功能：删除  c 这个文件夹
		File file4 = new File("aaa\\bb\\c");
		System.out.println("delete:"+file4.delete());
		
		//删除功能：删除   aaa这个文件夹
		File file5 = new File("aaa");
		System.out.println("delete:"+file5.delete());
		//返回false
		
		
		//File file7 = new File("bb");
		File file6 = new File("aaa\\bb");
		File file7 = new File("aaa");
		
		System.out.println("delete:"+file6.delete());
		System.out.println("delete:"+file7.delete());
		//返回false  false
		//返回 true   true 
		
		
		
	}

}
