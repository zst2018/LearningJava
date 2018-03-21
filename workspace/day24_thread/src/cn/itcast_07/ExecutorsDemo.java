package cn.itcast_07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午2:10:10 
* 类说明 
* 线程池的好处，线程池里的每一个线程代码结束后，并不会死亡。
* 			并不会死亡，而是再次回到线程池中成为空闲状态，
* 			等待下一个对象来使用
* 线程池的代码实现
* 	A 创建一个线程池对象，控制要创建几个线程对象
* 		public static ExecutorService newFixedThreadPool(int nThreads)
* 	B 这种线程池的线程可以执行
* 		Runnable 对象或者Callable 对象代表的线程
* 		做一个类实现Runnable接口
* 	C 调用如下方法即可
* 		Future<?> submit(Runnable task)
* 		<T> Future<T> submit(Callable<T> task)
* 	D 如果非要结束也可以
* 		
* 	
* 
*/
public class ExecutorsDemo {
	public static void main(String[] args) {
		//创建一个线程池对象，控制要创建几个线程对象
		//public static ExecutorService newFixedThreadPool(int nThreads)
		 ExecutorService pool = Executors.newFixedThreadPool(2);
		 //Future<?> submit(Runnable task)
		 
		 //Runnable 对象或者Callable 对象代表的线程
		 pool.submit(new MyRunnable());
		 pool.submit(new MyRunnable());
		 //结束线程池
		 pool.shutdown();
	}

}














