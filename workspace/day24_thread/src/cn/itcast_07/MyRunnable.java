package cn.itcast_07;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午3:17:06 
* 类说明 
*/
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x<100;x++){
			System.out.println(Thread.currentThread().getName()+" :"+x);
			
		}

	}

}