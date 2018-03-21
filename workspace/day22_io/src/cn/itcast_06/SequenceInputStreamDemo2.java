package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午10:04:56 
* 类说明 
*  以前的操作
* 	a.txt--b.txt
* 	c.txt--d.txt
* f.txt----d.txt
* 现在
* a.txt+b.txt+f.txt---c.txt
*/
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//需求：把下面三个文件的内容复制到copy.txt
		//SequenceInputStream(Enumeration<? extends InputStream> e) 
		//SequenceInputStream(Enumeration e)
		//Enumeration 是vector.element() 返回值
		//Enumeration<E> elements()
		Vector<InputStream> v= new Vector<InputStream>();
		
		InputStream s1 = new FileInputStream("abc.java");
		InputStream s2 = new FileInputStream("bcd.java");
		InputStream s3 = new FileInputStream("ghe.java");
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		
		Enumeration<InputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
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
