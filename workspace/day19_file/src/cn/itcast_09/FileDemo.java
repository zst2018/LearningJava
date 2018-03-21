package cn.itcast_09;

import java.io.File;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午9:46:35 
* 类说明 
* 要求把：E:\评书\三国演义下面的视频名称修改为
* 	00？_介绍.avi
* 思路：
* 	A封装目录
* 	B获取该目录下所有的文件的File 数组
* 	C遍历该File数组，得到每一个File对象
* 	D拼接一个新的名称，然后，重命名即可，
* 
*/
public class FileDemo {
	public static void main(String[] args) {
		
		//封装目录
		File srcFolder = new File("E:\\评书\\三国演义");
		
		//获取该目录下所有的文件的File数组
		File[] fileArray = srcFolder.listFiles();
		
		//遍历该数组得到每一个File对象
		for(File file: fileArray){
			System.out.println(file);
			//E:\评书\三国演义\三国演义_001_[今天很道姓]_桃园三结义.txt
			//E:\评书\三国演义\三国演义_001_桃园三结义.txt
			
			String name = file.getName();
			int index = name.indexOf("_");
			String numberString = name.substring(index+1,index+4 );
			//System.out.println(numberString);
			
//			int startIndex=name.lastIndexOf("_");
//			int endIndex= name.lastIndexOf(".");
//			String nameString = name.substring(startIndex+1,endIndex);
		//		System.out.println(nameString);	
			
			int endIndex = name.lastIndexOf('_');
			String nameString = name.substring(endIndex);
			
			String newName = numberString.concat(nameString);
			//System.out.println(newName);
			
			File newFile = new File(srcFolder,newName);
			
			
			//重命名即可
			file.renameTo(newFile);
		}
		
		
	}

}
