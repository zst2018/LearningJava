package cn.itcast_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 下午5:09:31 
* 类说明 
* 已知s.txt文件中有这样一个字符串，“hcexfgijkamdnoqrzstuvwybpl”
* 
* 请编写程序读取数据内容，把数据排序写入ss.txt
* 分析：
* 	A 把 s.txt 这个文件给做出来
* 	B 读取该文件的内容，存储到一个字符串中
* 	c 把字符串转换成字符数组
* 	D 对字符数组进行排序
* 	E 把排序后的字符数组转换成字符串
* 	F 把字符串再次写入ss.txt中
* 	
*/
public class StringDemo {
	public static void main(String[] args) throws IOException {
		//读取该文件的内容，存储到一个字符串中
		BufferedReader br = new BufferedReader (new FileReader("a.txt"));
		
		String line = br.readLine();
		br.close();
		
		//把字符串转换为字符数组
		char[] chs = line.toCharArray();
		
		//对字符数组进行排序
		Arrays.sort(chs);
		
		//把排序后的字符数组转换为字符串
		
		String s = new String(chs);
		
		//把字符串再次写入ss.txt中
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(s);
		bw.newLine();
		bw.flush();
		bw.close();
		
		
	}

}














