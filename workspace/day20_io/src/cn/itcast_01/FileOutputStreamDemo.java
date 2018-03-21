package cn.itcast_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午1:59:21 
* 类说明 
* 需求：往一个文本文件中输入一句话，hellp,io
* 分析
* 	这个操作最好采用字符流来做，但是，字符流是在字节流之后出现的，
* 		所以，先考虑字节流如何操作
* 	因为要向文件中写入一句话，所以要才用字节输出流
* OutputStream   抽象类
* FileOutputStream
* 注意： 每一种基类都是以父类名作为后缀名
* 		XxxOutputStream
* 		XxxInputStream
* 		XxxReader
* 		XxxWriter
* 
* FileOutputStream 用于写入诸如图像数据之类的原始字节的流。
* 要写入字符流，请考虑使用 FileWriter。
* FileOutputStream的构造方法
* FileOutputStream(File file) 
* FileOutputStream(String name)
* 
* 字节输出流操作步骤
* 	A创建字节输出流对象
* 	B写数据
* 	C释放资源
*/
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节流输出对象
		//FileOutputStream(File file) 
	/*File file = new File("file.txt");
	FileOutputStream fos = new FileOutputStream(file);
*/
		
		FileOutputStream fos = new FileOutputStream("fos.txt");
		
		/*
		 * 创建字节输出流对象做了几件事情
		 * 	A 调用系统功能区创建文件
		 * 	B 创建fos 对象
		 *  C 把fos 对象指向这个文件
		 * 
		 * */
		//写数据
		fos.write("hello.IO".getBytes());
		
		//释放资源
		//关闭此文件输出流并释放与此流有关的所有系统资源
		fos.close();
		/*
		 * String 类的close（） 的必要性
		 * A  让流对象编程垃圾，这样就能被垃圾回收站回收
		 * B 通知系统去释放该文件相关的资源
		 * */
		//java.io.IOException: Stream Closed
		fos.write("java".getBytes());
	}

}
