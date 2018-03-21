package cn.itcast_05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午4:51:04 
* 类说明 
* 类RandomAccessFile
* 支持对随机访问文件的读取和写入
* RandomAccessFile 类不属于流，是Object类的子类，
* 但它融合了InputStream和OutputStream的功能
* public RandomAccessFile(String name,String name)
* 第一个参数是文件的路径，第二个参数是操作文件的模式。模式有四种，最常用的是“rw”
* 这种模式，表示我既可以写数据也可以读数据
* 
* 
* 
*/
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		//write();
		read();
	}

	private static void read() throws IOException {
		// TODO Auto-generated method stub
		//创建随机访问流对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		
		//都数据
		int i = raf.readInt();
		System.out.println(i);
		//该文件指针可以通过getFilePointer 方法读取，并通过seek方法设置
		System.out.println("当前文件的指针位置是："+ raf.getFilePointer());//4
		
		char ch = raf.readChar();
		System.out.println(ch);
	
		System.out.println("当前文件的指针位置是："+ raf.getFilePointer());//6
		
		
		String s = raf.readUTF();
		System.out.println(s);
	
		System.out.println("当前文件的指针位置是："+ raf.getFilePointer());//14
		
		raf.seek(4);
		ch=raf.readChar();
		System.out.println(ch);
		
		
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		//创建随机访问流对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
		
		//
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("中国");
		
		raf.close();
	}

}
