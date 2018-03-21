package cn.itcast_07;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午4:21:48 
* 类说明 
* 通过加入延迟后，产生两个问题
* A相同的票卖了多次
* 	CPU的一次操作必须是原子性（最简单基本的）的
* B出现了负数票
* 	随机性和延迟导致的
* 	
*/
public class SellTicket extends Thread {
	//定义一百张门票
	private int tickets = 100;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		while(true){
			//这次的tickets = 1
			if(tickets > 0 ){
				//为了模拟更真实的网络延时场景，我们稍作休息
				try {
					Thread.sleep(10);
					//t1 进来并休息，t2进来了，t3进来了
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"票");
				//窗口1正在出售第一张票，tickets = 0 ;
				//窗口2正在出售第0 张票，tickets = -1
				//窗口3 正在出售第-1 张票，tickets = -2 
				
			}//else{
				//一百张票卖完后，退出
				//break;
				//System.out.println("");
				//System.exit(0);
			//}
		}
	}
	
}
