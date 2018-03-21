package cn.itcast_07;

import java.util.Comparator;
import java.util.TreeSet;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午6:36:53 
* 类说明 
*/
public class TreeSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		//TreeSet<Student> ts = new TreeSet<Student>();自然排序
		//比较器排序
		//TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
		//匿名类实现
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				//int num = this.name.length()-s.name.length();
				//this----s1
				//s-----s2
				//主要条件  长度
				int num = s1.getName().length()-s2.getName().length();
				//次要条件 内容
				int num2 = num==0 ? s1.getName().compareTo(s2.getName()): num;
				//年龄
				int num3 = num2==0 ? s1.getAge()-s2.getAge():num2;
				return num3;
			}
			
			
		});
		
		
		
		
		//创建元素
		Student s1 = new Student("林青霞",23);
		Student s2 = new Student("朱茵",25);
		Student s3 = new Student("杨澜",21);
		Student s4 = new Student("梅艳芳",22);
		Student s5 = new Student("刘诗诗",24);
		Student s6 = new Student("风清扬",23);
		Student s7 = new Student("林青霞",25);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
	//遍历
		for(Student s : ts){
			System.out.println(s.getName()+"    "+s.getAge());
		}
	}

}
