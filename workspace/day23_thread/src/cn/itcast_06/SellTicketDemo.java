package cn.itcast_06;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午3:50:37 
* 类说明 
* 售票：100 张票   3 个售票窗口，设计一个程序模拟该电影院售票
*/
public class SellTicketDemo {
	public static void main(String[] args) {
		//创建sellTicket对象
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new SellTicket();
		
		//给线程对象起名字
		st1.setName("第一个售票口");
		st2.setName("第二个售票口");
		st3.setName("第三个售票口");
		
		//启动线程
		st1.start();
		st2.start();
		st3.start();
	}
	
}
