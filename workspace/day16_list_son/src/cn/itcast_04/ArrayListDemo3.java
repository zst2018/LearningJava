package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午2:55:57 
* 类说明 
* 需求：
* 	去除集合找那个自定义对象的重复值（对象的成员变量值都相同
* ）
*/
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();
		//创建学生对昂
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("林志玲",26);
		Student s3 = new Student("朱茵",25);
		Student s4 = new Student("杨澜",27);
		Student s5 = new Student("董洁",17);
		Student s6 = new Student("邓婕",17);
		Student s7 = new Student("杨澜",37);
		Student s8 = new Student("杨澜",37);
		Student s9 = new Student("林青霞",27);
		
		//添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		array.add(s8);
		array.add(s9);
		
		//创建新集合
		ArrayList newArray = new ArrayList();
		//遍历旧集合，获取每一个元素
		Iterator it = array.iterator();
		while(it.hasNext()){
			Student s= (Student) it.next();
			//拿这个元素到新集合中查找
			if(!newArray.contains(s)){
				newArray.add(s);
				
			}
		}
		//遍历新集合
		for(int x = 0 ;x<newArray.size();x++){
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName()+"   "+s.getAge());
			
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
