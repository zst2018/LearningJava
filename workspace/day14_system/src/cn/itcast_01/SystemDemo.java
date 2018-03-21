package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午3:58:16 
* 类说明 
* System 类
* 成员方法
		public static void gc()
		//运行垃圾回收器
		public static void exit(int status)
		//终止当前正在运行的java虚拟机
		 //终止当前正在运行的java虚拟机，参数用作状态吗。根据惯例，非0 的状态码表示异常终止
		 
		public static long currentTimeMillis()
public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
//返回以毫秒为单位的当前时间。
*/
public class SystemDemo {
	public static void main(String[] args) {
		//System.out.println("我们喜欢林青霞");
		//System.exit(0);
		//终止当前正在运行的java虚拟机
		//System.out.println("我们也喜欢赵雅芝");
		
		//System.out.println(System.currentTimeMillis());
		//单独得到这样的实际目前对我们来说意义不大
		//那么，它到底有什么用呢
		//要求，统计这段程序的运行时间
		long start= System.currentTimeMillis();
		for(int x = 0 ;x<100000;x++){
			System.out.println("hello"+x);
		}
		long end= System.currentTimeMillis();
		System.out.println((end-start)+"毫秒");
	}

}









