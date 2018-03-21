package cn.itcast_01;

import java.io.FileInputStream;

import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午3:00:42 
* 类说明 
* 字节流出现的小问题
* 由于字节流操作中文不是特别方便，所以，java就提供了转换刘
* 字符流  = 字节流+编码表
* 
*  
* 
*/
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
	//创建字节流输入对象
		FileInputStream fis = new FileInputStream("a.txt");
		//a.txt   hello中国
		
		//读数据
//		int by = 0 ;
//		while((by = fis.read()) != -1){
//			System.out.print((char)by);
//			//helloä¸­å½
//		}
		
		byte[] bys = new byte[1024];
		int len = 0 ;
		while((len = fis.read(bys)) != -1){
			System.out.println(new String(bys,0,len));
			
			//hello中国
		}
		
		//释放资源
		fis.close();
	}

}
