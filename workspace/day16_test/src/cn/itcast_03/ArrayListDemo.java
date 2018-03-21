package cn.itcast_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月3日 下午2:23:55 
* 类说明 
* 键盘录入多个数据，以0 结束，要求在控制台输出这多个数据的最大
* 分析
* 	创建键盘录入数据对象
* 	键盘录入多个数据，我们不知道有多少个数据，所以用集合存储
* 	以0 结束，只要键盘录入的数据是0 ，就不再键盘录入数据】
* 	把集合转成数组
* 	对数组进行排序
* 	获取数组中的最大值的索引
* 
* 
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建键盘录入数据对象
		Scanner sc = new Scanner(System.in);
		
		//键盘录入多个数据，不知道是多少个数据，就以集合存储
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		//以0 结束，只要键盘录入的数据是0 ，就不再键盘录入数据】
		while(true){
			System.out.println("请输入数据：");
			int number = sc.nextInt();
			if(number !=0){
				array.add(number);
			}else{
				break;
			}
		}
		
		//把集合转成数组
		Integer[] i = new Integer[array.size()];
		//Integer[] ii = array.toArray(i);
		
		array.toArray(i);
		
		//对数组进行排序
		Arrays.sort(i);
		System.out.println("数组是："+arrayToString(i)+"最大值是："+i[i.length-1]);
		
	}
	public static String arrayToString(Integer[] i ){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int x = 0 ; x<i.length;x++){
			if(x==i.length-1){
				sb.append(i[x]);
			}else{
				sb.append(i[x]).append(",");
				
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
