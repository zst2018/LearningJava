package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午4:35:28 
* 类说明 
* 把C盘下的一个a.txt 复制到D 盘的b.txt
* 数据源
* 	c:\\a.txt ----读取数据---FileInputStream
* 目的地
* 	 d:\\b.txt----写数据---FileOutputStream
* 
* 
*/
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("C:\\a.txt");
				
		//封装目的地
		FileOutputStream fos = new FileOutputStream("D:\\b.txt");
			
		int by = 0 ;
		while((by=fis.read()) != -1){
			fos.write(by);
		}
		
		
		
		
	}

}
