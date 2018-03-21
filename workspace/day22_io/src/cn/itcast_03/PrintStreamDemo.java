package cn.itcast_03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午2:54:55 
* 类说明 
* 可以操作任意类型
* 	print println 
* 启动自动刷新，
* 	PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true)
* 而且要调用println() 的方法才可以,这时候不仅实现了刷新，而且自动换行
* 					bw.write()
* println  等价于       bw.newLIne()
* 					bw.flush();
* 
*/
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建打印流对象
		//PrintWriter pw = new PrintWriter("pw2.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true);
		
		//PintWrite类的新方法
//		pw.print(true);
//		pw.print(100);
//		pw.print("nihoa");
//		pw.close();
//		
		
		pw.println("helo");
		pw.println(true);
		pw.println(100);
	}

}
