package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午4:15:54 
* 类说明 
* 特殊功能
*public Object setProperty(String key, String value) 添加元素
*public String getProperty(String key) 获取元素
*public Set<String> stringPropertyNames() 获取所有的键的集合
*/
public class PropertiesDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		Properties prop = new Properties();
		//添加元素
		prop.setProperty("张三","男");
		prop.setProperty("李四","男");
		prop.setProperty("凤姐","女");
		
		//获取元素
		//public Set<String> stringPropertyNames()
		Set<String> set = prop.stringPropertyNames();
		for(String key:set){
			String value = prop.getProperty(key);
			System.out.println(key+"---"+value);
		}
		
		
		
		
	}

}

/*
 * class Hashtable<K,V>{
 * 		public V put(k key,v value){
 * 		...
 *     }
 * }
 * class Properties extends Hashtable{
 * 		public V setProperty(String key,String value){
 * 			return put(key,valeu);
 * 		}
 * 
 * 
 * }
 * */
 