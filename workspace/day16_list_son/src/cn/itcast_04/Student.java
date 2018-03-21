package cn.itcast_04;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
