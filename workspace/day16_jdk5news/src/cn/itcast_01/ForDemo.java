package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月2日 下午9:44:50 
* 类说明 
*/
public class ForDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr={1,2,3,4,5};
		for(int x = 0; x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println();
		
		//增强for
		for(int x:arr){
			System.out.println(x);
		}
		//定义一个字符串数组
		String[] strArray={"林青霞","风清扬","东方不败"};
		for(String s :strArray){
			System.out.println(s);
		}
		System.out.println();
		//定义一个集合
		ArrayList<String> arry = new ArrayList<String>();
		arry.add("hello");
		arry.add("world");
		arry.add("java");
		//
		for(String s:arry){
			System.out.println(s);
		}
		System.out.println();
		
//		List<String> list = null;
//		for(String s : list){
//			System.out.println(s);
//			//NullPointerException 空指针
			
		//}
	}

}
