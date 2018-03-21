package cn.itcast_05;

import java.util.regex.Pattern;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午1:48:37 
* 类说明 
* 获取功能
* 获取下面这个字符串中由三个字符组成的单词
* da jia ting wo shuo, jin tian yao xia yu ,bu shang wan zi xi ,gao xiang bu ?
* 
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo2 {
	public static void main(String[] args) {
		//定义字符串
		String s = "da jia ting wo shuo, jin tian yao xia yu ,bu shang wan zi xi ,gao xiang bu ?";
		//规则
		String regex= "\\b\\w{3}\\b";
		//把规则编译成模式对象
		Pattern p = Pattern.compile(regex);
		//通过模式对象得到匹配器对象
		Matcher m = p.matcher(s);
		//调用匹配器对象的功能
		//通过find 方法就是查找有没有满足条件的子序列
		boolean flag = m.find();
		System.out.println(flag);
		String ss = m.group();
		System.out.println(ss);
		System.out.println();
		
		flag = m.find();
		System.out.println(flag);
		ss = m.group();
		System.out.println(ss);
		
		while (m.find()){
			System.out.print(m.group()+" ");
		}
		
		
	}

}
