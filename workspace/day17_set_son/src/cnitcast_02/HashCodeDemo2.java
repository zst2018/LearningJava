package cnitcast_02;

import java.util.HashSet;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午2:37:42 
* 类说明 
* 需求，存储自定义对象，并保证元素的唯一性
* 要求：如果两个成员变量的值相同，则为同一个元素
* 
* 原因：
* 	因为hashSet底层依赖的是hashCode（）和equals() 方法
* 而这两个方法我们在学生类中没有重写，默认使用的是Object类
* 这个时候，他们的哈希值是不同的，就不会再继续判断而是执行添加操作
* 
* 		
*/
public class HashCodeDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		HashSet<Student> hs = new HashSet<Student>();
		//创建学生对象
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("刘诗诗",25);
		Student s3 = new Student("王诛仙",24);
		Student s4 = new Student("朱茵",23);
		Student s5 = new Student("杨澜",22);
		Student s6 = new Student("林青霞",27);
		
		//添加元素
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		
		//遍历集合
		for(Student s : hs){
			System.out.println(s.getName()+"    "+s.getAge());
		}
	}

}
