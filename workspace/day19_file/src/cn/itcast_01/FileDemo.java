package cn.itcast_01;

import java.io.File;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午4:12:01 
* 类说明 
* File  文件和目录（文件夹）路径的抽象表示形式
* 构造方法
* 	File(String pathname)：根据一个路径得到File对象
* File(String parent, String child)：根据一个目录和一个子文件/目录 得到一个File对象
* File(File parent, String child)  ：  根据一个父File对象和一个子文件/目录得到File对象
* 
*/
public class FileDemo {
	public static void main(String[] args) {
		//File(String pathname)：根据一个路径得到File对象
		//把E:\\femo\\a.txt封装成一个File 对象
		File file = new File("E:\\demo\\a.txt");
		
		//File(String parent, String child)：根据一个目录和一个子文件/目录 得到一个File对象
		File file2 = new File("E:\\demo","a.txt");
		
		//File(File parent, String child)  ：  根据一个父File对象和一个子文件/目录得到File对象
		File file3= new File("E:\\demo");
		File file4 = new File(file3,"a.txt");
		
		//以上三种方式，效果是一样的
		
	}

}









