package itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月22日 下午3:41:03 
* 类说明 
* 需求：遍历获取字符串中的每一个字符
* 分析：
* 		a:如何能够拿到每一个字符呢？
* 			char charAt(int index)
* 		b:我怎么知道字符到底是多少个呢
* 			int length()
*/
public class StringTest {
	public static void main(String[] args){
		//原始版本
		//定义字符串
		String s= "helloworld";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		// 只需要我们从0 取到9
		for(int x = 0 ; x<10; x++){
			System.out.println(s.charAt(x));
			
		}
		
		//如果长度太长，可以通过函数获取字符串的长度
		for(int x = 0 ; x<s.length(); x++){
			System.out.print(s.charAt(x));
		}
	}

}
