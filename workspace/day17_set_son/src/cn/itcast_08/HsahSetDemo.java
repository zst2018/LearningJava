package cn.itcast_08;

import java.util.HashSet;
import java.util.Random;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午7:18:49 
* 类说明 
* 获取10 个1-20 的随机数
* 分析
* 		创建集合对象
* 		创建一个Set集合
* 		判断集合的长度是不是小于10 
* 			是   创建一个随机数添加
* 			否   
* 		遍历Set集合
*/
public class HsahSetDemo {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> ts = new HashSet<Integer>();
		//判断集合长度是不是小于10
		while(ts.size()<10){
			int num = r.nextInt(20)+1;
			ts.add(num);
		}
		//遍历
		for(Integer i : ts){
			System.out.println(i);
		}
		
	}

}
