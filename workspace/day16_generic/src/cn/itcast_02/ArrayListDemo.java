package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午6:47:57 
* 类说明 
* 泛型
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		//用ArrayList 存储字符串元素，并遍历，用泛型改进、
		ArrayList<String> array= new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
		Iterator<String> it = array.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
			
			
		}
		System.out.println();
		for(int x = 0;x<array.size();x++){
			String s = array.get(x);
			System.out.println(s);
		}
	}
		

}
