package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午5:33:48 
* 类说明 
* 后台线程
* public final void setDaemon(boolean on)将该线程标记为守护线程或用户线程。
* 当正在运行的线程都是守护线程时，Java 虚拟机退出。 
*该方法必须在启动线程前调用。 
*参数：
*on - 如果为 true，则将该线程标记为守护线程。 
*抛出： 
*IllegalThreadStateException - 如果该线程处于活动状态。 
*SecurityException - 如果当前线程无法修改该线程。
*
*坦克大战
*
*/
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		ThreadDaemon td3 = new ThreadDaemon();
		
		td1.setName("关羽");
		td2.setName("张飞");
		
		
		//设置守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		
		//主线程的执行
		Thread.currentThread().setName("刘备");
		for(int x=0;x<5;x++){
			System.out.println(Thread.currentThread().getName()+"："+x);
			
		}
		
	}

}
