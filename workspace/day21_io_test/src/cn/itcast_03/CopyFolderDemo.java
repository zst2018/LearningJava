package cn.itcast_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 下午1:38:35 
* 类说明 
* 需求：赋值单级文件夹
* 数据源
* 	e.\\demo
* 目的地
* e:\\test
* 分析
* 	A封装目录
* 	B获取该目录下的所有文件或文件夹
* 	C遍历该File数组，得到每一个File对象
* 	D把该File进行复制
* 
* 
*/
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		//封装目录
		File srcFolder = new File("E:\\demo");
		//封装目的地
		File destFolder = new File("E:\\test");
		//如果目的地的文件夹不存在，就创建
		if(!destFolder.exists()){
			destFolder.mkdir();
			
		}
		
		//获取文件的file 数组
		File[] fileArray = srcFolder.listFiles();
		for(File file: fileArray){
			System.out.println(file);
			//数据源：e.\\demo\\e.mp3
			//目的地：e:\\test\\e.mp3
			String name = file.getName();//e.mp3
			File newFile = new File(destFolder,name);//e:\\test\\e.mp3
			
			copyFile(file,newFile);
			
			
		}
	}

	private static void copyFile(File file, File newFile) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file));
		
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));
		
		byte[] bys = new byte[1024];
		int len = 0 ;
		while((len=bis.read(bys)) != -1){
			bos.write(bys,0,len);
		}
		bis.close();
		bos.close();
	}

}











