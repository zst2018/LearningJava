package cn.itcast_03;

import java.util.Arrays;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月25日 下午9:13:37 
* 类说明 
* Array  针对数组进行操作的工具类，比如排序和查找
* public static String toString(int[] a)  把数组转成字符串
* public static void sort(int[] a)对数组进行排序
* public static binarySearch(int[] a,int value) 二分查找
* 
*
*/
public class ArrayDemo {
	public static void main(String[] args){
		int[] arr = {24,69,80,57,13};
		System.out.println("排序前："+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("排序后："+Arrays.toString(arr));
		
		System.out.println("binarySearch："+Arrays.binarySearch(arr,57));
	
		System.out.println("binarySearch："+Arrays.binarySearch(arr,55));
	}

}
