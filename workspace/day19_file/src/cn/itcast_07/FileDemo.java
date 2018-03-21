package cn.itcast_07;

import java.io.File;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午8:54:12 
* 类说明 
* 高级获取功能
* 	public String[] list()  获取指定目录下的所有文件或者文件夹的名称数组
* 		返回字符串数组，该字符串是指定此抽象路径名表示的目录中的文件和目录
* 	public File[] listFiles() 获取指定目录下的所有文件或者文件夹的File数组
* ，		返回的是File 对象，而对象可以拿名称，相对路径绝对路径  最大值等
* 
*/
public class FileDemo {
	public static void main(String[] args) {
		//指定一个目录
		File file = new File("E:\\");
		
		//public String[] list()  获取指定目录下的所有文件或者文件夹的名称数组
		String[] strArray = file.list();
		for(String s : strArray){
			System.out.println(s);
			
		}
		System.out.println("-------------");
		
	//public File[] listFiles() 获取指定目录下的所有文件或者文件夹的File数组
		File[] fArray = file.listFiles();
		//返回的是File 对象，而对象可以拿名称，相对路径绝对路径  最大值等
		for(File f : fArray){
			//System.out.println(f);
			System.out.println(f.getName());
			
		}
		
		
		
		
	}

}
