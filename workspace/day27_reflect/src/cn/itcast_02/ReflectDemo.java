package cn.itcast_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 下午4:22:58 
* 类说明
*  
* 通过反射获取构造方法并使用
* public Constructor<?>[] getConstructors()
* 返回一个Constructor数组
*返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
*public Constructor<?>[] getDeclaredConstructors()
*此类所有已声明的构造方法的 Constructor 对象的数组
*
*
*/
public class ReflectDemo {
	public static void main(String[] args) throws  Exception{
		//获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");
		
		//获取构造方法
		//public Constructor<?>[] getConstructors()
		//返回一个Constructor数组
		//返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
//		Constructor[] cons = c.getConstructors();
//		//增强for遍历
//		for(Constructor con : cons){
//			System.out.println(con);
//		}
		
		//public Constructor<?>[] getDeclaredConstructors()
		//此类所有已声明的构造方法的 Constructor 对象的数组
//		Constructor[] cons = c.getDeclaredConstructors();
//		for(Constructor con : cons){
//			System.out.println(con);
//		}
//		
		
		//获取单个构造方法
		//public Constructor<T> getConstructor(Class<?>... parameterTypes)
		//参数表示的是，你要获取的构造参数个数及数据类型的class字节码文件对象
		Constructor con = c.getConstructor();
		//无参构造方法
		//返回的是构造方法对象
		
		//Person p = ne Person ()
		//public T newInstance(object ... initargs)
		//使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，
		//并用指定的初始化参数初始化该实例。
		
		Object obj = con.newInstance();
		System.out.println(obj);//Person 类的
		
//		Person p = (Person)obj;
//		p.show();
		
		
		
		
	}

}











