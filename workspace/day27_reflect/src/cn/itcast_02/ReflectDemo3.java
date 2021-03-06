package cn.itcast_02;

import java.lang.reflect.Constructor;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 下午7:02:19 
* 类说明 
* 通过反射获取私有构造方法并使用
* private Person(String name)
* 
* Person p = new Person("风清扬");
* Sysem.out.println(p);//风清扬   0 null
* 
* public void setAccessible(boolean flag)
* throws SecurityException将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。
*   值为 false 则指示反射的对象应该实施 Java 语言访问检查
*/
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		
		//获取字节码文字对象
		Class c = Class.forName("cn.itcast_01.Person");
		
		//获取私有构造方法
		//Constructor con=c.getConstructor(String.class);
		//NoSuchMethodException没有这个方法异常，以上方法只能获取公共的方法
		
		Constructor con=c.getDeclaredConstructor(String.class);
		//IllegalAccessException  非法的访问异常
		
		
		con.setAccessible(true);//true 则指示反射的对象在使用时应该取消java的语言访问检查
		//用该私有构造方法创建对象
		Object obj = con.newInstance("风清扬");
		
		System.out.println(obj);
	}

}
