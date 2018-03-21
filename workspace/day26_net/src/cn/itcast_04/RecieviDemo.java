package cn.itcast_04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 下午3:07:11 
* 类说明 
*/
public class RecieviDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(12345);
		
		//表示接收多次
		while(true){
			//创建数据包
			byte[] bys = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bys,bys.length);
			
			//接收数据
			ds.receive(dp);
			
			//解析数据
			String ip = dp.getAddress().getHostAddress();
			String s = new String(dp.getData(),0,dp.getLength());
			System.out.println("from  " + ip + "  data is :"+s);
			
			
		}
		
	}

}
