package cn.itcast_08;

import java.io.File;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午9:15:09 
* 类说明 
* 判断E盘目录下是否有后缀名为.jpg 的文件，如果有，就输出此文件名称
* 分析
* 	A 封装E盘判断目录
* 	B 获取该目录下所有文件或者文件夹的File数组
* 	C 遍历该File数组，得到内一个File对象，然后判断
* 	D 是否是文件
* 		是  继续判断是否以.jpg结尾
* 			是  就输出该文件名称
* 			否 不搭理它
* 		否 不搭理它
* 
* 
* 
*/
public class FileDemo {
	public static void main(String[] args) {
		//封装E盘判断目录
		File file = new File("E:\\");
		
		//获取该目录下所有文件或者文件夹的File数组
		File[] fileArray= file.listFiles();
		
		//遍历File数组，得到每一个File对象，然后判断
		for(File f : fileArray){
			//是否是文件
			if(f.isFile()){
				//继续判断是否以.jpg 结尾
				if(f.getName().endsWith(".jpg")){
					//输出该文件的名称
					System.out.println();
				}
				
			}
			
		}
		
		
		
		
	}
	

}


















