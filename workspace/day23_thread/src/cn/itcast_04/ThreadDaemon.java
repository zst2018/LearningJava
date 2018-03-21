package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午5:32:03 
* 类说明 
*/
public class ThreadDaemon extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int x = 0 ;x<100;x++){
			System.out.println(getName()+":"+x);
			
		}
	}
}
