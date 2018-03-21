package cn.itcast_14;

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
















