package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月30日 下午4:37:07 
* 类说明 
*/
public class Student {
	private int age;
	private String name;
	public Student(){}
	public Student(String name,int age){
		this.name = name;
		this.age =age;
	}
	//成员方法
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	/*
	public String toString(){
		return "Student [name=" +name +", gae ="+age +" ]";
	}
*/
}
