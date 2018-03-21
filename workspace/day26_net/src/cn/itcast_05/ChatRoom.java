package cn.itcast_05;

import java.io.IOException;
import java.net.DatagramSocket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 下午4:41:17 
* 类说明 
* 通过多线程，实现在一个窗口发送和接收数据
*/
public class ChatRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsSend = new DatagramSocket();
		DatagramSocket dsReceive = new DatagramSocket(12306);
		
		SendThread st = new SendThread(dsSend);
		ReceiveThread rt = new ReceiveThread(dsReceive);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		t1.start();
		t2.start();
		
	}

}
