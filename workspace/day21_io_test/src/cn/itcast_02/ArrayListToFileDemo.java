package cn.itcast_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 上午10:30:14 
* 类说明 
* 需求： 	把ArrayList集合中的字符串数据存储到文件夹中
* 	分析：ArrayList 集合里存储的是字符串
* 		遍历ArrayList集合，把数据获取到
* 		然后存储到文本文件中，即使用字符流
* 数据源：
* 	ArrayList<String>---遍历得到每一个字符串数据
* 目的地
* 	a.txt文件---FileWriter---Bufferedwriter
* 
* 
*/
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		//创建集合对象，封装数据源
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		//遍历集合
		for(String s : array){
			//写数据
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();
	}

}
