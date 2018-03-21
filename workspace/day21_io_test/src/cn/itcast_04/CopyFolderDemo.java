package cn.itcast_04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 下午2:20:55 
* 类说明 
* 需求：复制指定目录CIA的指定文件，并修改后缀名
* 指定的文件是 .java文件
* 指定的后缀名  .jad
* 指定的目录  jad
* 
* 数据源：e:\\java\\A.java
* 目的地 ： e:\\jad\\A.jad
* 
* 分析
* 	A封装目录
* 	B获取该目录下的所有java文件或文件夹
* 	C遍历该File数组，得到每一个File对象
* 	D把该File进行复制
* 	E 在目的地目录下改名
*/
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		//封装目录
		File srcFolder = new File("e:\\java");
		//封装目的地
		File destFolder = new File("e:\\jad");
		
		//如果目的地目录不存在就创建
		if(!destFolder.exists()){
			destFolder.mkdir();
		}
		//获取该目录下的java文件数组
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile() && name.endsWith(".java");
				
				
			}
		});
		
		//遍历该File数组，得到每一个File对象
		for(File file : fileArray){
			//System.out.println(file);
			
			String name = file.getName();
			File newFile= new File(destFolder,name);
			copyFile(file,newFile);
		}
		
		//在目的地下该名
		File[] destFileArray= destFolder.listFiles();
		for(File destFile : destFileArray){
			//System.out.println(destFileArray);
			//e:\\jad\\DataTypeDemo.java
			//e:\\jad\\DataTypeDemo.jad
			
			String name = destFile.getName();
			//DataTypeDemo.java
			String newName = name.replace(".java",".jad");
			
			File newFile = new File(destFolder,newName);
			
			destFile.renameTo(newFile);
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









