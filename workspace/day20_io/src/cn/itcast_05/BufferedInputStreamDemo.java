package cn.itcast_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午1:35:51 
* 类说明 
* 缓冲区读数据
* 
* 注意：
* 	虽然我们有两种方式可以读取，但是，这两种方式针对同一个对象在一个代码中只能使用一个、
* 
* 
* 
*/
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//BufferedInputStream(InputStream in)
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("bos.txt"));
		
//		int by = 0 ;
//		while((by = bis.read()) != -1){
//			System.out.print((char) by);
//		}
//		
		byte[] bys = new byte[1024];
		int len = 0 ;
		while((len = bis.read(bys)) != -1){
			System.out.print(new String(bys,0,len));
		}
		
		bis.close();

		
		
	}

}
