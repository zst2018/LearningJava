package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午3:12:03 
* 类说明 
* TreeMap 是基于红黑数的map的接口的实现
* HashMap<String,String>
* 键 String
* 值 String
*/
public class TreeMapDemo {
	public static void main(String[] args) {
		//创建集合对象
		TreeMap<String,String> tm = new TreeMap<String,String>();
		//创建并添加元素
		
		tm.put("hello", "world");
		tm.put("world", "world2");
		tm.put("java", "world1");
		tm.put("javaee", "world3");
		
		Set<String> set = tm.keySet();
		for(String key : set){
			String value = tm.get(key);
			System.out.println(key+"----"+value);
		}
		
		
	}

}
