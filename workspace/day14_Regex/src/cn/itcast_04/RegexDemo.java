package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午7:57:30 
* 类说明 
* 替换功能
	String类的public String replaceAll(String regex,String replacement)
	使用给定的replacement 替换洗字符串找那个满足正则表达式的子字符串
	
*/
public class RegexDemo {
	public static void main(String[] args) {
		//定义一个字符串
		String s ="helloqq12345worldkh23476598java";
		//去除所有的数字，用* 替换
		//String regex="\\d+";
		String regex="\\d";// 出现数字就给一个* 
		
		//String ss= "*";
		String ss ="";
		String result = s.replaceAll(regex,ss);
		System.out.println(result);
		
				
		
	}

}
