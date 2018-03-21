package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午5:16:20 
* 类说明 
* public static void yield()
* 暂停当前正在执行的线程对象，并执行其他线程
* 可以让多个线程的执行更和谐，但是不能不保证分别个来一次，他别均匀
* 
*/
public class ThreadYieldDemo {
	public static void main(String[] args) {
		
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("杨过");
		ty2.setName("小龙女");
		
		ty1.start();
		//Thread.yield();
		ty2.start();
		
	}

}
