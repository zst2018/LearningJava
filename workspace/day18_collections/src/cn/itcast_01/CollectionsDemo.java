package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 上午10:22:45 
* 类说明 
* Colletions 是针对集合操作的工具类,有对集合进行排序和二分查找的方法
* Colletion 是单列集合的顶层接口，有子接口List  SEt
* 
*/
public class CollectionsDemo {
	public static void main(String[] args) {
		//创建集合对象
		List<Integer> list = new ArrayList<Integer>();
		//添加元素
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(70);
		list.add(60);
		System.out.println("list"+list);
		
		//排序
		Collections.sort(list);
		System.out.println("list"+list);
		
		//二值查找
		System.out.println("binarySearch:"+Collections.binarySearch(list,30));
		System.out.println("binarySearch:"+Collections.binarySearch(list,300));
		
		//最值
		System.out.println("max:"+Collections.max(list));
		
		//反转
		Collections.reverse(list);
		System.out.println("list:"+list);
		
		//随机置换
		Collections.shuffle(list);
		System.out.println("list:"+list);
		
		
	}

}
