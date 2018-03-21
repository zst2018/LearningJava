package cn.itcast_03;

import java.util.Arrays;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午7:21:03 
* 类说明 
* 要求：
* 	91 27 46 38 50
* 输出  27 38 46 50 91
* 分析：
* 	a 定义一个字符串
* 	b 把字符串进行分割，得到字符串数组
* 	C 把字符串数组，变换成int数组
* 	D  对int数组排序
* 	E 把排序后的数组，再组长成一个字符串
* 	F 数组字符串
* 
*/
public class RegexTest {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "91 27 46 38 50";
		
		//把字符串进行分割，得到一个字符串数组
		String[] strArray= s.split(" ");
		// 把字符串数组变换成int数组
		int[] arr = new int[strArray.length];
		
		for(int x = 0;x<arr.length;x++){
			arr[x]=Integer.parseInt(strArray[x]);
		}
		//对int数组排序
		Arrays.sort(arr);
		//把排序后的int数组在组装成一个字符串
		StringBuilder sb = new StringBuilder();
		for(int x=0 ; x<arr.length;x++){
			sb.append(arr[x].append(" "));
			
			
		}
		//装换成字符串
		String result = sb.toString().trim();
		//输出字符串
		System.out.println(result);
		
		
	}

}
