package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午8:08:33 
* 类说明 
*/
public class GetThread implements Runnable {

	
	private Student s;
	public GetThread(){}
	public GetThread(Student s){
		this.s = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(s){
				if(!s.flag){//
					try {
						s.wait();//t2等待,并且立即释放锁。将来醒过来的时候，是从这里醒来的
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(s.name +"---"+s.age);
				//林青霞    23
				
				
				//修改标记
				s.flag=false;
				//唤醒线程
				s.notify();//唤醒t1
				
			}
			
			
			
		}
		
		
	}

}