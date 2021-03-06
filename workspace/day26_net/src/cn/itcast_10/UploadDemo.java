package cn.itcast_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 上午8:52:54 
* 类说明 
*  按照正常思路，加入反馈信息，结果却没有反应，原因是？
*  读取文本文件可以以null，作为结束信息，但是，通道内是不能这样结束信息的，
*  所以，服务器根部不知道读取结束，而客户端还在等服务器的反馈，最后就相互等待
*  解决方法
*  	A 多写一条数据，告诉服务器，读取到这条数据说明我已经结束了，你也结束把
*  	B Socket 提供了一种解决方案
*  		public void shutdownOutput()
*  
*  
*  
*/
public class UploadDemo {
	public static void main(String[] args) throws IOException {
		//创建客户端Socket对象
		Socket s = new Socket("192.168.0.100",12345);
		
		//封装文本文件
		BufferedReader br = new BufferedReader(new FileReader(
				"src\\cn\\itcast_01\\InetAddressDemo.java"));
		
		//封装通道内流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine()) != null){//阻塞式
			
			
			bw.write(line);
			bw.flush();
			bw.flush();
			
			
		}
		
		//自定义一个结束标记
//		bw.write("over");
//		bw.flush();
//		bw.flush();

		//Socket 提供了一个终止功能，通知服务器，数据传输完成，
		s.shutdownOutput();
		
		//接受反馈
		BufferedReader brClient = new BufferedReader(
				new InputStreamReader(
						s.getInputStream()));
		//只读一行
		String client = brClient.readLine();
		System.out.println(client);
		
		
	//	bw.close();
		br.close();
		s.close();
		
		
		
	}

}
















