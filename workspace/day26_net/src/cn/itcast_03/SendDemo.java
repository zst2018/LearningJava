package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 上午11:24:23 
* 类说明 
*/
public class SendDemo {
	public static void main(String[] args) throws IOException {
		
		//创建发送端数据Socket对象
		DatagramSocket ds = new DatagramSocket();
		
		//创建数据并打包
		byte[] bys = "helloworld".getBytes();
		DatagramPacket dp = new DatagramPacket(bys,bys.length,
				InetAddress.getByName("192.168.0.100"),12345);
		//发送数据
		ds.send(dp);
		
		//释放资源
		ds.close();
		
	}

}















