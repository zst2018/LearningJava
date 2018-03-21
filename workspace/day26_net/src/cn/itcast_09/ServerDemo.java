package cn.itcast_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 下午9:31:57 
* 类说明 
*/
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(12345);
		
		Socket s = ss.accept();
		
		//封装通道内的流
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		
		s.close();
	}

}
