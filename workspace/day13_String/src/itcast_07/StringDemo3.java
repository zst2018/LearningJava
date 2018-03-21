package itcast_07;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月23日 下午5:26:22 
* 类说明 
* 要求：
* 	键盘录入   “abc”
*  输出“cba”
*  分析：
*  	A：键盘录入一个字符串
*  B：定义一个新字符串
*  C 倒着遍历字符串，得到每一个字符
*     1 length 和charAt 
*     2 把字符串转成字母数组
*   D 用新字符串把每一个字符拼接起来
*   E 输出新串
*   
*  
* 
*/
import java.util.Scanner;
public class StringDemo3 {
	public static void main(String[] args){
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
		
		//定义一个新字符串
		String result = "";
		//把字符串转成一个新的字符数组
		char[] chs = line.toCharArray();
		
		//倒着遍历一个字符串，得到每一个字符
		for(int x=chs.length-1;x>=0;x--){
			result += chs[x];
			
		}
		//输出新串
		System.out.println("反转后的结果是："+result);
		
		
	}

}


















