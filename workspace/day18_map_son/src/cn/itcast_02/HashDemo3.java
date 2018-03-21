package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午2:24:25 
* 类说明 
* HashMap<String,Student>
*键  String 学号
*值  Student 学生对象
*/
public class HashDemo3 {
	public static void main(String[] args) {
		//创建集合对昂
		HashMap<String,Student> hm = new HashMap<String,Student>();
		//创建学生对象
		Student s1 = new Student("周星驰", 58);
		Student s2 = new Student("刘德华", 55);
		Student s3 = new Student("梁朝伟", 54);
		Student s4 = new Student("刘嘉玲", 50);
		
		//添加元素
		hm.put("9527", s1);
		
		hm.put("9522", s2);
		hm.put("9524", s3);
		
		hm.put("9529", s4);
		//遍历
		Set<String> set = hm.keySet();
		for(String key : set){
			//注意：这次不是字符串，不能如下安歇
			//String value = hm.get(key);
			Student value = hm.get(key);
			System.out.println(key+"----"+value.getName()+"---"+value.getAge());
		}
	}

}
