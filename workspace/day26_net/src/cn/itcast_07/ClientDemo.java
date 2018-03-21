package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;



/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月18日 下午8:58:20 
* 类说明 
*/
public class ClientDemo {
	public static void main(String[] args) throws  IOException{
		
		Socket s = new Socket("192.168.0.100",12345);
		
		OutputStream os = s.getOutputStream();
		os.write("今天天气正好".getBytes());
		
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String client = new String (bys,0,len);
		System.out.println(client);
	}

}
