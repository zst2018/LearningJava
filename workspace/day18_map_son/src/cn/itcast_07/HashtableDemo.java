package cn.itcast_07;

import java.util.HashMap;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 上午9:58:04 
* 类说明 
* Hashtable 和hashMap 的区别
* 前者：线程安全，效率低，不允许null键和null值
* 后者：线程不安全，效率高，允许null键和null值
* 
*/
public class HashtableDemo {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("it100", "hello");
		hm.put(null, "world");//null 可以做键
		hm.put("java", null);//null 可以做值
		System.out.println(hm);
	}

}
