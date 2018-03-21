package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午2:32:41 
* 类说明 
* ArrayList 去除集合中字符串的重复值
* 分析
* 	A 创建集合对象那个
* B 添加多个字符串元素（包含内容相同的）
* C创建新集合
* D遍历旧集合，获取得到每一个元素
* E 拿这个元素到新集合中找，有就不存储，没有就存储
* F遍历新集合
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();
		//添加集合元素
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("hello");
		array.add("javaee");
		//创建新集合
		ArrayList newArray = new ArrayList();
		//遍历旧集合，获取得到每一个元素
		Iterator it = array.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			//拿这个元素到新集合中进行判断
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		System.out.println(newArray);
		
		
		
		
	}

}
