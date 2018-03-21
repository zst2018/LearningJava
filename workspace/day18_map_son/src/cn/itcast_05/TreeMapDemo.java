package cn.itcast_05;

import java.util.Scanner;

import java.util.Set;
import java.util.TreeMap;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月5日 下午10:25:05 
* 类说明 
* 需求： “aababcabcdabcde”获取字符串中的每个字母出现的次数要求结果
* 				a(5)b(4)c(3)d(2)e(1)
* 分析
* 	定义一个字符串（可以改进为键盘录入）
* 	定义一个TreeMap 集合
* 	键  Character
* 	值 Integer
* 	C 把字符串转换为字符数组
* 	D 遍历字符数组，得到每一个字符
* 	E 拿刚才得到的字符作为键到集合中去找值，看返回值
* 		是null 说明该键不存在，就把该字符作为键，1 作为值存储
* ‘		不是null ，说明该键存在，就把值加1  然后重写存储该键和值
* 	F 定义字符串缓冲区变量
* 	G 遍历集合，得到键和值，进行按照要求拼接
* 	H把字符串缓冲区转换成字符串输出
* 
*/
public class TreeMapDemo {
	public static void main(String[] args) {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line = sc.nextLine();
		//定义一个TReeMap 集合
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		//把字符串转换成字符数组
		char[] chs = line.toCharArray();
		//遍历字符数组，得到每一个字符
		for(char ch:chs){
			//拿刚才得到的子符作为键到集合中去查找值，看返回值
			Integer i = tm.get(ch);
		//是null ：说明该键不存在，就把该字符作为键，i作为值存储
			if(i==null){
				tm.put(ch,i);
			}else{
			//不是null，说明该键存在，就把值加1 然后重写存储该键和值
				i++;
				tm.put(ch,i);
			}
		}
			
			//副你故意字符串缓冲区变量
		StringBuilder sb = new StringBuilder();
			
			//遍历集合买得到键和值，进行按照要求进行拼接
		Set<Character> set = tm.keySet();
		for(Character key : set){
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		//把字符串缓冲区转换成Eric字符串输出
			String result = sb.toString();
			System.out.println("result:"+result);
		
		
	}

}
