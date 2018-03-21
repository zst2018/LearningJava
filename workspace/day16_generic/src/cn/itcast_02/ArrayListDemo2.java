package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午6:53:39 
* 类说明 
* 泛型，自定义对象
*/
public class ArrayListDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//添加元素
		Student s1 = new Student("诸葛亮",23);
		Student s2 = new Student("江建",28);
		Student s3 = new Student("曹操",27);
		Student s4 = new Student("周瑜",26);
		Student s5 = new Student("赵云",25);
		Student s6 = new Student("关羽",24);
		
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		//遍历
		Iterator it = array.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"   "+s.getAge());
			
		}
		System.out.println();
		//for()
		for(int x = 0 ;x<array.size();x++){
			Student s = array.get(x);
			System.out.println(s.getName()+"   "+s.getAge());
		}
		
	}

}
