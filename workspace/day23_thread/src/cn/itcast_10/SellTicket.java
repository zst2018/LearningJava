package cn.itcast_10;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午8:12:12 
* 类说明 
*/
public class SellTicket implements Runnable {
	private int ticket = 100;
	//private Object obj = new Object();
	private Demo d = new Demo();
	private int x = 0 ;
	//@Override   
//	public void run() {
//		// TODO Auto-generated method stub
//	
//		while(true){
//			
//			synchronized(obj){
//				if(ticket>0){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+"正在售出第"+(ticket--)+"张票");
//					
//					
//				}
//				
//			}
//			
//		
//		}
//		
//	}
	//同步代码块用任意对象做锁
	
	@Override   
	public void run() {
		// TODO Auto-generated method stub
	
		while(true){
			if(x%2 ==0){
				synchronized(d){
					if(ticket>0){
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"正在售出第"+(ticket--)+"张票");
						
						
					}
					
				}
			}else{
//				synchronized(d){
//					if(ticket>0){
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						System.out.println(Thread.currentThread().getName()+"正在售出第"+(ticket--)+"张票");
//						
//						
//					}
//					
//				}
				sellTicket();
			}
			
			
		
		}
		
	}
	//如果一个方法一进去就看到了代码块被同步了，那么我就想能不能把这个同步加在方法上呢？
	private void sellTicket() {
		// TODO Auto-generated method stub
		synchronized(d){
			if(ticket>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			  	}
				System.out.println(Thread.currentThread().getName()+"正在售出第"+(ticket--)+"张票");
				
				
			}
			
		}
	}

}
class Demo{}