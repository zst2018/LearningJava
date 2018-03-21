package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 上午11:20:01 
* 类说明 
* 同步的弊端
* 	效率低
* 	容易产生死锁
* 死锁
* 	两个或两个以上的线程在争夺资源的过程中，发生的一种相互等待的现象
* 举例
* 	中国人，美国人吃饭案例
* 	中国人    筷子两支
* 	美国人    刀和叉
* 现在
* 	中国人：筷子1支，刀一把
* 	美国人：筷子1支，叉一把
* 
* 	
* 	
*/
public class DieLockDemo {
	public static void main(String[] args) {
		//
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		
		dl1.start();
		dl2.start();
		
	
		
	}

}









