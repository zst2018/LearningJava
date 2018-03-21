package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午8:25:27 
* 类说明 
* 作为学生来说，是根据学号类似区分不同的学生的，那么假设现在知道学生的学号，我要根据学号
* 去获取学生的姓名
* 采用前面的集合，可以把学号和学生姓名作为一个对象的成员，然后存储整个对象，遍历的时候
* 判断，获取对应的名称
* 但是，如果我都能把学生姓名拿出来了，还需要根据编号去找吗？
* 
*针对目前的需求：仅知道学号，就想知道学生姓名的情况，java提供了一种新的集合Map
*通过查看API，我们知道MAP集合的一个最大的特点，就是它可以存储键，值对的元素。这个时候存储我们上面的需求，就可以这样做
*学号1  姓名1
*学号2 姓名2
*学号3 姓名3
*Map 中，键和 
*/
public class MapDemo {
	public static void main(String[] args) {
		//创建集合对象  说明键和值都是String 类型
		Map<String,String> map =  new HashMap<String,String>();
		//添加元素   V put(K key,v value) 
//		System.out.println("put:"+map.put("黄海波", "海清"));
//		System.out.println("put:"+map.put("黄海波", "高圆圆"));
		
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("黄磊", "孙莉");
		map.put("刘恺威", "杨幂");
		
		//map.clear();
		
		//删除元素
//		System.out.println("remove:"+map.remove("黄晓明"));
//		System.out.println("remove:"+map.remove("黄晓波"));
	
//		System.out.println("containsKey:"+map.containsKey("黄晓波"));
//		System.out.println("containsKey:"+map.containsKey("黄晓明"));
		
		
//		System.out.println("isEmpty:"+map.isEmpty());
		
		System.out.println("size:"+map.size());
		
		//输出集合名称
		System.out.println("map:"+map);
	}

}
