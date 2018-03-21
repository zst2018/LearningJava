package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 下午3:50:33 
* 类说明 
*/
public class Person {
	//成员变量
	private String name;
	int age;
	public String address;
	public Person(){}
	
	//构造方法
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	private Person(String name){
		this.name = name;
	}
	public Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//成员方法
	public void show(){
		System.out.println("show");
	}
	
	public void method(String s ){
		System.out.println("method"+s);
		
	}
	public String getString(String s,int i){
		return s + "---"+i;
	}
	
	private void function(){
		System.out.println("function");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	


}








