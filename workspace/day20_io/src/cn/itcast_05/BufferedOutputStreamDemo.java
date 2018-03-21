package cn.itcast_05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午1:04:14 
* 类说明 
* 缓冲区类
* 写数据：BufferedOutputStream
* 读数据：BufferedOutputStream
* 构造方法可以指定缓冲区大小，但是，一般不用，因为默认缓冲区大小就足够了
* 构造方法不传递一个具体的文件或文件路径，而是传递一个OUtputStream对象？
* 原因：字节缓冲区流仅仅提供缓冲区，为高效而设计的，但是，
* 真正的读写操作还是得考基本的流对象实现
* 
* 
* 
*/
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//BufferedOutputStream（OutputStream out）
//		FileOutputStream fos = new FileOutputStream("bos.txt");
//		
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//简单写法
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
		
		//写数据
		bos.write("hello".getBytes());
		
		//释放资源
		bos.close();
		
		
	}
	

}
