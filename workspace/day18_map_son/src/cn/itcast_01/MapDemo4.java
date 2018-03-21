package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午1:00:55 
* 类说明
* 
* 思路：
* 	获取所有结婚证的集合
* 	遍历结婚证的集合，的发哦每一个结婚证
* 	根据结婚证获取丈夫和妻子
* 转换
* 	获取所有键值对对象的集合，得到每一个键值对对象
*	根据键值对度机箱获取键和值
*问题是键值对对象如何表示
*Set<Map,Entry<K,V>> entrySet();返回键值对对象
*
* 	
*/
public class MapDemo4 {
	public static void main(String[] args) {
		//创建集合对象
				Map<String,String> map = new HashMap<String,String>();
				//创建元素并添加到集合
				map.put("杨过","小龙女");
				map.put("郭靖", "黄蓉");
				map.put("杨康", "穆念慈");
				map.put("四爷","若曦");
				// 获取键值对集合
				Set<Map.Entry<String,String>> set = map.entrySet();
				//遍历 键值对对象的集合，得到每一个键值对对象
				for(Map.Entry<String, String> me:set){
					//根据键值对对象获取键和值
					String key = me.getKey();
					String value = me.getValue();
					System.out.println(key+"    "+value);
					
				}
	}

}
