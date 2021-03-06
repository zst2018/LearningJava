package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 下午8:54:11 
* 类说明 
*/
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(12345);
		
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String server = new String(bys,0,len);
		System.out.println(server);
		
		OutputStream os = s.getOutputStream();
		os.write("数据已经收到".getBytes());
		
		s.close();
		
	}

}
