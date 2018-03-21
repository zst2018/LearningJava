package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月21日 上午11:03:41 
* 类说明 
*/
public class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Student s1=new Student();
		s1.setAge(23);
		s1.setName("sha");
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		Student s2=new Student("xiaowang",34);
		s2.show();
		
	}

}
