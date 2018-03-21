package cn.itcast_09;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 下午8:12:12 
* 类说明 
*/
public class SellTicket implements Runnable {
	private int ticket = 100;
	private Object obj = new Object();
	@Override   
	public void run() {
		// TODO Auto-generated method stub
	
		while(true){
			//t1,t2,t3都能走到这里
			//假设t1抢到了CPU的执行权，t1就进来了
			//假设t2 抢到了CPU的执行权，t2要进来，发现锁是关着的，进不去，所以就等着
			//锁（开，关）
			synchronized(obj){//发现这里的代码将来是回被锁上的，所以t1进来后，就锁 了（关）
				if(ticket>0){
					try {
						Thread.sleep(100);//t1 休眠；了
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在售出第"+(ticket--)+"张票");
					
					//窗口1正在出售第100 张票
				}
				//t1 就出来了，然后锁就开了
				
//				}else{
//					break;
//				}
			}
			
		
		}
		
	}

}
