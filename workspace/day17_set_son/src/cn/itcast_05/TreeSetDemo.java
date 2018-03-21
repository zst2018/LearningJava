package cn.itcast_05;

import java.util.TreeSet;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午3:57:58 
* 类说明 
* TreeSet ：能够对元素进行排序
* 两种方式
* 自然排序
* 比较器排序
* 
* 通过馆擦treesEt  的add方法，需要看treeMap 的普通方法
*/
public class TreeSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		//午餐构造    自然排序
		TreeSet<Integer> ts = new TreeSet<Integer>();
		//创建元素并添加
		ts.add(20);
		ts.add(17);
		ts.add(23);
		ts.add(29);
		ts.add(12);
		ts.add(19);
		ts.add(17);
		ts.add(20);
		//遍历
		for(Integer i : ts){
			System.out.println(i);
		}
		
		
	}

}





