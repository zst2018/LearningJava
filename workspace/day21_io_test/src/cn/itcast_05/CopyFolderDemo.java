package cn.itcast_05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 下午3:19:18 
* 类说明 
*需求：复制多级文件夹
*数据源  E：\\javaSe \day21\code\demos
*目的地 E:\\
*分析：
*	 A 封装数据源File
*	 B 封装目的地File
*	 C 判断该File 是文件夹还是文件
*		a:是文件夹
*			就在目的地目录下创建该文件夹
*			获取该File对象下的所有文件或者文件夹File对象
*			遍历得到每一个File对象
*			回到C （递归）
*
*		b:是文件
*			就复制（字节流）
* 
*/
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		File srcFile = new File("E:\\javaSe\\day21\\code\\demos");
		
		//封装目的地File
		File destFile = new File("E:\\");
		
		//复制文件夹的功能
		copyFolder(srcFile,destFile);
		
		
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException {
		// TODO Auto-generated method stub
		//判断该File 是文件夹还是文件
		if(srcFile.isDirectory()){
			//是文件夹
			File newFolder = new File(destFile,srcFile.getName());
			newFolder.mkdir();
			File[] fileArray = srcFile.listFiles();
			for(File file : fileArray){
				copyFolder(file,newFolder);
			}
			
		}else{
			//b:是文件
			File newFile = new File(destFile,srcFile.getName());
			
			copyFile(srcFile,newFile);
			
			
			
		}
		
	}

	private static void copyFile(File srcFile, File newFile) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(srcFile));
		
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














