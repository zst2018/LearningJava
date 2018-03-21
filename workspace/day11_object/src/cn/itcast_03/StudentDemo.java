package cn.itcast_03;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月24日 下午3:47:17 
* 类说明 
* public boolean equals(Object obj)
* 指示其他某个对象是否与此对象“相等”
* 这个方法默认情况下比较的地址值
* 注意：该方法在使用时，通常需要重写hashCode方法。
* 		以维护hashCode方法的常规协定，这个次协定声明相等对象必须具有相等的哈希值
* 源码：
* public boolean equals(Object obj){
*[注释：this===s1    obj==s2]
*   return(this==obj);
* 
* }
* 比较地址值一般来说意义不大，所以我们要重写该方法
* 怎么重写？
* 		一般都是比较对象的成员变量值是否相同
* 
* 
*/
public class StudentDemo {
	public static void main(String[] args){
		Student s1=new Student("林青霞",27);
		Student s2=new Student("林青霞",27);
		
		System.out.println(s1==s2);
		Student s3=s1;
		System.out.println(s1==s3);
		
		System.out.println();
		
		System.out.println(s1.equals(s2));//obj=s2
		//[注释：this===s1    obj==s2]
	    //return(this==obj);
		//false
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s1));
		Student s4 = new Student("疯子",34);
		System.out.println(s1.equals(s4));
		
		
		//这个时候，要注意向下转型的问题，因为 d 并不是Student的一个对象
		Demo d = new Demo();
		System.out.println(s1.equals(d));
	}

}
class Demo{}
