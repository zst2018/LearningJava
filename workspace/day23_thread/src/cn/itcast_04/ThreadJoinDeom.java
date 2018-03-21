package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午5:07:13 
* 类说明 
* public final void join(long millis) throws InterruptedException
* 等待该线程终止的时间最长为 millis 毫秒。
*  超时为 0 意味着要一直等下去。 
*/
public class ThreadJoinDeom {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();
		
		tj1.setName("李渊");
		tj2.setName("李世民");
		tj3.setName("李元霸");
		
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
		
		
	}

}
