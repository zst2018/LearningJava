package cn.itcast_04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;



/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月4日 下午5:14:28 
* 类说明 
* TreeMap<Student,String>
* 键 Student
* 值 String 
*/
public class TreeDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		TreeMap<Student,String> tm = new TreeMap<Student,String>(
				new Comparator<Student>(){
		@Override
		public int compare(Student s1, Student s2) {
			// TODO Auto-generated method stub
			int num = s1.getAge()-s2.getAge();
			int num2 = num ==0 ? s1.getName().compareTo(s2.getName()):num;
			return num2;
					
		}
				
			
		});
		
		//创建学生独享
		Student s1 = new Student("张成",30);
		Student s2 = new Student("李成",34);
		Student s3 = new Student("言情",23);
		Student s4 = new Student("唐伯虎",26);
		Student s5 = new Student("唐伯虎",26);
		
		//存储元素
		tm.put(s1, "宋朝");
		tm.put(s2, "元朝");
		tm.put(s3, "明朝");
		tm.put(s4, "汉朝");
		tm.put(s5, "唐朝");
		
		//遍历
		Set<Student> set = tm.keySet();
		for(Student key:set){
			String value = tm.get(key);
			System.out.println(key.getName()+"----"+key.getAge()+"----"+value);
		}
		
		
		
	}


}
