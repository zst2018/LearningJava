package cn.itcast_06;

import java.util.TreeSet;



/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午5:37:44 
* 类说明 
*/
public class TreeSetDemo {
	public static void main(String[] args) {
		//创建集合对象
				TreeSet<Student> ts = new TreeSet<Student>();
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
