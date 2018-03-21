package cn.itcast_06;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午3:53:34 
* 类说明 
*/
public class SellTicket extends Thread {
	//为了让多个线程对象共享这100 张票，我们应该用静态修饰
	
	//private int numberTicket = 100;
	private static int numberTicket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		//每个线程进来都会走这里，这样的话，每个线程对象相当于买的是自己的那100 张票，这个不合理。所以要定义在外面
		
		//int numberTicket = 100;
		//模拟一直有票，所以条件是true
		while(true)
		if(numberTicket>0){
			System.out.println(getName()+"正在出售第"+(numberTicket--)+"张票");
			
		}
	}
}
