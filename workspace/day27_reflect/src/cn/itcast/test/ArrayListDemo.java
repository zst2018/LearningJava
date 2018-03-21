package cn.itcast.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 下午9:51:53 
* 类说明 
* 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现
*/
public class ArrayListDemo {
	public static void main(String[] args) throws Exception{
		//创建集合对象
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		//array.add(hello);
		//array.add(10);
		
		Class c = array.getClass();//集合ArrayList的Class文件对象
		Method m = c.getMethod("add",Object.class);
		
		m.invoke(array,"hello");
		//调用array的add方法，传入的值是hello
		m.invoke(array, "world");
		System.out.println(array);
	}
	

}
