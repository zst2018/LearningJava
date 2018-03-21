package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月30日 下午3:55:15 
* 类说明 
* 集合的遍历：依次获取集合中的每一个元素。
* Object[] toArray() 把集合转成数组，实现集合的遍历
* 
*/
import java.util.Collection;
import java.util.ArrayList;
public class CollectionDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		//添加元素
		c.add("hello"); //Object obj = "hello";向上转型
		
		c.add("world");
		c.add("java");
		
		//遍历
		//Object[] toArray();
		Object[] objs=c.toArray();
		for (int x=0;x<objs.length;x++){
			System.out.println(objs[x]);
			//我知道元素是字符串，我在获取到元素的同时，还想知道元素的长度
			//System.out.println(objs[x]+"-------"+objs[x].length);
			//Object 中没有length()方法
			//如果想使用字符串的方法，就必须把元素还原成字符串
			// 向下转型
			String s = (String) objs[x];
			System.out.println(s+"---"+s.length());
		}
		
	}

}
