package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月29日 下午10:01:31 
* 类说明 
*/
import java.util.Collection;
import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		// 测试不带All的方法
		//创建集合对象  Collection 是接口们不能实例化
		//public class ArrayList<E>  extends AbstractList<E> implements List<E>,RandomAccess,Cloneable,Serializable
		//public ArrayList() 构造一个初始容量为10 的空列表
		Collection c = new ArrayList();
		//从arrayList() 原码查找add（E，e）返回是 true 说明这个添加元素永远都能成功
		//所以，ArrayList 肯定是元素可重复的集合
		
		//直接输出集合
		System.out.println("c:"+c);//toString 方法已经重写
		
		//添加元素
		System.out.println("add:"+c.add("hello"));
		c.add("world");
		c.add("java");
		System.out.println("c:"+c);
		
		//删除元素
		//c.clear();//删除所有元素
		c.remove("hello");
		
		System.out.println("remove:"+c.remove("javaee"));
		System.out.println("c:"+c);
		
		//包含功能
		System.out.println("contains:"+c.contains("hello"));
		System.out.println("c:"+c);
		
		//判空
		System.out.println("isEmpty:"+c.isEmpty());
		System.out.println("c:"+c);
		
		//长度
		System.out.println("size:"+c.size());
	}

}
