package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月1日 下午5:33:01 
* 类说明 
* 存储自定义的对象并遍历
*/
public class ListDemo {
	public static void main(String[] args) {
		//创建集合对象
		List list = new ArrayList();
		//创建学生对象
		Student s1 = new Student("白骨精",30);
		Student s2 = new Student("蜘蛛精",40);
		Student s3 = new Student("观音姐姐",22);
		//把学生对象添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//遍历
		Iterator it = list . iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"   "+s.getAge());
		}
		
		
		
	}

}
