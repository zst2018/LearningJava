package cn.itcast_07;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午1:32:55 
* 类说明 
* 
* final   finally  finalize
* final: 最终的意思，可以修饰类，成员变量，成员方法
* 			修饰类     类不能被继承
* 			修饰变量   变量是常量
* 			修饰方法  方法不能别重写
* finally  是异常处理的一部分，用于释放资源
* 			一般来说，代码肯定会执行，特殊情况：在执行到finally之前JVM就退出了
* finalize  是Object 的一个方法，用于垃圾回收（这个开发中很少见）
* 
*/
public class FinallyDemo2 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}
	public static int getInt(){
		int a = 10;
		try{
			System.out.println(10/0);//抛异常，走catch
			a=20;
		}catch(ArithmeticException ae){
			a=30;//a = 30 ,因为有finally ，所以程序跳过return后又走了，finally
			return a;
			//return a 在程序执行到这一步的时候，不是return a   而是 return 30 .，这趟返回路径就形成了
			//但是，它发现后面还有finally ，所以继续执行finally 的内容，a = 40 
		//再次回到返回路径，return   30 
		}finally{
			a = 40 ;//a= 40，走完finally，没有继续往下走，又返回catch里面，走return
		}
		return a ;
		
	}

}
