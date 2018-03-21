package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午2:59:06 
* 类说明 
* 如何实现数据的换行
* 	写入换行符号
* 如何实现数据的追加写入
* public FileOutputStream(String name, boolean append)
* 创建一个像具有指定name的文件中写入数据的输出文件流
* 如果第二个参数为true 则将字节写入文件末尾处，而不是写入文件开始处
* 
* 
* 
*/
public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		
		//创建一个字节输出流对象
		//FileOutputStream fos=new FileOutputStream("fos3.txt");
		FileOutputStream fos=new FileOutputStream("fos3.txt",true);
		//追加写入
		
		//写数据
		for(int x = 0 ;x<=10 ; x++){
			fos.write(("hello"+x).getBytes());
			fos.write("\r\n".getBytes());
			
			//notepaid++  eclipce  打开可以看到换行
			//Windows 自带的记事本打开并没有换行
			/*
			 * 因为不同的系统针对不同的换行符号识别不一样
			 * windows     \r\n
			 * linux;     \n
			 * mac   \r
			 * 而一些高级记事本软件，是可以识别任意换行符号的。
			 * 
			 * 
			 * */
		}
		//释放资源
		fos.close();
		
	}

}
