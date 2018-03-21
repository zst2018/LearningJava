package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午10:08:15 
* 类说明 
*/
public class MapDemo2 {
	public static void main(String[] args) {
		//创建集合
		Map<String,String> map =  new HashMap<String,String>();
		
		//创建元素并添加元素
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("黄磊", "孙莉");
		map.put("刘恺威", "杨幂");
		//获取
//		System.out.println("get:"+map.get("黄磊"));
//		System.out.println("get:"+map.get("黄黄"));
		Set<String> set = map.keySet();
		for(String key : set){
			System.out.println(key);
		}
		
		Collection<String> con = map.values();
		for(String value: con){
			System.out.println(value);
		}
				
		
	}

}
