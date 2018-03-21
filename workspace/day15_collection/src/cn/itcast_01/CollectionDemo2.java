package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月30日 下午3:27:12 
* 类说明 
* Collection 方法
*/
import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo2 {
	public static void main(String[] args) {
		//创建集合1
		//创建集合2
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		//创建集合2
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc6");
		c2.add("abc7");
		c2.add("abc8");
		
		//boolean addAll(Collection c):添加一个集合的元素
		c1.addAll(c2);
		System.out.println("removeAll:"+c1.removeAll(c2));
		System.out.println("containsAll:"+c1.containsAll(c2));
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		//public retainAll(Collection c)
		//两个集合都有的元素？思考元素去哪里了，返回的boolean 又是什么意思
		System.out.println("retainAll:"+c1.retainAll(c2));
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
	}

}
















