package cn.itcast_03;



/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午2:34:17 
* 类说明
*  
*获取该线程的名称
* 	public static String getName() 
* 
* 
* 设置线程的名称
* public final void setName(String name)
* 
* 针对不是Thread类的子类如何获取对象名称
* public static Thread currentThread()
* 返回当前正在执行的线程对象
* Thread.currentThread().getName()
* 
* 
*/
public class MyThreadDemo {
	public static void main(String[] args) {
		//创建线程对象
		//无参构造+setXXX+getXXX
//		MyThread my1 = new MyThread();
//		MyThread my2 = new MyThread();
//		
//		//调用方法设置名称
//		my1.setName("java1");
//		my2.setName("java2");
//		
//		
//		my1.start();
//		my2.start();
		
		//带参构造方法
//		MyThread my1 = new MyThread("张三");
//		MyThread my2 = new MyThread("李四");
//		
//		my1.start();
//		my2.start();
		
		//如何获取main方法所在线程对象的名称
		//Thread类提供了一个方法
		//public static Thread currentThread()
		//返回对当前正在执行的线程对象的引用
		System.out.println(Thread.currentThread().getName());
		//main
		
		
		
	}

}
/*
 * 名称为什么是Thread--XX 编号？
 * class Thread{
 * 		private char name[];
 * 		public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }
    	private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null, true);
    }
    	private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc,
                      boolean inheritThreadLocals) {
       //大部分代码省略
        this.name = name.toCharArray();
        
    }
    
        private static int threadInitNumber;//0,1,2
    	private static synchronized int nextThreadNum() {
        return threadInitNumber++;//0,1  后加加
        
        public final String getName(){
        	return String.valueOf(name);
        		
        }
        
        
    }
 * }
 * 	class MyThread extends Thread{
 * 		public MyThread(){
 * 			super();
 * 
 * 		}
 * }
 * 
 * */
















