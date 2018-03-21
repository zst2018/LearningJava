package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月1日 下午7:44:41 
* 类说明 
* List 的特有功能
* A 添加功能
* 		在指定位置添加元素
* 		void add(int index,Object element)
* B 获取功能
* 		Object get(int index)获取指定位置的元素
* C 列表迭代器 是list集合特有的迭代器
* 	    ListIterator listiterator() 
*  D 删除元素
*  	    Object remove(int index)根据索引删除元素，返回被删除的元素
*  E 修改功能
*  		Object set(int ijndex,Object element) 根据索引修改元素，返回被修改的元素
*  
* 		
*/
public class ListDemo {
	public static void main(String[] args) {
		//创建集合对象
		List list = new ArrayList();
		
		//添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		
		//添加功能
		list.add(1,"android");
		//list.add(11,"hallo");//IndexOutOfBoundsException
		list.add(3,"javaee");
		
		//获取功能
		list.get(1);
		//list.get(11);//IndexOutOfBoundsException越界
		
		//删除功能
		list.remove(1);
		//list.remove(11);//IndexOutOfBoundsException
		
		//修改功能
		System.out.println("set:"+list.set(1,"nihao"));
		System.out.println("list:"+list);
	}

}
