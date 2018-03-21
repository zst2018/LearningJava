package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午8:04:27 
* 类说明 
*/
public class Student {
	String name;
	int age;
	public Student(){}
	public Student(String name,int age){
		this.name = name ;
		this.age = age;
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
	
}
