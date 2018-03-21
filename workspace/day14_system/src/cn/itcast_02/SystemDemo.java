package cn.itcast_02;

import java.util.Arrays;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午5:07:28 
* 类说明 
* public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
* 注意：命名
* 从指定原数组中复制一个数组，复制从指定位置开始，到指定位置结束。
* Object src 从源数组，srcPos  源数组中的起始位置
* dest 目标数组
* destPos 目标数据中的起始位置
* length 要复制的数组元素的数量
* 
*/
public class SystemDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr={11,22,33,44,55};
		int[] arr2={6,7,8,9,10};
		System.arraycopy(arr,1,arr2,2,2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

}
