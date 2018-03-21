package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月1日 下午8:43:59 
* 类说明
*  列表迭代器
*  	ListIterator listIterator()
*/
public class ListIteratorDemo {
	public static void main(String[] args) {
		//创建list集合对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		//Literator literator()
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s = (String) lit.next();
			System.out.println(s);
		}
		/*System.out.println(lit.previous());
		System.out.println(lit.previous());
		System.out.println(lit.previous());
		*/
		
		System.out.println();
		//逆向遍历
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
		//迭代器
		Iterator it = list.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			System.out.println(s);
		}
		
		System.out.println("==========");
		 
	}
	

}
