package cn.itcast_06;
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
		//return 0;相同
		//return 1;大于
		//return -1;小于
		//这里的返回值，应该根据比较规则
		//主要条件
		int num = this.name.length()- s.name.length();
		//名字长度相同，不代表名字的内容现年共同
		int num2 = num==0 ? this.name.compareTo(s.name):num;
		//还得判断年龄
		int num3 = num2 ==0 ? this.age - s.age:num2;
		return num3;
		
	}
}
