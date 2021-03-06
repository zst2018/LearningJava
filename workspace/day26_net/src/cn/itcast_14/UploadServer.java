package cn.itcast_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 上午9:01:03 
* 类说明 
* 通过while（true）循环可以改进一个服务器接收多个客户端
* 但是这个是有问题的
* 如果是这样的情况，假设有张三，李四，王五三个分别执行客户端
* 张三   好好学习.avi (100m)    256k
* 李四  天天向上.mp3（3M ）    1M
* 王五  hello.txt （1k）   100M 
* 
*/
public class UploadServer  {
	public static void main(String[] args) throws IOException {
		//创建服务器端服务对象
		ServerSocket ss = new ServerSocket(12345);
		
		while(true){
			Socket s = ss.accept();//阻塞式
			
			//封装通道内的流
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			
			//封装文本问我那件
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"Copy.java"));
			
			String line = null;
			
			while((line = br.readLine()) != null){//阻塞式

				bw.write(line);
				bw.newLine();
				bw.flush();
				
			}
			
			//给出反馈
			BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			bwServer.write("文件上传成功");
			bwServer.newLine();
			bwServer.flush();
			
			
			bw.close();
			s.close();
		}
	}
	
	
	
	
}
