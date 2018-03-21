package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月15日 下午9:34:14 
* 类说明 
* String类的判断功能
*   boolean equals(Object obj);比较字符串的内容是否相同，区分大小写
*   boolean equalsIgnoreCase(String anotherString);比较字符串的内容是否相同，忽略大小写
*   boolean contains(String str);判断大字符串中是否包含小字符串
*   boolean startsWith(String str);判断字符串是否以某个指定的字符串开头
*   boolean endsWith(String str);判断字符串是否以某个指定的字符串结尾
*   boolean isEmpty();判断字符串是否为空。
*   注意：
*   字符串内容为空，是指对象存在，但内容不存在。
*   字符串对象为空，是指对象不存在
*   	String s = "";字符串内容为空，字符串对象存在。能调方法
*   	String s = null;字符串对象为空，不能调方法
*   
*   
*/
public class StringDemo {
	public static void main(String[] args){
		//创建字符串对象
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";
		
		// boolean equals(object obj);比较字符串的内容是否相同，区分大小写
		System.out.println("equals:"+s1.equals("helloworld"));
		System.out.println("equals:"+s1.equals(s3));
		System.out.println();
		
		
		//boolean equalsIgnoreCase(String str);比较字符串的内容是否相同，忽略大小写
		System.out.println("equals:"+s1.equalsIgnoreCase("helloworld"));
		System.out.println("equals:"+s1.equalsIgnoreCase("Helloworld"));
		System.out.println();
		
		//boolean contains(String str);判断大字符串中是否包含小字符串
		System.out.println("contains:"+s1.contains("hw"));
		//false  hw 没有连在一起
		System.out.println("contains:"+s1.contains("hello"));
		System.out.println();
		
		
		//boolean startsWith(String str);判断字符串是否以某个指定的字符串开头
		System.out.println("startsWith:"+s1.startsWith("hello"));//true
		System.out.println("startsWith:"+s1.startsWith("h"));
		System.out.println();
		
		
		//boolean isEmpty();判断字符串是否为空
		
		String s4 = "";
		//String s5 = null;
		System.out.println("isEmpty:"+s4.isEmpty());
		
		//System.out.println("isEmpty:"+s5.isEmpty());
		// nullpoointerexception
		// s5对象都不存在，所以不能调用方法，空指针异常.
		
		
		
		
	}

}
