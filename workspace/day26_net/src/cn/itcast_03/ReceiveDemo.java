package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 上午11:15:53 
* 类说明 
* 
* Address already in use: Cannot bind
* 多次启动接收端
*/
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端的Socket对象
		 DatagramSocket ds = new DatagramSocket(12345); 
		 
		 //创建一个包裹
		 byte[] bys = new byte[1024];
		 DatagramPacket dp = new DatagramPacket(bys,bys.length);
		 
		 //接收数据
		 ds.receive(dp);
		 
		 //解析数据
		 String ip = dp.getAddress().getHostAddress();
		 
		 String s = new String(dp.getData(),0,dp.getLength());
		 
		 System.out.println("from" + ip +"data is "+s);
		 
		 //释放资源
		 ds.close();
	}
}













