package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月1日 下午8:04:40 
* 类说明 
* list 集合的特有遍历功能
* size() 和 get(index )方法的结合
*/
public class ListDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		List list = new ArrayList();
		//添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		//Object get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		//用循环改进、
		for(int x = 0;x<3;x++){
			System.out.println(list.get(x));
		}
		//改进
		for(int x = 0 ; x<list.size();x++){
			String s = (String) list.get(x);
			System.out.println(s);
		}
	}

}
