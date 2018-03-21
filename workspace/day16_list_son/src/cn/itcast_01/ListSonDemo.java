package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;


/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午12:32:46 
* 类说明 
*/
public class ListSonDemo {
	public static void main(String[] args) {
		//创建集合对象
	     ArrayList array= new ArrayList();
	     //创建并添加元素
	     array.add("hello");
	     array.add("world");
	     array.add("java");
	     //遍历
	     Iterator it = array.iterator();
	     while(it.hasNext()){
	    	 String s = (String) it.next();
	    	 System.out.println(s);
	     }
	     System.out.println();
	     //for
	     for(int x = 0;x<array.size();x++){
	    	 String s = (String) array.get(x);
	    	 System.out.println(s);
	     }
	     
		
				
	}

}
