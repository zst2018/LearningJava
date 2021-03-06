package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 上午9:08:24 
* 类说明 
* UDP协议发送数据：
* A 创建发送端的socket对象
* B 创建数据并把数据打包
* C 调用socket对象的发送方法发送数据包
* D 释放资源
*/
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端的socket对象
		DatagramSocket ds = new DatagramSocket();	
		//创建数据并把数据打包
		//public DatagramPacket(byte[] buf,  int length, InetAddress address, int port)
		//创建数据
		byte[] bys = "hello,udp,我来了".getBytes();
		//长度 
		int length = bys.length;
		//IP地址对象
		InetAddress address = InetAddress.getByName("169.254.13.146");
		//端口
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(bys,length,address,port);
				
		//调用socket对象的发送方法发送数据包
		//public void send(DatagramPacket p) throws IOException
		ds.send(dp);
			
		//释放资源
		ds.close();
	}
}
