package itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月15日 下午8:27:26 
* 类说明 
* 
* String  s  = new  String("hello");
* 
* String s = "hello";
* 
* 两者的区别
* 	
* 前者会创建一个（常量池中有）或两个对象
* 后者会创建 零个或一个对象
* 
* 
*/
public class StringDemo2 {
	public static void main(String[] args){
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));
	}

}










