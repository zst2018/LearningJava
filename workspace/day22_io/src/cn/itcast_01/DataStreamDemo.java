package cn.itcast_01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午1:31:17 
* 类说明 
* 基本数据类型的读写
* 
* 数据输入流 
* 	DataInputSream（InputStream in）
* 	
* 数据输出流
* 	DataOutputStream(OutputStream out)
* 
* 
*/
public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		//写
		//write();
		//
		
		//读
		read();
		
	}

	private static void read() throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
		
		//读数据
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		char c = dis.readChar();
		boolean bl = dis.readBoolean();
		
		//释放资源
		dis.close();
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		System.out.println(l);
		System.out.println(d);
		System.out.println(s);
		System.out.println(c);
		System.out.println(bl);
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		//DataOutputStream(OutputStream out)
		//创建数据输出流对象
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
		
		//写数据
		dos.writeByte(10);
		dos.writeInt(1000);
		dos.writeShort(100);
		dos.writeLong(10000);
		dos.writeDouble(12.56);
		dos.writeFloat(12.34F);
		dos.writeChar('a');
		dos.writeBoolean(true);
		
		//释放资源
		dos.close();
	}
}
