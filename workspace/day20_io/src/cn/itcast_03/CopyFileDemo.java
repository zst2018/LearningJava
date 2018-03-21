package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午4:17:24 
* 类说明 
* 复制文本文件
* 	数据源：从哪里来    
* 		a.txt--读取数据---FileInputStream
* 	目的地: 到哪里去  
* 		 b.txt--写数据---FileOutputStream
* 
*复制中文没有任何问题，原因：
*首先。获取一个字节数据就把该字节数据转换成字符数据，输出在控制台，中文部分出现了；乱码
*这次，通过IO 流 读取数据，写到文本文件，读取一个字节就写入一个字节，你没有做任何的转换，
*它自己做转换
* 
*/
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("fos2.txt");
		
		//封装目的地
		FileOutputStream fos = new FileOutputStream("fos3.txt");
		
		int by = 0 ;
		while((by=fis.read()) != -1){
			fos.write(by);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}

}
