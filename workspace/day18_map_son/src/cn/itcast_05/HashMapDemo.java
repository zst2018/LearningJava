package cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月4日 下午8:07:54 
* 类说明 
* hashMap嵌套 hashMap
* 传智博客
* 	 jc 基础班
* 			李佳     20
* 			李浩     22
* 	 jy 就业班
* 			朱伟  24
* 			张淼  23
* 先存储元素，然后遍历元素
* 
*/
public class HashMapDemo {
	public static void main(String[] args) {
		//创建集合对象
		HashMap<String,HashMap<String,Integer>> czbkMap = new HashMap<String,HashMap<String,Integer>>();
		
		//创建基础班对象
		HashMap<String,Integer> jcMap = new HashMap<String,Integer>();
		//添加元素
		jcMap.put("李佳", 20);
		jcMap.put("李浩", 22);
		//把基础班添加到大集合
		czbkMap.put("jc",jcMap);
		
		//创建就业办对象
		HashMap<String,Integer> jyMap = new HashMap<String,Integer>();
		//添加元素
		jyMap.put("朱伟", 23);
		jyMap.put("张淼", 24);
		//把基础班添加到大集合
		czbkMap.put("jy",jyMap);
		
		//遍历集合
		Set<String> czbkMapSet=czbkMap.keySet();
		for(String czbkMapKey : czbkMapSet){
			System.out.println(czbkMapKey);
	
			
			HashMap<String,Integer> czbkMapValue = czbkMap.get(czbkMapKey);
			
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for(String czbkMapValueKey:czbkMapValueSet){
				Integer czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
				System.out.println(czbkMapValueKey+"-----"+czbkMapValueValue);
			}
			
			
	
			
		}
	}

}
