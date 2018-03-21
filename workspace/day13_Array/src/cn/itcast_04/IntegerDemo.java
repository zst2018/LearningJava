package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午1:07:44 
* 类说明 
* public static String toBinaryString(int i)
* public static String toOctalString(int i)
* public static String toHexString(int i)
* 
* 十进制转换为其他进制
* public static String toSTring (int i,int radix);
* 
* 
* 
*/
public class IntegerDemo {
	public static void main(String[] args){
		//十进制到二进制，八进制，十六进制的转换
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println();
		//十进制转换成其他进制
		System.out.println(Integer.toString(100,4));
		System.out.println(Integer.toString(100,1));
		System.out.println(Integer.toString(100,37));
		//其他进制到十进制
		System.out.println(Integer.parseInt("100",2));
		System.out.println(Integer.parseInt("100",8));
	}

}
