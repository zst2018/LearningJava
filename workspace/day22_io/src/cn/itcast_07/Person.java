package cn.itcast_07;

import java.io.Serializable;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午2:40:29 
* 类说明 
* 
* 
* 报错  NotSerializableException
* 当实例需要具有序列化接口时，抛出此异常   
* 
* 类通过实现 java.io.Serializable 接口以启用其序列化功能。
* 未实现此接口的类将无法使其任何状态序列化或反序列化
* 该接口没有任何方法。这种没有任何方法的接口被称为标记接口
* java.io.InvalidClassException: cn.itcast_07.Person;
*  local class incompatible: 
*  stream classdesc serialVersionUID = -2071565876962058344,
*  local class serialVersionUID = -8345153069362641443
* 
* 问题分析
* 	Person类实现了序列化接口，那么它本身应该有一个标记值
* 	假设该标记值为100
* 	Person.class ---id = 100
* write数据：oos.txt---id = 100
* read 数据：oos.txt---id = 100
* 
* 现在
* Person.class---200
* write 数据。oos.txt--id = 100
* read 数据：pps.txt---id =100
* 
* 在实际开发中，可能还需要使用以前写过的数据，不能重新写入，解决方发我：
* 因为以上问题出现的原因是ID值不匹配
* 每次修改java文件的内容的时候，class文件的ID值都会发生改变，而读取文件的时候，
* 会和class文件中的ID值进行匹配，所以就会出现问题
* 如果可以让这个ID值在java文件中是一个固定值，修改文件的时候，ID不会发生改变，这样问题就可以解决
* 
* ID值如何表示？
* 点击黄色警告线即可
* add generated serialversion id 
* 需要注意的是。
* 	看到类实现了序列化接口的时候，要想解决黄色警告线问题，就可以自动产生一个序列化ID值
* 	而且产生这个值之后，我们对类进行任何改动，它读取以前的数据是没有问题的
* 注意:
* 	一个类中可能有很多个成员变量，有些不想进行序列化，解决办法
* 		使用transient关键字声明不需要序列化的成员变量
* 
*/
public class Person implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = -8345153069362641443L;
	/**
	 * 
	 */
	private static final long serialVersionUID = -8345153069362641443L;
	private String name;
	private transient int age;
	//int age;
	
	public Person(){
		super();
	}
	public Person(String name,int age){
		super();
		this.name = name;
		this.age =age;
		
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age +"]";
	}
	
	

}
