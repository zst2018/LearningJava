package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午3:27:31 
* 类说明 
* 加入异常处理的字节输出流操作
*/
public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
//		//分开做异常处理，可读性查
//		
//		//创建字节输出流对象
//		FileOutputStream fos=null;
//		//赋值初始化，消除异常
//		try {
//			//此处可能隐藏异常
//			fos = new FileOutputStream("fos3.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			fos.write("java".getBytes());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			fos.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//一起做异常处理
//
//		try{
//		FileOutputStream fos = new FileOutputStream("fos3.txt");
//		
//		fos.write("java".getBytes());
//		
//		fos.close();
//		} catch (FileNotFoundException e){
//			e.printStackTrace();
//		
//		} catch (IOException e){
//			e.printStackTrace();
//			
//		}
		
		//改进
		//为了在finally里面都能够看到fos 对象，就必须定义在外面，为了访问不出问题，还必须出示话
		FileOutputStream fos = null;
		try{
			//fos = new FileOutputStream("Z:\\fos4.txt");
			fos = new FileOutputStream("fos4.txt");
			fos.write("java".getBytes());
			
			} catch (FileNotFoundException e){
				e.printStackTrace();
			
			} catch (IOException e){
				e.printStackTrace();
				
			}finally{
				
				//如果fos不是null，才close 
				//为了保证close一定会执行
				if(fos != null){
					try {
						fos.close();
					} catch (IOException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
		
	}

}
