package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午1:22:19 
* 类说明 
* vector 的特有更能
* 添加功能
* public void addElement(Object obj)
* 获取功能
* public Enumeration elements()
*/
public class VectorDemo {
	public static void main(String[] args) {
		//创建集合对象
		Vector v = new Vector();
		//添加功能
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		//遍历
		for(int x = 0;x<v.size();x++){
			String s = (String) v.elementAt(x);
			System.out.println(s);
		}
		System.out.println();
		Enumeration en = v.elements();//返回实现类的对象
		while(en.hasMoreElements()){
			String s = (String) en.nextElement();
			System.out.println(s);
		}
		
	}

}
