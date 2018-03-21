package cn.itcast_05;

import java.util.Iterator;
import java.util.LinkedList;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午3:35:46 
* 类说明 
* 请用Linklist模拟栈数据结构的集合，并测试
*/
public class LinkedListDemo {
	public static void main(String[] args) {
//		//LinkedListDemo的特有添加功能 addFirst（）
//		//栈的她点先进后出
//		
//		//创建集合对象
//		LinkedList  link = new LinkedList();
//		//添加元素
//		link.addFirst("hello");
//		link.addFirst("world");
//		link.addFirst("java");
//		
//		//遍历
//		Iterator it = link.iterator();
//		while(it.hasNext()){
//			String s = (String) it.next();
//			System.out.println(s);
//		}
		
//		
		//创建集合对象
		MyStack ms = new MyStack();
		//添加元素
		ms.add("hello");
		ms.add("world");
		ms.add("java");
		//比那里
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
		 
	}

}
