package cn.itcast_07;

import java.util.Comparator;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午6:42:07 
* 类说明 
*/
public class MyComparator implements Comparator<Student> {

	@Override
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

}
