package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午5:09:34 
* 类说明 
* 
* 把E:\\哥有老婆.mp4复制到当前目录下的copy.mp4
* 数据源
* 	E:\\哥有老婆.mp4---读取数据--FileInputStream，
* 目的地
* 	当前目录下copy.mp4---写出数据---FileOutputStream
*/
public class CopyMp4Demo {
	public static void main(String[] args) throws IOException {
		//创建数据源
		FileInputStream fis = new FileInputStream("E:\\哥有老婆.mp4");
		//创建目的地
		FileOutputStream fos = new FileOutputStream("copy.mp4");
				
		int by = 0;
		while((by = fis.read()) != -1){
				fos.write(by);
		}
				
		fos.close();
		fis.close();
	}

}
