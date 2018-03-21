package cn.itcast_05;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月26日 下午8:22:21 
* 类说明 
* 获取功能
* pattern 和 matcher 类的使用
* 模式和匹配器的基本使用顺序
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {
	public static void main(String[] args) {
		//模式和匹配器的典型调用
		//把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		//通过模式对象，得到匹配器对象  这个时候需要的是被匹配的字符串
		
		Matcher m = p.matcher("aaaab");
		//调用匹配器对象的功能
		boolean b = m.matches();
		System.out.println(b);
		
		//这个是判断功能，但是如果做判断，这样就有点麻烦了，我们直接用字符串的方法做
		String s = "aaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);
		
		
	}

}
