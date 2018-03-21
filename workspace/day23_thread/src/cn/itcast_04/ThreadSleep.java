package cn.itcast_04;

import java.util.Date;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午4:27:07 
* 类说明 
*/
public class ThreadSleep extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int x = 0 ; x<100 ;x++){
			System.out.println(getName()+":"+x+",日期："+new Date());
			//睡眠 1 秒钟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
