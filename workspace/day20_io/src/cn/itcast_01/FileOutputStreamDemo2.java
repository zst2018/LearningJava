package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午2:43:32 
* 类说明 
* 字节输出流的操作步骤
* 	创建字节输出流对象
* 	调用write()方法
* 	释放资源
* 
* 
*  public void write(int b)  写一个字节
*  public void write(byte[] b)  写一个字节数组
*  public void write(byte[] b.int off.int len) 写一个字节数组的一部分
*/
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		//多态  OutputStream os = new FileOutputStream("fos.txt);
		FileOutputStream fos = new FileOutputStream("fos2.txt");
		
		//调用write方法
		fos.write(97);
		//91---底层二进制数据---通过记事本打开----找97 对应的字符值----a
		
		//public void write(byte[] b)  写一个字节数组
		//byte[] bys={a,b,c};
		byte[] bys={97,98,99,100,101};
		fos.write(bys);
		
		
		//public void write(byte[] b.int off.int len) 写一个字节数组的一部分
		fos.write(bys,1,3);
		//释放资源
		fos.close();
		
	}

}
