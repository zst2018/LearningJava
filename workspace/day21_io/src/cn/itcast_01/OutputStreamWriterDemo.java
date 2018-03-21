package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午4:39:46 
* 类说明 
* OutputStreamWriter(OutputStream out) 字符流
* 	把字节流转换成字符流，
* 创建使用默认字符编码的 OutputStreamWriter
* OutputStreamWriter(OutputStream out, String charsetName) 
*   创建使用指定字符集的 OutputStreamWriter。
*   根据指定编码把字节流转成 字符流
*/
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("a.txt"));
		//你好吗？
		
		
//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream("a.txt"),"GBK");
		//因为默认写时候是UTF-8编码
		//�����
		
		//写数据
		osw.write("你好吗？");
		
		//释放资源
		osw.close();
		
		
		
	}

}

















