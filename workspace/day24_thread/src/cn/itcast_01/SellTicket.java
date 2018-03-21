package cn.itcast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 上午10:30:40 
* 类说明 
*/
public class SellTicket implements Runnable {
	
	//定义票
	private int tickets = 100;
	
	//定义锁对象 多态
	private Lock lock = new ReentrantLock();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//不带catch的try 
			//是为了避免锁内出现异常，锁无法释放
			
			try{
				//枷锁
				lock.lock();
				
				if(tickets>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在销售第"+(tickets--)+"张票");
					
				}
			}finally{
				//释放锁
				lock.unlock();
			}
			
			
			
		}
		
		
	}

}
