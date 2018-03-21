package cn.itcast_02;

import java.util.ArrayList;
import java.util.Random;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午2:06:37 
* 类说明 
* 获取10 个1-20 间的随机数，要求不重复
* 用数组实现，但是数组的长读是固定的，长度不好确定
* 所以我们使用集合的方式实现
* 分析
* 	创建产生随机数的对象
* 	创建一个存储随机数的集合
* 	定义一个统计变量，从0开始
*	判断统计变量是否小于10
*		是
*			先产生一个随机数，判断该随机数在集合中是否存在
*			如果不存在，就添加，统计变量+1 
*			如果存在，就不理它
*		否	
*			退出循环
*
*			
* 
*/
public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int count = 0 ;
		
		while(count<10){
			int number = r.nextInt(20)+1;
			
			if(!array.contains(number)){
				array.add(number);
				count++;
			}
		}
		for(Integer i : array){
			System.out.println(i);
		}
	}

}












