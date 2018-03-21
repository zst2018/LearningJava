package cn.itcast_04;

import java.io.File;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午7:51:50 
* 类说明 
* 重命名功能
* 	public Boolean renameTo(File dest)
* 如果路径名相同，就是改名
* 如果路径名不同，就是剪切+改名
* 
* 
* 路径以盘符开始：绝对路径	a:\\a.txt
* 路径不以盘符开始：相对路径 a.txt
* 
* 
* 
*/
public class FileDemo {
	public static void main(String[] args) {
	/*	//创建一个文件对象
		File file = new File("林青霞.jpg");
		//需求：我要修改这个文件的名称为  东方不败.JPG
		File newFile = new File("东方不败.jpg");
		
		System.out.println("renameTo:"+file.renameTo(newFile));*/
		
		//相对路径
		File file2 = new File("东方不败.jpg");
		//绝对路径
		File newFile2 = new File("E:\\林青霞.jpg");
		
		System.out.println("renameTo:"+file2.renameTo(newFile2));
		
	}

}
