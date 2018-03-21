package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午7:57:01 
* 类说明 
* 分析：
* 	资源类 Student
* 	设置学生数据：SetThread（生产者）
* 	获取学生数据：GetThread（消费者）
* 	测试类：StudentDemo
* 问题1  按照思路写代码。发现每次都是 null---0
* 原因：我们在每个线程中都创建了新的资源，而我们要求的是两个线程共享同一个资源
* 如何实现？
* 		在外界将这个数据创建出来，通过构造方法，将这个数据传递给其他的类
* 
* 		
*/
public class StudentDemo {
	public static void main(String[] args) {
//		SetThread st = new SetThread();
//		GetThread gt = new GetThread();
		
		//创建资源
		Student s = new Student();
		
		//设置和获取类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		Thread t1 = new Thread(st,"生产者");
		Thread t2 = new Thread(gt,"消费者");
		
		
		t2.start();
		t1.start();
		//林青霞---23
		//如果t2先抢到CPU时间片，就会输出 null 0
		
	}
	

}
