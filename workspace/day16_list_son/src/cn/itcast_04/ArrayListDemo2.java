package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午2:42:40 
* 类说明 
*  ArrayList 去除集合中字符串的重复值 要求不能创建新的集合
*  运用选择排序的思想
*  
*/
public class ArrayListDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();
		//添加集合元素
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("hello");
		array.add("javaee");
//		由选择排序思想引入，将0 索引依次和后面的进项比较，
//		有就把后面的干掉。同理，拿1 索引和后面的比较
//		
		for(int x = 0 ; x<array.size()-1;x++){
			for(int y = x+1;y<array.size();y++){
				if(array.get(x).equals(array.get(y))){
					array.remove(y);
					y--;
				}
			}
		}
		
		//遍历集合
		Iterator it = array.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
		
	}

}
