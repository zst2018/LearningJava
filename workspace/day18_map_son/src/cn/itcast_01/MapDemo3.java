package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午12:51:50 
* 类说明 
* map集合的遍历
* map----夫妻对
* 
* 
* A  把所有的丈夫都集中起来，
* 	遍历丈夫的集合，获取每一个丈夫
* 	让丈夫去找自己的妻子
* 
* 分析，b
* 	把所有的键都集中起来
* 	遍历键的集合，获取每一个键
* 	让键去找自己的值
* 
* 
*/
public class MapDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		//创建元素并添加到集合
		map.put("杨过","小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆念慈");
		map.put("陈旋风","梅超风");
		//遍历
		//获取多有的键
		Set<String> set = map.keySet();
		//遍历键的集合，获取没有个键
		for(String key: set){
			//根据键去找值
			String value = map.get(key);
			System.out.println(key+"-------"+value);
			
		}
		
		
		
	}

}
