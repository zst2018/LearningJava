package cn.itcast_03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午8:03:21 
* 类说明 
* 由于我们常见的操作都是使用本地默认的编码，所以不用指定编码
* 而转换流的名称有点长，所以，java就提供了其子类供我们使用
* OutputStreamWriter = FileOutputstream + 编码表（默认<GBK ,UTF-8>）
* 
* InputStreamReader = FileInputStream + 编码表（默认<GBK   UTF-8>）
* 
* 数据源
* 	a.txt---读取数据---字符转换流---InputStreamReader--fileReader
* 目的地
* 	b.txt---写出数据--字符转换流--OutputStreamWriter--FileWriter
*/
public class CopyFielDemo2 {
	public static void main(String[] args) throws IOException {
		//创建数据源
		FileReader fr = new FileReader("a.txt");
		
		//封装目的地
		FileWriter fw = new FileWriter("b.txt");
		
		//读取数据
		int ch = 0 ;
		while((ch=fr.read()) != -1){
			fw.write(ch);
		}
		
		//
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs)) != -1){
			fw.write(chs,0,len);
			
			//刷新缓冲区
			fw.flush();
		}
		
		fr.close();
		fw.close();
		
	}

}
