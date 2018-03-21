package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 下午3:06:43 
* 类说明 
* 数据来至于键盘录入
* 键盘录入数据要自己控制录入结束
* 
*/
public class SendDemo {
	public static void main(String[] args) throws IOException {
		
		
		//创建发总端的Socket对象
		DatagramSocket ds = new DatagramSocket();
		
		//封装键盘录入对象
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine()) != null){
			if("886".equals(line)){
				break;
			}
			//创建数据并打包
			byte[] bys = line.getBytes();
//			DatagramPacket dp = new DatagramPacket(bys,bys.length,
//					InetAddress.getByName("192.168.0.100"),12345);
			
			//广播地址
			DatagramPacket dp = new DatagramPacket(bys,bys.length,
					InetAddress.getByName("192.168.0.255"),12345);
			
			
			//发送数据
			ds.send(dp);
		}
		
		//释放资源
		ds.close();
		
	}

}
