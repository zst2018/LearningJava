package cn.itcast_05;

import java.util.LinkedList;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午4:11:31 
* 类说明 
*/
public class MyStack {
	private LinkedList link;
	public MyStack(){
		link = new LinkedList();
	}
	public void add(Object obj){
		link.addFirst(obj);
	}
	public Object get(){
		return link.removeFirst();
	}
	public boolean isEmpty(){
		return link.isEmpty();
	}

}
