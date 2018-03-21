package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午2:30:28 
* 类说明 
* 打印流
* 	字节流打印流
* 		PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式
* 	字符流打印流
* 		PrintWriter 向文本输出流打印对象的格式化表示形式
* 打印流的特点
* 	A 只有写数据的没有读取数据的，只能操作目的地，不能操作数据源
* 	B 可以操作任意类型的数据
* 	C 如果启动了自动刷新，就能够自动刷新
* 	D 该流是可以直接操作文本文件的，
* 可以直接操作文本文件的如下
* 
* 		FileInputStream
* 		FileOutputStream 
* 		FileReader
* 		FileWriter
* 看ApI，查看流的构造方法，如果同时有File类型和String类型的参数。就可以直接操作文本文件
* 	流：
* 		基本流：能够直接读文件的流
* 		高级流：在基本流的基础上提供了一些其他的功能
* 
*/
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		//作为Write的子类使用
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
	}

}
