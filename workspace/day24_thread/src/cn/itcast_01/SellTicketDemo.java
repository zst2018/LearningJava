package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 上午10:36:34 
* 类说明 
*/
public class SellTicketDemo {
	public static void main(String[] args) {
		//创建资源对象
		SellTicket st = new SellTicket();
		
		//创建线程对象
		Thread[] t = new Thread[3];
		for(int x = 0;x<3;x++){
			t[x] = new Thread(st,"窗口"+(x+1));
			//启动线程
			t[x].start();
			
		}
	}

}
