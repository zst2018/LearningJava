package cnitcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午1:39:02 
* 类说明 
* HashSet  存储并遍历集合
* 问题：hashSet 为什么存储字符串的时候，字符串相同的只存储了一个
* 
*/
import java.util.HashSet;
public class HashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		HashSet<String> hs = new HashSet<String>();
		//创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		
		//遍历集合
		for(String s : hs){
			System.out.println(s);
		}
		
	}

}
