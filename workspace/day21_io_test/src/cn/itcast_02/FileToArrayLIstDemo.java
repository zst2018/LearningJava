package cn.itcast_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 上午10:44:31 
* 类说明 
* 需求：从文本文件中读取数据，（每一行为一个字符串数据）到集合中，并遍历集合
* 分析： 
* 	数据源是一个文本文件
* 	目的地是一个集合，而且元素是字符串
* 数据源：
* 	a.txt---FileReader---BufferedReader
* 目的地
* 	ArrayList<String>
* 	
* 	
* 
*/
public class FileToArrayLIstDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//封装目的地（创建集合对象）
		ArrayList<String> array = new ArrayList<String>();
		
		//读取数据导集合中
		String line = null;
		while((line = br.readLine()) != null){
			//将读取的数据添加到array 中
			
			array.add(line);
		}
		
		//释放资源
		br.close();
		
		//遍历集合
		for(String s : array){
			System.out.println(s);
		}
	}
}
