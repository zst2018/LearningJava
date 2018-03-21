package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月24日 下午3:17:18 
* 类说明 
*/
public class Student {
	private String name;
	private int age;
	public Student(){
		super();
	}
	public Student(String name,int age){
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
	//toString 方法重写
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
/*	public String toString(){
		
		 * return super.toString();
		 * 	//此处返回父类的
		 
		//return "hello";
		return "姓名"+name+",年龄"+age;
		
	}
	*/
	
	
	
	

}
