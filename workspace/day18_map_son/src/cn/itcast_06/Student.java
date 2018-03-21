package cn.itcast_06;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月4日 下午9:24:45 
* 类说明 
*/
public class Student {
	private String name;
	private int age;
	
	public Student(){
		super();
		
	}
	public Student(String name,int age){
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
	

}
