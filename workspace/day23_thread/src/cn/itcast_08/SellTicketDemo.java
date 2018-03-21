package cn.itcast_08;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午4:25:02 
* 类说明 
* 导致线程安全问题的原因
* 1 多线程 t1 t2 t3
* 2 共享数据  tickets 
* 3多语句操作共享数据  for（）
* 分析，
* 	多线程和共享数据无法更改，现在尝试将多条语句操作共享数据改变
* 		把多条语句操作共享数据的代码包成一个整体，让某个线程执行的时候，别的线程不能执行
* java提供了   同步机制
* 同步代码块
* 格式：synchronized(对象) {
* 	需要同步的代码
* }
* 同步可以解决安全问题的根部原因就在那个对象上，该对象如同锁的功能
* A对象是什么
* 	可以尝试随便创建一个对象
* B需要同步的代码是哪些
*	把多条语句操作共享数据的代码的部分给包起来
* 
*/
public class SellTicketDemo {
	public static void main(String[] args) {
		//创建资源对象
		SellTicket st = new SellTicket();
		
		//创建三个线程对象
		Thread t1 = new Thread(st,"窗口1");
		Thread t2 = new Thread(st,"窗口2");
		Thread t3 = new Thread(st,"窗口3");

//		Thread[] ts  = new Thread[20];
//		for(int x = 0;x<20;x++){
//			ts[x] = new Thread(st,("窗口"+x));
//			ts[x].start();
//		}
//		
		//启动线程
		t1.start();
		t2.start(); 
		t3.start();
		
	}

}
