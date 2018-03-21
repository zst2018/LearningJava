package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午9:30:52 
* 类说明 
* public final viod stop();让线程停止，过时了。但是还可以使用
* 
*public void interrupt() 中断线程,把线程的状态终止，并抛出一个InterruptedException
*
*
*/
public class ThreadStopDemo {
	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		//休息时间超过3 秒就结束
		try {
			Thread.sleep(3000);
			//ts.stop();
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	
		
	}

}
