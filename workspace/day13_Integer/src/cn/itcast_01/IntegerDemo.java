package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月25日 下午9:51:56 
* 类说明 
* 要求：把100 这个数据的二进制，八进制，十六进制计算出来
* 	要求大家判断一个数据是不是int范围内，4 个字节
* 2^31-1  
* 	
*/
public class IntegerDemo {
	public static void main(String[] args){
		// public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		//public static String toOctalString(int i)\
		System.out.println(Integer.toOctalString(100));
		//public static String toHexString(int i)
		System.out.println(Integer.toHexString(100));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}

}
