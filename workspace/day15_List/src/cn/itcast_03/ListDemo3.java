package cn.itcast_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月1日 下午8:17:36 
* 类说明 
* 存储自定义对象并遍历。用普通for循环（size（） 和get（index）结合）
* 
*/
public class ListDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();
		//创建学生对象
		Student s1 = new Student("林黛玉",18);
		Student s2 = new Student("薛宝钗",22);
		Student s3 = new Student("王熙凤",28);
		// 把学生添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);
		//遍历
		//迭代器遍历
		Iterator it = list.iterator();
		while(it.hasNext()){
			Student s = (Student) it.next();
			System.out.println(s.getName()+"   "+s.getAge());
			
		}
		
		System.out.println();
		//普通for遍历
		for(int x = 0; x<list.size();x++){
			Student s = (Student)list.get(x);
			System.out.println(s.getName()+"   "+s.getAge());
			}
		
	}

}
