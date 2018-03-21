package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月24日 下午3:17:18 
* 类说明 
*/
public class Student implements Cloneable{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(){
		super();
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
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	
	

	

	
	
	
	

}
