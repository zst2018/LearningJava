package cn.itcast_03;

import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午4:18:31 
* 类说明 
*/
public class RunTimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		//打开记事本
	//	r.exec("notepad");
		//打开计算器
		//r.exec("calc");
		
		//关闭计算机
		r.exec("shutdown -s -t 10000");
		//取消关机命令
		r.exec("shutdown -a");
		
		
	}
}

/*
 * public class Runtime {
 *	private Runtime(){}
 * 	private static Runtime currentRuntime = new Runtime(); 
 * 	public static Runtime getRuntime(){
 * 		return currentRuntime;
 * 	}
 * }
 * */
 