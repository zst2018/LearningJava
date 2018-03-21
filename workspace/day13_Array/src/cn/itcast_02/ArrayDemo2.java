package cn.itcast_02;

import java.util.Arrays;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月25日 下午8:31:00 
* 类说明 
* 注意：
*/
public class ArrayDemo2 {
	public static void main(String[] args)
{
		//定义一个数组
		int[] arr={24,69,80,57,13};
		//先排序
		int[] chs = bubbleSort(arr);
		String s= Arrays.toString(chs);
		System.out.println(s);
		System.out.println(find(chs,57));
	}
	//冒泡排序法
	public static int[] bubbleSort(int[] arr)
    {
		for(int y=0;y<arr.length-1;y++){
			for(int x=0;x<arr.length-1-y;x++){
				if(arr[x]>arr[x+1]){
					int temp;
					temp = arr[x];
					arr[x]=arr[x+1];
					arr[x+1]=temp;
				}
			}
		}
		return arr;
	}
	

	public static int find(int[] arr ,int value){
		int max=arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(arr[mid] !=value){
			if(arr[mid]>value){
				min= mid +1;
			}else if(arr[mid]<value){
				max=mid-1;
			}
			if(min>max){
				return -1;
			}
			mid = (max+min)/2;
		}
		return mid;
	}


}