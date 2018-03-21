package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午4:19:10 
* 类说明 
* 开始存储时。存储了String 和Integer 两种类型的数据
* 而在遍历的时候，都把他们当做String 类型处理，做了转换，所以报错
* 但是，编译的时候却没有报错
* 
* 
*/
public class GenericDemo {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList array = new ArrayList();
		
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		//array.add(new Integer(100));
		//array.add(100);//JDK 5 以后自动装箱
		//等价于  array.add(Integer.valueOf(100));
		
		//遍历
		Iterator it = array.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
			
		}
		
	}

}
