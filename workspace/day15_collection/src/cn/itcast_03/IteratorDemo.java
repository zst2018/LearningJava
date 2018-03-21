package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月30日 下午5:00:05 
* 类说明 
* Iterator iterator()
* 迭代器  集合的专用遍历方式
* 获取元素,并移动到下一个位置:Object next()  
* noSuchElementException
* 
* boolean hasNext()  如果仍有元素迭代，则返回true 
* 
*/
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
public class IteratorDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		//创建并添加元素
		//String s = "hello";
		//c.add(s);
		c.add("hello");
		c.add("world");
		c.add("java");
		//Iterator iterator () 迭代器，集合的专用遍历方式
		Iterator it = c.iterator();//实际返回的是子类的对象
		//这里是多态
		
		//Object objs = it.next();
		//System.out.println(objs);
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		*/
		
		//if(it.hasNext()){
			//System.out.println(it.next());
		//}
		while(it.hasNext()){
			//System.out.println(it.next());
			String s = (String) it.next();
			System.out.println(s);
		}
		
		
	
	}

}
