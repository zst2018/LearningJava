package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午4:33:46 
* 类说明 
* 这里的集合必须是Properties 集合
* public void load(Reader reader) 把文件中的数据读取到集合中
* public void store(Writer writer,String comments) 把集合中的数据存储到文件
* 
* 单机版游戏
* 	进度保存和加载
* 	三国志，仙剑奇侠传。。
*  吕布=1
*  方天画戟=1
*  
* 
*/
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		//myload();
		mystore();
		
	}

	private static void mystore() throws IOException {
		// TODO Auto-generated method stub
		//创建集合对象
		Properties prop = new Properties();
		
		prop.setProperty("张三","男");
		prop.setProperty("李四","男");
		prop.setProperty("凤姐","女");
		
		//public void store(writer writer,String comments)把集合中的数据存储到文件中
		Writer w = new FileWriter("name.txt");
		//prop.store(w, null);
		prop.store(w,"halloworld");
		w.close();
		
	}

	private static void myload() throws IOException {
		// TODO Auto-generated method stub
	Properties prop = new Properties();
		
		//public void load(Reader reader) 把文件中的数据读取到集合中
		//注意：这个文件的数据必须是键值对形式
		
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();
		System.out.println("prop"+prop);
	}

}
