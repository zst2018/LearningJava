package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午3:56:03 
* 类说明 
* 线程的优先级设置，首先有默认优先级 是   5 
* 获取线程对象的优先级的方法
* public final int getPriority() 返回线程的优先级。
* 设置线程优先级的方法
* public final void setPriority(int newPriority) 更改线程的优先级
* IllegalArgumentException 非法参数异常
* 抛出的异常表明向方法传递了一个不合法或不正确的参数。优先级不在 MIN_PRIORITY 到 MAX_PRIORITY 范围内。
* 线程优先级的范围：  
* public static final int     MAX_PRIORITY 10 
*public static final int      MIN_PRIORITY 1 
* public static final int     NORM_PRIORITY 5 
* 线程优先级仅仅表示线程获取CPU时间片的几率。优先级高的获取CPU
* 时间片的几率就高，但是要在次数比较多或者多次运行的时候才能看到比较好的效果
* 
*
*/
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		tp1.setName("张三");
		tp2.setName("李四");
		tp3.setName("王五");
		
		//获取线程的优先级
		System.out.println(tp1.getPriority());//5
		System.out.println(tp2.getPriority());//5
		System.out.println(tp3.getPriority());//5
		
		//设置线程优先级
		
		//tp1.setPriority(10000);
		//IllegalArgumentException 非法参数异常
		//抛出的异常表明向方法传递了一个不合法或不正确的参数。 
		//IllegalArgumentException - 如果优先级不在 MIN_PRIORITY 到 MAX_PRIORITY 范围内。 
		
		tp1.setPriority(10);
		tp2.setPriority(1);
		tp3.setPriority(5);
		

		
		tp1.start();
		tp2.start();
		tp3.start();
		
	}

}
