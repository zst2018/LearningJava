package cn.itcast_02;

import java.io.FileInputStream;

import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午6:32:41 
* 类说明 
* 一次读取一个字节数组
* 
* 数组的长度一般是1024 或1024 的整数倍
* int read(byte[] b)
* 返回值 int 是实际读取的字节的个数
* 
* 
*/
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//创建字节输入流对象
		FileInputStream  fis = new FileInputStream("fos.txt");
		
		//读取数据
		//定义一个字节数组
		
		//第一次读取
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		//返回实际读取的字节数目
		
		//System.out.println(len);
		//System.out.println(new String(bys));
		//把一个字节数组，转成字符串
		//hello
		
		System.out.print(new String(bys,0,len));
		
	/*	//第二次读取
		
		len = fis.read(bys);
		//System.out.println(len);
		//System.out.println(new String(bys));
		//wor  \r\n 换行符占去两个字节
		// \r\n wor
		
		System.out.print(new String(bys,0,len));
		
		//第3次读取
		
		len = fis.read(bys);
		//System.out.println(len);
		//System.out.println(new String(bys));
		//ld
		//j
		//ld \r\n j
		
		System.out.print(new String(bys,0,len));
		
	//第4次读取
		
		
		//把字节数组的一部分转成字符串
		
		//3
		//ava
		//j
		//ava只替代了   ld \r\n  j 中的前三个      是     ava \n j
		
		
		
		//代码重复，用循环改
//		len = fis.read(bys);
//		System.out.println(new String(bys,0,len));
		//如果读取到的实际长度是-1  说明 没有数据了
*/		
		/*byte[] bys = new byte[5];
		int len = 0 ;
		while((len = fis.read(bys)) != -1){
			System.out.print(new String(bys,0,len));
		}
*/		
		
		
		//最终版
		//数组的长度一般是1024 或1024 的整数倍
		byte[] bys1= new byte[1024];
		int len1 = 0 ;
		while((len1 = fis.read(bys1)) != -1){
			System.out.print(new String(bys1,0,len1));
		}

		
		//释放资源
		fis.close();
		
		
		
	}

}
