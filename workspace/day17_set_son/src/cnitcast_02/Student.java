package cnitcast_02;
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
	public int hashCode(){
		//return 0;
		//因为成员变量值影响了哈希值，所以把成员变量值相加即可
		//return this.name.hashCode()+this.age;
		//s1:name.hashCode()  =40,age=30
		//s2: name.hashCode()  = 50 ,age = 20 
		//尽可能的区分，可以把他们乘以吸血整数
		return this.name.hashCode()+this.age*15;
		
	}
	public boolean equals(Object obj){
		System.out.println(this+"   "+obj);
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Student)){
			return false;
		}
		Student s = (Student) obj;
		return this.name.equals(s.name) && this.age==s.age;
	}
	public String toString(){
		return "Student[name="+ name + ",age="+age +"]";
	}
}
