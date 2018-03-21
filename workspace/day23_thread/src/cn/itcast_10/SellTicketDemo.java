package cn.itcast_10;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午8:30:50 
* 类说明 
*/
public class SellTicketDemo {
	public static void main(String[] args) {
		
		SellTicket st = new SellTicket();
		
		Thread t1 = new Thread(st,"窗口1");
		Thread t2 = new Thread(st,"窗口2");
		Thread t3 = new Thread(st,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
