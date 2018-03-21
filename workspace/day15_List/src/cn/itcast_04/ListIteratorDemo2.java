package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月1日 下午9:02:15 
* 类说明 
* 问题
* 	有一个集合，判断其中是否有world 这个元素，如果有，就添加javaee
*/
public class ListIteratorDemo2 {
	public static void main(String[] args) {
		//创建list集合对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		//迭代器遍历
		Iterator it = list.iterator();
//		while(it.hasNext()){
//			String s = (String) it.next();
//			if("world".equals(s)){
//				list.add("javaee");
//			}
//			//ConcurrentModificationException
//			//当方法检测到对象的并发修改时，但不允许修改时，就会【抛出这种异常
//		}
		
		//方式1 
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s = (String) lit.next();
			if("world".equals(s)){
				lit.add("javaee");
			}
		}
		
		
		System.out.println(list);
		
		
		//方式2
		for(int x = 0;x<list.size();x++){
			String s = (String) list.get(x);
			if("world".equals(s)){
				list.add("javaee");
			}
		}
		System.out.println(list);
	}

}
