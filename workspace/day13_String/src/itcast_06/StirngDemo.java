package itcast_06;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月23日 下午2:49:53 
* 类说明 
* 
*/
public class StirngDemo {
	public static void main(String[] args){
		//替换功能
		String s1 = "helloworld";
		String s2 = s1.replace('l','k');
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		System.out.println();
		String s3 = s1.replace("owo","ak48");
		System.out.println("s3:"+s3);
		
		//去除字符串两空格
		String s4 = " hello world ";
		String s5 = s4.trim();
		System.out.println("s4:"+s4+"=====");
		System.out.println("s5:"+s5+"=====");
		
		//按字典顺序比较两个字符串
		String s6 = "hello";
		String s7 = "hallo";
		String s8 = "abc";
		String s9 = "xyz";
		System.out.println(s6.compareTo(s7));//4  首字母相同的时候就 比较第二个字母，
		//依次类推,直到有不相同的，然后比较他们的ASCII值
		System.out.println(s6.compareTo(s8));//7   'h'的ASCII 值减去'a'的值
		System.out.println(s6.compareTo(s9));//-16  
		
	}

}
