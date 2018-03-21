package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午8:03:16 
* 类说明 
*/
public class SetThread implements Runnable {
	
	private Student s ;
	private int x = 0 ;
	
	public SetThread(){}
	public SetThread(Student s){
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(s){
				if(s.flag){//假设t1 又抢到锁。此时s.flag = true 
					try {
						s.wait();//t1在此处等待并且释放锁
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(x%2==0){
					s.name="林青霞";
					s.age = 23;
				}else{
					s.name="刘意";
					s.age = 30;
				}
				x++;
				//修改表示
				s.flag = true;
				//唤醒线程
				s.notify();//唤醒t2 ，但是唤醒并不表示t2可以立马执行，必须还得抢CPU的执行权
			}
			//t1钱抢到，或者t1抢到
			
		}
		
	
		
	}

}









