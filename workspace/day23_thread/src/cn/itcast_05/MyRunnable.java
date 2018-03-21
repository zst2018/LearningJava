package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 上午10:58:23 
* 类说明 
*/
public class MyRunnable extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int x = 0; x<100;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
			
		}
	}
}
