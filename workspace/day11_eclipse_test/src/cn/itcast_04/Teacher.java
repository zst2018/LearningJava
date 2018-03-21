package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月19日 上午11:12:47 
* 类说明 
*/
public class Teacher {
	private String name;
	private int age;
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
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
