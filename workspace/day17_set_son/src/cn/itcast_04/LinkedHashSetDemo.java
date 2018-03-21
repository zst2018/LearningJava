package cn.itcast_04;

import java.util.LinkedHashSet;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午3:48:31 
* 类说明 
* LinkedHashSet ： 底层是链表和哈希表
* 保证了集合元素的唯一性和有序性
*/
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		//创建并添加元素
		hs.add("hello");
		hs.add("java");
		hs.add("world");
		
		//遍历
		for(String s : hs){
			System.out.println(s);
		}
		
	}

}
