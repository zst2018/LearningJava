package cn.itcast_04;
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
* 问题2 为了数据的效果好一些，我加入了循环和判断，给出不同的值，这个时候产生了新的问题
* 		A 同一个数据出现多次
* 		B 姓名和年龄不匹配
* 原因
* 		A 同一个数据出现多次
* 			CPU的一点点时间片的执行权，就足够循环执行很多次
* 		B 姓名和年龄不匹配
* 			线程运行的随机性
* 线程安全问题
* 	A是否有多个线程    是
* 	B 是否有共享数据   是
* 	C 是否有多条语句操作共享数据  是
* 解决方案
* 	加锁
* 		注意：
* 			A 不同种类的线程都要枷锁
* 			B 不同种类的线程要加同一把锁
* 问题3 虽然数据安全了，但是，一次一片不好看，我想一次的一次一个输出
* 实现方法
* 	通过java的唤醒机制
* 等待唤醒
* 	Object类中提供了三个方法，
* 	wait()  等待
* 	notify()  唤醒单个线程
* 	notyfyall() 唤醒所有线程
* 这些方法不定义在Thread类中的原因
*  这些方法的调用必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象，
*  所以，这些方法必须定义在object 类中
*  
* 异常IllegalMonitorStateException
* 抛出的异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器而本身没有指定监视器的线程
* 
* 		
*/
public class StudentDemo {
	public static void main(String[] args) {

		
		//创建资源
		Student s = new Student();
		
		//设置和获取类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		Thread t1 = new Thread(st,"生产者");
		Thread t2 = new Thread(gt,"消费者");
		
		
		t2.start();
		t1.start();
	
		
	}
	

}