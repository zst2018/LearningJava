package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午2:37:41 
* 类说明 
* hashMap<Student,String>
*键 Student 
*要求  如果两个对象的成员变量值都相同，则为同给一个对着那个
*值 Stirng 
*
*/
public class HashMapDemo4 {
	public static void main(String[] args) {
		//创建集合对昂
		HashMap<Student ,String> hm = new HashMap<Student,String>();
		//创建学生对昂
		Student s1 = new Student("貂蝉",27);
		Student s2 = new Student("王昭君",28);
		Student s3 = new Student("貂蝉",29);
		Student s4 = new Student("西施",20);
		Student s5 = new Student("貂蝉",27);
		
		//添加元素
		hm.put(s1, "8888");
		hm.put(s2, "7777");
		hm.put(s3, "6666");
		hm.put(s4, "5555");
		hm.put(s5, "3333");
		//遍历‘
		Set<Student> set = hm.keySet();
		
		for(Student key:set){
			String vlaue = hm.get(key);
			System.out.println(key.getName()+"----"+key.getAge()+"----"+vlaue);
		}
	}

}
