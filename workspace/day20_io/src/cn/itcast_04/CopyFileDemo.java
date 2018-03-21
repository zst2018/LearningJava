package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午12:42:28 
* 类说明 
* 图片，视频，文本
* 把E:\\林青霞.jpg 内容复制到当前项目先的mn.jpg中
* 
* 数据源
* 	E:\\林青霞.jpg---读取数据--FileInputStream，
* 目的地
* 	当前目录下mn.jpg---写出数据---FileOutputStream
* 
* 
*/
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//创建数据源
		FileInputStream  fis = new FileInputStream("E:\\林青霞.jpg");
		
		//创建目的地
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		//复制数据
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys)) != -1){
			fos.write(bys,0,len);
		}
		
		fos.close();
		fis.close();
		
	}

}
