package itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月15日 下午9:07:48 
* 类说明 
* 注意：字符串如果是变量相加，是先开空间，再拼接
* 		字符串如果是常量相加，先相加，然后在常量池中找，如果有就直接返回，
* 		否则，就创建。
*/
public class StringDemo4 {
	public static void main(String[] args){
		String s1= "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3==s1+s2);//false
		System.out.println(s3.equals((s1+s2)));//true
		
		System.out.println(s3=="hello"+"world");//false
		//这个应该是true
		//
		
		System.out.println(s3.equals("hello"+"world"));//true
	}

}
