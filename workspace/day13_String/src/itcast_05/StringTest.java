package itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月22日 下午10:17:12 
* 类说明 
* 要求：把一个字符串的首字母转成大写，其余为小写。（只考虑英文大小写字母字符）
*  举例：
*  		helloWORLD
*  结果：
*  		Helloworld
*  分析：
*  	A: 先获取第一个字符
*  	B： 获取除了第一个字符以外 的字母
*  	C： 把A转成大写
*   D：把B转成大写
*   E： C拼接D
*/
public class StringTest {
	public static void main(String[] args){
		//定义一个字符
		String s = "helloWORLD";
		
		//先获取第一个字符
		String s1 = s.substring(0,1);
		
		//获取除了第一个字符以外的字符
		String s2 = s.substring(1);
		
		//转大写
		String s3 = s1.toUpperCase();
		//转小写
		String s4 = s2.toLowerCase();
		// C 拼接D
		String s5 = s3.concat(s4);
		System.out.println(s5);
		
		//优化后的代码
		String result  = s.substring(0,1).toUpperCase()
							.concat(s.substring(1).toLowerCase());
		System.out.println(result);
	}

}











