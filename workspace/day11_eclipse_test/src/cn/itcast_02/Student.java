package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月19日 上午9:11:03 
* 类说明 
*/
public class Student {
	private String name;
	private int age;
	public int num=10;
	public final int num22=34;
	public static int num3=89;
	public static final int num4=90;
	public Student(){
		
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	

}
