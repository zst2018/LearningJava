package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月13日 上午10:54:48 
* 类说明 
* 方式2 
* 		自定义类实现runable方法
* 		重写run方法
* 		创建Myrunable；类 的对象
* 		创建Thread类的对象，并把C步的对象作为参数传递
* 
*/
public class MyRunnableDemo {
	public static void main(String[] args) {
		// 创建MyRunable类的对象
		MyRunnable my = new MyRunnable();
		
		//创建Thread类的对象，并把C步骤的对象作为构造参数传递
		//Thread(Runnable  target)
//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
//		
//		t1.setName("林青霞");
//		t2.setName("刘意");
		
//		Thread(Runnable target,String name)
		Thread t1 = new Thread(my,"林青霞");
		Thread t2 = new Thread(my,"刘意");
		
		
		
		t1.start();
		t2.start();
	}

}
