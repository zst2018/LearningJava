package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午5:16:33 
* 类说明 
*/
public class SetDemo {
	public static void main(String[] args) {
		//创建集合对象
		Set<String> set = new HashSet<String>();
		
		//创建并添加元素
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("java");
		
		//for增强
		for(String s : set){
			System.out.println(s);
		}
	}
	

}
