package cn.itcast_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午2:36:22 
* 类说明 
* 序列化流：将对象按照流一样的方式，存入文本文件或者在网络中传输。对象---流
* ObjectOutputStream
* 反序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象，流数据---对象
* ObjectInputStream
* 
* 
* 
*/
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//由于是针对对象操作的，所以先自定义一个类
		//序列化数据就是把对象写写入文本文件
		//write();
		
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//创建反序列化流对象
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("oos.txt"));
		
		//还原对象
		Object obj = ois.readObject();
		
		//释放资源
		ois.close();
		
		//输出对象
		System.out.println(obj);
		
		
		
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		//ObjectOutputStream(OutputStream out) 
			//创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("oos.txt"));
		//创建对象
		Person p1= new Person("林青霞",23);
		
		//public final void writeObject(Object obj)
		oos.writeObject(p1);
		
		//释放资源
		oos.close();
		
		
		
		
	}

}











