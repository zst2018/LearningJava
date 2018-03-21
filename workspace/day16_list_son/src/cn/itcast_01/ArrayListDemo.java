package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;



/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午1:03:22 
* 类说明 
* ArrayList() 自定义对象
* 
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList arry = new ArrayList();
		//创建学生对象
		Student s1 = new Student("武松",30);
		Student s2 = new Student("鲁智深",32);
		Student s3 = new Student("林冲",33);
		Student s4 = new Student("杨志",34);
		//添加学生对昂
		arry.add(s1);
		arry.add(s2);
		arry.add(s3);
		arry.add(s4);
		//遍历
		Iterator it = arry.iterator();
		while(it.hasNext()){
			Student s = (Student) it.next();
			System.out.println(s.getName()+"    "+s.getAge());
			
		}
	}

}
