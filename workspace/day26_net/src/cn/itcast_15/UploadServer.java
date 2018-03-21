package cn.itcast_15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 上午10:58:23 
* 类说明 
*/
public class UploadServer {
	public static void main(String[] args) throws IOException{
		//创建服务器Socket 对象
		ServerSocket ss = new ServerSocket(12345);
		
		while(true){
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}

}
