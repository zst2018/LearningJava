package cn.itcast_06;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 下午5:16:40 
* 类说明 
* TCP协议发送数据
* A创建发送端的Socket对象
* 	在这一步如果成功了，就说明连接已经建立起来了
* B 获取输出流，写数据
* C 释放资源
* 连接被拒绝
* Connection refused: connect
* 原因是：TCP协议一定要先开服务器
* 
*/
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端的Socket对象
		//Socket(InetAdress address,int port)
		//Socket(String host,int port)
		//Socket s = new Socket(InetAdress.getByName("192.168.0.100"),12345)
		Socket s = new Socket("192.168.0.100",12345);
		
		//获取输出流，写数据
		//public OutputStream getOutputStream()
		OutputStream os = s.getOutputStream();
		
		os.write("nihoa".getBytes());
		
		//释放资源
		s.close();
		
	}
	

}















