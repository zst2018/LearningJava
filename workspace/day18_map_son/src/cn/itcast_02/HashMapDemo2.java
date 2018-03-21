package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午2:09:57 
* 类说明 
*HashMap<Integer,String>
*键  Integer
*值 String
*/
public class HashMapDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//创建元素biang添加元素
//		Integer i = new Integer(27);
//		Integer i = 27;
//		String s = "林青霞";
//		hm.put(i, s);
		hm.put(27, "林青霞");
		hm.put(30, "风清扬");
		hm.put(28, "留意");
		hm.put(29, "林青霞");
		
		
		//下面的数字是八进制
		
		hm.put(001, "你好");//0 开头表示8 进制表示，只能由0---7组成
		hm.put(002, "你好");
		//遍历
		Set<Integer> set = hm.keySet();
		for(Integer key : set){
			String value = hm.get(key);
			System.out.println(key+"----"+value);
		}
		
		
	}

}
