package cn.itcast_09;


import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 下午6:52:49 
* 类说明 
* BufferedReader 
* 		LineNumberReader
* 			public int getLineNumber() 获取当前行号
* 			public void setLineNumber(int lineNumber) 设置当前行号
* 
* 
* 
*/
public class LineNumberRaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader inr = new LineNumberReader(new FileReader("a.txt"));
		
		//从10 开始标
		inr.setLineNumber(10);
		
		
		String line = null;
		while((line = inr.readLine()) != null){
			System.out.println(inr.getLineNumber()+":"+line);
			
			
		}
		inr.close();
		
	}
}
