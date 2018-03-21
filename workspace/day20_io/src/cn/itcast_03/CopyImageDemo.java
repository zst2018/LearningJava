package cn.itcast_03;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午4:58:24 
* 类说明 
* 把E:\\林青霞.jpg 内容复制到当前项目先的mn.jpg中
* 
* 数据源
* 	E:\\林青霞.jpg---读取数据--FileInputStream，
* 目的地
* 	当前目录下mn.jpg---写出数据---FileOutputStream
* 
* 
*/
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		//创建数据源
		FileInputStream fis = new FileInputStream("E:\\林青霞.jpg");
		//创建目的地
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		int by = 0;
		while((by = fis.read()) != -1){
			fos.write(by);
		}
		 
		
		fos.close();
		fis.close();
		
	}

}
