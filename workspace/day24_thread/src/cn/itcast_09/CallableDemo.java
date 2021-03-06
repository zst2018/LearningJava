package cn.itcast_09;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午3:29:51 
* 类说明 
*多线程实现的方式3
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
*/
public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		//创建线程池对象
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		//可以执 Runnable 对象或者Callable 对象代表的线程
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Future<Integer> f2 = pool.submit(new MyCallable(200));
		
		
		//V  get
		Integer i1 = f1.get();
		Integer i2 = f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		
		//pool.shutdown();
	}
	

}
