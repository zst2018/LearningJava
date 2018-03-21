package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 上午11:09:33 
* 类说明 
* 该子类重写run方法的原因
* 不是类中的所有代码都需要被线程执行的，而这个时候，
* 为了区分哪些代码能够被线程执行，
* java提供了Thread类中的run方法用来包含那些被线程执行的代码
* 
*/
public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		//自己写代码
		//System.out.println("你好");
		//一般来说，被线程执行的代码肯定是比较耗时的，所以用循环改进
		for(int x = 0 ; x<500;x++){
			System.out.println(x);
		}
		
	}
	

}
