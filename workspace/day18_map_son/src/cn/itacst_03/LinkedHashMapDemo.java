package cn.itacst_03;

import java.util.LinkedHashMap;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午3:01:48 
* 类说明 
* LinkedHashMap 接口的哈希表和连接列表实现，具有可预知的迭代顺序
*/
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		//c
		LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();
		
		hm.put("2345", "hello");
		hm.put("2346", "world");
		hm.put("1345", "java");
		hm.put("2375", "javaee");
		
		Set<String> set =hm.keySet();
		for(String key : set){
			String value = hm.get(key);
			System.out.println(key+"----"+value);
		}
	}

}
