package cn.itcast_01;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.InputStreamReader;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午5:02:51 
* 类说明 
* InputStreamReader(InputStream is) 用默认的编码读取数据
* 
* InputStreamReader(InputStream is ,String charSetName)f
* 用指定的编码读取数据
* 
*/
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建对象，
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("a.txt"));
		
//		InputStreamReader isr = new InputStreamReader(
//				new FileInputStream("a.txt"),"GBK");
		
		//浣犲ソ鍚楋紵
		
		//读取数据
		
		int ch = 0 ;
		while((ch = isr.read()) != -1){
			System.out.print((char) ch);
		}
		//释放资源
		
		isr.close();
		
	}

}
