package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 上午9:50:40 
* 类说明 
* UDP 协议接收数据
* A 创建接收端Socket对象
* B 创建一个数据包（接收容器）
* C 调用Socket对象的接收方法接收数据
* D 解析数据包，并显示在控制台
* E 释放资源
*/
public class ReceiveDemo {
	public static void main(String[] args) throws IOException  {
		//创建接收端Socket对象
		//DatagramSocket(int port)
		//创建数据报套接字并将其绑定到本地主机上的指定端口。
		DatagramSocket ds = new DatagramSocket(10086);
		
		//创建一个数据包（接收容器）
		//DatagramPacket(byte[] buf, int length) 
		//构造 DatagramPacket，用来接收长度为 length 的数据包
		byte[] bys = new byte[1024];
		int length = bys.length;
		
		DatagramPacket dp = new DatagramPacket(bys,length);
		
		//调用Socket对象的接收方法接收数据\
		ds.receive(dp);
		
		//解析数据包，并显示在控制台
		//获取对方的IP
		//public InetAddress getAddress()
		//返回某台机器的 IP 地址，此数据报将要发往该机器或者是从该机器接收到的。
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
		//public byte[] getData()返回数据缓冲区。接收到的或将要发送的数据从缓冲区中的偏移量 offset 处开始，持续 length 长度。 
		//返回：用来接收或发送数据的缓冲区
		
		//public int getLength()返回将要发送或接收到的数据的长度
		byte[] bys2= dp.getData();
		int len = dp.getLength();
		String s = new String(bys2,0,len);
		System.out.println(ip+"----"+s);
			
		//释放资源
		ds.close();	
	}
}
