package cn.itcast_02;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午6:31:30 
* 类说明 
* OutputStreamWriter的方法
* public void write(int c)  写一个字符
* public void write(char[] cbuf) 写一个字符数组
* public void write(char[] cbuf,int off,int len) 写一个字符数组的一部分
* public void write(String str) 写一个字符串
* public void write(String str,int off,int len) 写一个字符串的一部分
* 
* 
*/
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("a.txt"));
		
		//写数据
		osw.write('a');
		osw.write(97);
		osw.write("林");
		//为什么数据没有进去
		//原因是：字符 = 2 字节
		//文件中存储文本的基本单位是字节
		
		//void flush()
		//public void write(char[] cbuf) 写一个字符数组
		char[] chs = {'a','b','c','d'};
		osw.write(chs);
		
		
		osw.write(chs,1,3);
		
		osw.write("我爱林青霞" , 2 ,3);
		osw.write("我爱林青霞" , 2 ,3);
		//刷新缓冲区
		osw.flush();
		//输出两个“我爱林青霞”
		
		//释放资源，之前先刷新缓冲区，然后关闭此流
		osw.close();
		
		osw.write("我爱林青霞" , 2 ,3);
		//运行时错误，显示流已经关闭
		
		
	}

}
