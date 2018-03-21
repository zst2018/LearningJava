package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 上午10:21:09 
* 类说明 
* 进程：
* 	正在运行的程序，是系统进行资源分配和调用的独立单位
* 	每一个进程都有它自己的内存空间和系统资源
* 线程：
* 	是进程中的单个顺序控制流，是一条执行路径
* 	一个进程如果只有一条执行路径，则称为单线程程序
* 	一个进程如果有多条执行路径，则称为多线程程序
* 举例“
* 	扫雷游戏，迅雷下载
* 并行和并发
* 前者在逻辑上同时发生，指在某一个时间内同时运行多个程序
* 后者是物理上同时发生，指在某一个时间点同时运行多个程序
* 
*/
public class MyThreadDemo {
	public static void main(String[] args) {
		System.out.println("hello");
		//Thresd[main](suspended(breakpoint at line22 in MyThreadDemo))
		new Object();
		new Object();
		new Object();
		//...
		System.out.println("world");
		
	}
}














