package cn.itcast_03;

import java.util.LinkedList;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午1:35:16 
* 类说明 
* LinkedListDemo的特有功能
* A添加功能
* 	public void addFirst(Object e)
* 	public void addLast(Object e)
* B获取功能
* 	public Object getFirst()
* 	public Object getLast()
* C 删除功能
* 	public Object removeFirst()
* 	public Object removeLast()
* 
* 
*/
public class LinkedListDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedList link = new LinkedList();
		//添加元素
		link.add("hello");
		link.add("world");
		link.add("java");
		//public void addFirst(Object e)
		link.addFirst("javaee");
		//输出对象名
		System.out.println("link:"+link);
		link.addLast("nihoa");
		System.out.println(link);
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
	}

}
