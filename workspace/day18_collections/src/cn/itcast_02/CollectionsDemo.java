package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 上午10:59:49 
* 类说明 
* Collections 可以针对ArrayList 存储基本包装类的元素排序，存储自定义对象可不可以排序？
*/
public class CollectionsDemo {
	public static void main(String[] args) {
		//创建集合对象
		List<Student> list = new ArrayList<Student>();
		//创建学生对象
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("风清扬",30);
		Student s3 = new Student("刘小曲",31);
		Student s4 = new Student("吴欣欣",29);
		Student s5 = new Student("林青霞",27);
		//添加元素对象
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//排序
		//Collections.sort(list);   自然排序
		//比较器排序
		//如果同时有自然排序和比较器排序，以比较器排序为主
		Collections.sort(list,new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s2.getAge()-s1.getAge();
				int num2 = num==0 ? s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		
		//遍历集合
		for(Student s : list){
			System.out.println(s.getName()+"----"+s.getAge());
		}
		
	}

}
