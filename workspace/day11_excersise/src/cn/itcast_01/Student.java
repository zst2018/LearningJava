package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月21日 上午10:57:52 
* 类说明 
*/
public class Student {
	//姓名
	private String name;
	//年龄
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
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
	public void show (){
		System.out.println("姓名"+name+"，年龄"+age);
		
		}

}
