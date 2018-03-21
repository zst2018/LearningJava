package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月16日 下午3:32:49 
* 类说明 
*/
public class Student {
	//构造方法私有
	//目的是不让外界创造对象
	private Student(){}
	//自己造有个
	//静态方法只能访问静态成员变量
	//为了不让外界直接访问修改这个值，加private
	private static Student s = new Student();
	
	//提供公共的访问方式
	//为了保证外界能够直接使用该方法，加静态
	public static Student getStudent(){
		return s;
	}
}
