package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午9:42:33 
* 类说明 
* 以前的操作
* 	a.txt--b.txt
* 	c.txt--d.txt
* 现在
* a.txt+b.txt---c.txt
* 
*/
public class SequenceInputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		
		//SequenceInputStream(InputStream s1,InputStream s2)
		//需求：ByteArrayStreamDemo.java 和DataStreamDemo.java 的内容复制发哦Copy.java
		InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
		
		InputStream s2 = new FileInputStream("DataStreamDemo.java");
		
		SequenceInputStream sis = new SequenceInputStream(s1,s2);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys)) != -1){
			bos.write(bys,0,len);
		}
		
		bos.close();
		bos.close();
		
		
	}

}











