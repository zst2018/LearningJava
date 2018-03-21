package itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月15日 下午7:19:49 
* 类说明 
* 字符串的特点：一旦被赋值，就不会被改变。这里不能改变的是“值”
* 			而不是引用
*/
public class StringDemo {
	public static void main(String[] args){
		String s = "hello";
		s +="world";
		System.out.println("s:"+s);
	}

}
