package cn.itcast_04;

import java.util.Date;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午9:27:22 
* 类说明 
*/
public class ThreadStop extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("开始执行"+new Date());
		//休息十秒钟
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("线程被终止");
		}
		
		
		System.out.println("结束执行："+new Date());
		
	}
	

}
