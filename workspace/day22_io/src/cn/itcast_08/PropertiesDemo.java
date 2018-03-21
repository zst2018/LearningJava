package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午4:01:52 
* 类说明 
* Properties 属性集合类，是一个可以和IO流相结合使用的集合类
* Properties 可保存在流中或从流中加载，属性列表中每个键及其对应值都是字符串
* Properties() 创建一个无默认值的空属性列表。
* 
* 是Hashtable的子类，说明是一个Map集合,但是没有泛型
* 
* 
*/
public class PropertiesDemo {
	public static void main(String[] args) {
		//作为map集合的使用
		Properties prop = new Properties();
		System.out.println("prop:"+prop);
		
		//添加元素
		prop.put("it001", "hello");
		prop.put("it002","world");
		prop.put("it003", "java");
		
		//System.out.println("prop:"+prop);
		
		//遍历集合
		Set<Object> set = prop.keySet();
		for(Object key :set){
			Object value = prop.get(key);
			System.out.println(key+"---"+value);
		}
		
	}

}
