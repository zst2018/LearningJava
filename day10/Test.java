/*
不同包下类的访问
//Demo d=new Demo;
		//需要导包

*/
//包
package cm.itcast;
//导包
import com.liuyi.Demo;
class Test{
	public static void main(String[] args){
		/*
		com.liuyi.Demo  d = new com.liuyi.Demo();
		System.out.println(d.sum(23,78));
		com.liuyi.Demo  d2= new com.liuyi.Demo();
		System.out.println(d2.sum(23,78));
		com.liuyi.Demo  d3 = new com.liuyi.Demo();
		System.out.println(d3.sum(23,78));
	*/
		Demo d=new Demo();
		System.out.println(d.sum(78,56));
	}
}
/*
第一个问题：
	找不到demo  因为 Demo 和test 不在同一个包下
第二个问题：
	程序包coim.liuyi 不存在  ，要先对DEmo 进行编译生成class文件
第三个问题
	Demo在com.liuyi中不是公共的; 无法从外部程序包中对其进行访问
/*
		错误: 程序包com.liuyi不存在
         com.liuyi.Demo d=com.liuyi.Demo;
           ^
           错误: 程序包com不存在
           com.liuyi.Demo d=com.liuyi.Demo;
                      ^

		
 //Demo在com.liuyi中不是公共的; 无法从外部程序包中对其进行访问


*/