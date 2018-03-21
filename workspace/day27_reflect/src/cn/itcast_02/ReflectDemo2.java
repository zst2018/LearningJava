package cn.itcast_02;

import java.lang.reflect.Constructor;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 下午6:45:45 
* 类说明 
* 需求：通过反射去获取该构造方法并使用
* public Person(String name , int age , String address)
* 
* Person p = new Person("林青霞",27,"北京");
* 
* 
*/
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		
		//获取字节码对象
		Class c = Class.forName("cn.itcast_01.Person");
		
		//获取带参构造器
		//public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		
		//通过带参构造方法对象创建对象
		//public T newInstance(Object ... initarge)
		Object obj = con.newInstance("林青霞",27,"北京");
		//Person p = new Person("林青霞",27,"北京");
		
		System.out.println(obj);
		
	}

}
