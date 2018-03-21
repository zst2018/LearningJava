package cn.itcast_13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 上午9:50:49 
* 类说明 
*/
public class UploadClient {
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket("192.168.0.100",12345);
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"林青霞.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(
				s.getOutputStream());
		
		byte[] bys = new byte[1024];
		
		int len = 0 ;
		while((len = bis.read(bys)) != -1){
			bos.write(bys,0,len);
		}
		s.shutdownOutput();
		//读取反馈
		InputStream is = s.getInputStream();
		byte[] by2 = new byte[1024];
		int len2 = is.read(by2);
		
		String client = new String(by2 ,0,len2);
		System.out.println(client);
		
		bis.close();
		s.close();
		
	}

}
