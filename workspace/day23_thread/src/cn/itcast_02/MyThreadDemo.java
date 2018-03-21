package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 上午10:47:13 
* 类说明 
* 需求：实现多个线程的程序
* 实现：
* 	由于线程是依赖进程而存在的，所以应该先创建一个进程
* 	而进程是系统创建，所以应该取调用系统功能创建一个进程
* 	java是不能直接调用系统功能的，所以美誉办法直接实现多线程程序
* 	但是，java可以去调用C/C++写好的程序来实现多线程程序。
* 	由C/C++ 去调用系统功能创建进程，然后由java去调用这样的东西。然后提供一些类供我们使用
* 	就可以实现多线程程序了、
* java提供的类是    Thread 
* API提供两种方式实现多线程
* 方式1  
* 	将类声明为Thread子类，该子类重写run()方法
* 		重写run方法的原因
* 	创建对象，分配并启动该子类的实例
* 	启动线程
* 
* 
*/
public class MyThreadDemo {
	public static void main(String[] args) {
		//创建线程对象
//		MyThread my = new MyThread();
//		//启动线程
//		my.run();
//		my.run();
		//调用run方法，为什么是单线程的呢？
		//因为run（）方法直接调用其实就相当于普通的方法调用，所以看到的是单线程的效果
		//要想看到多线程的效果，需要另一个方法 start()
		//面试题：run 和start方法
		//run仅仅是封装被线程执行的代码，直接调用的是普通方法
		//start（）首先启动了线程，然后由JVM去调用该线程的run（） 方法
		
//		MyThread my = new MyThread();
//		my.start();
//		my.start();
		//指示线程没有处于请求操作所要求的适当状态时抛出的异常
		//IllegalThreadStateException
		//非法的线程状态yic
		//原因是，以上相当于是my线程被调用了两次，而不是两个线程启动
		
		
		//创建两个线程对象
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.start();
		my2.start();
		
		
		
	}
	

}










