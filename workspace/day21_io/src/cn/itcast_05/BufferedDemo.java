package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月8日 下午9:38:31 
* 类说明 
* 字符缓冲流的特殊方法
* BufferedWriter
* 	public void newLine() 根据系统来决定换行符
* 		写入一个行分隔符。
* 		行分隔符字符串由系统属性 line.separator 定义，
*		 并且不一定是单个新行 ('\n') 符。
* BufferedReader 
* 	public String readLine();一次读取一行数据
* 	包含该行内容的字符串，不包含任何终止符，如果已经达到流末尾，则返回null 
* 	
* public void newLine()throws IOException
*/
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		
		//write();
		read();
	}

	private static void read() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//public String readLine（） 一次读取一行数据
//		String  line = br.readLine();
//		System.out.println(line);
//		
//		line = br.readLine();
//		System.out.println(line);
		
//		最终版代码
		String line = null;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		
		
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		//创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		for(int x = 0 ; x<10; x++){
			bw.write("hello"+x);
			//bw.write("\r\n");
			
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
