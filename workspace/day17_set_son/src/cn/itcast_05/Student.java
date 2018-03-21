package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月30日 下午4:37:07 
* 类说明 
* 如果一个类的元素能够进行自然排序就一定要实现comparaTo接口
* 
*/
public class Student implements Comparable<Student>{
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
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		//return 0;
		//return 1;
		//return -1;
		//这里的返回值，应该根据比较规则
		int num = this.age - s.age;
		//次要天骄
		//年龄相同的时候，还的去看姓名是否也相同
		//如果年龄和姓名都相同，才是同一个元素
		int num2 = num==0 ? this.name.compareTo(s.name):num;
		return num2;
		
		
	}
}
