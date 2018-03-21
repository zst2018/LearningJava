package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 上午10:10:24 
* 类说明 
* 线程组，把多个线程组成一个组
* 它可以对一批线程进行分类管理，java允许程序直接对线程进行控制
* 线程组表示一个线程的集合。此外，线程组也可以包含其他线程组。
* 线程组构成一棵树，在树中，除了初始线程组外，每个线程组都有一个父线程组。 
* 允许线程访问有关自己的线程组的信息，
* 但是不允许它访问有关其线程组的父线程组或其他任何线程组的信息。
*/
public class ThreadGroupDemo {
	public static void main(String[] args) {
		//method1();
		
		
		//如何修改线程所在组
		//创建一个线程组
		//创建线程的时候，把其他线程的组指定为我们自己新建的线程组
		method2();
		
//		t1.start();
//		t2.start();
//		
	}

	private static void method2() {
		// TODO Auto-generated method stub
		ThreadGroup tg = new ThreadGroup("这是一个新的组");
		Myrunnable my = new Myrunnable();
		//Thread (ThreadGroup group,Runnable target , String name)
		Thread t1 = new Thread(tg,my,"林青霞");
		Thread t2 = new Thread(tg,my,"刘意");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		tg.setDaemon(true);
		//通过组对象进行设置，说明跟该组相关的线程都是守护线程
		
		
	}

	private static void method1() {
		// TODO Auto-generated method stub
Myrunnable my = new Myrunnable();
		
		Thread t1 = new Thread(my,"林青霞");
		Thread t2 = new Thread(my,"刘意");
		//不确定这两个线程属于哪个线程组
		//线程类里的方法
		//public final threadgroup Getthreadgroup()
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		//线程组里面的方法：public final String getName（）
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);//main
		System.out.println(name2);//main
		//由输出知道，线程默认情况下是属于main线程组
		//通过下面的测试可以看到，默认情况下，所有的线程都属于同一个组
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
	}

}
