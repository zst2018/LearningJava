package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午3:58:40 
* 类说明 
* String(byte[] bytes,String charsetName)通过制定的字符集介么字节数组
* byte[] getBytes(String charsetName)使用指定的字符集把字符串编码成字节数组
* 
*  编码  把看的懂的变成看不懂的数值，方便底层进行解码运算
*  String---byte[]
*  解码  把看不懂的数值，变成看的懂的
*  byte[]---String 
*  举例：
*  	发电报，接电报
*  
*  
* 
*  
*  
* 
*/
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "你好";
		
		//String----byte[]   默认编码是  UTF-8   
		//byte[] bys = s.getBytes();
		//byte[] bys = s.getBytes("GBK");
		//[-60, -29, -70, -61]
		//
		byte[] bys = s.getBytes("UTF-8");
		//[-28, -67, -96, -27, -91, -67]
		System.out.println(bys);
		
		System.out.println(Arrays.toString(bys));
		
		//byte[] ---String 
		String ss = new String(bys);
		
		String ss1 = new String(bys,"GBK");
		
		System.out.println(ss);//你好
		
		System.out.println(ss1);//浣犲ソ
		
	}

}









