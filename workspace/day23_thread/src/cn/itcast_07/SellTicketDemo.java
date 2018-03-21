package cn.itcast_07;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午4:25:02 
* 类说明 
* 实现Runable接口的方式实现
*/
public class SellTicketDemo {
	public static void main(String[] args) {
		//创建资源对象
		SellTicket st = new SellTicket();
		
		//创建三个线程对象
//		Thread t1 = new Thread(st,"窗口1");
//		Thread t2 = new Thread(st,"窗口2");
//		Thread t3 = new Thread(st,"窗口3");
//		Thread t4 = new Thread(st,"窗口4");
//		Thread t5 = new Thread(st,"窗口5");
//		Thread t6 = new Thread(st,"窗口6");
		Thread[] ts  = new Thread[20];
		for(int x = 0;x<20;x++){
			ts[x] = new Thread(st,("窗口"+x));
			ts[x].start();
		}
		
		//启动线程
//		t1.start();
//		t2.start(); 
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
	}

}
