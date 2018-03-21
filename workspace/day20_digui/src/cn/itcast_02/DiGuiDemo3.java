package cn.itcast_02;

import java.io.File;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 上午11:09:59 
* 类说明 
* 把E：\resource\ZHANGSUTING\javacode目录下，所有以java结尾的文件的绝对路径输出在控制台
* 
* 分析
* 	A封装目录
* 	B 获取该目录CIA所有的文件或文件夹的File数组
* 	C 遍历该File 数组，得到一个File对象
* 	D判断该File对象是否是文件夹
* 		是  回到B
* 		否  判断是否以.java 结尾
* 			是  就输出该文件的绝对路径
* 			否  不搭理它
* 
*/
public class DiGuiDemo3 {
	public static void main(String[] args) {
		//创建目录
		File srcFolder= new File("E:\\resource");
		
		//递归功能实现
		getAllJavaFilePaths(srcFolder);
	}

	private static void getAllJavaFilePaths(File srcFolder) {
		// TODO Auto-generated method stub
		//获取该目录下所有的文件或文件夹的File 数组
		File[] fileArray = srcFolder.listFiles();
		
		//遍历File数组，得到每一个File对象
		
		for(File file : fileArray){
			//判断该File是否是文件夹
			if(file.isDirectory()){
				getAllJavaFilePaths(file);
			}else{
				if(file.getName().endsWith(".java")){
					//输出java文件的绝对路径
					System.out.println(file.getAbsolutePath());
				}
				
			}
		}
	}
	

}
