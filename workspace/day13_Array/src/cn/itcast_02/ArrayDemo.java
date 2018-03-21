package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月25日 下午7:53:29 
* 类说明 
* 二值查找（要求 数组元素有序）
* 	
* 
*/
public class ArrayDemo {
	public static void main(String[] args){
		//定义一个数组
		int[] arr = {11,22,33,44,55,66,77};
		//写功能实现
		int index = getIndex(arr,33);
		System.out.println("index:"+index);
		
		//当要查找的数在数组中不存在时。，容易陷入死循环
		
		//index =getIndex(arr,78);
		//System.out.println("index:"+index);
	}
	/*
	 * 两个明确：
	 * 返回值类型： int
	 * 参数列表  int[] arr. int value
	 * 
	 * */
	public static int getIndex(int[] arr,int value){
		//定义最大索引，最小索引
		int max=arr.length-1;
		int min=0;
		//计算中间索引
		int mid = (max+min)/2;
		//拿中间索引值和要查找的值进行比较
		while(arr[mid]!=value){
			if(arr[mid]>value){
				max=mid-1;
			}else if (arr[mid]<value){
				min=mid +1;
			}
			//加入判断
			if(min>max){
				return -1;
			}
			mid = (max+min)/2;
		}
		return mid;
		
	}

}
