package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午1:47:22 
* 类说明 
*  hashMap是基于哈希表的map接口实现
*  哈希表作用是用来保证键的唯一性的
*  
*/
public class HashMapDemo {
	public static void main(String[] args) {
		//创建元素
		HashMap<String,String> hm = new HashMap<String,String>();
		//创建元素并添加元素
//		String key1= "it001";
//		String value = "xioa";
//		hm.put(key1, value);
		
		hm.put("it001", "马云");
		hm.put("it003", "马花藤");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯君");
		hm.put("it001", "比尔盖茨");
		//遍历
		Set<String> set = hm.keySet();
		for(String key:set){
			String value = hm.get(key);
			System.out.println(key+"----"+value);
		}
		
	}

}
