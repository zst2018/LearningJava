package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 上午11:00:20 
* 类说明 
*/
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	public Student(){
		super();
	}
	public Student(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		int num = this.age-s.age;
		int num2 = num == 0 ? this.name.compareTo(s.name):num;
		return num2;
	}

	

}
