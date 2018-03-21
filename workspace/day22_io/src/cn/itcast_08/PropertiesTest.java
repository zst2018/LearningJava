package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午5:20:24 
* 类说明 
* 需求：一个文本文件，name.txt 数据是键值对形式存在的，不知道内容是什么
* 写一个程序判断是否有“李四”这样的键存在，如果有就改变其值为“100”
* 分析L:	
* 	A 把文件中的数据加载到集合中
* 	B 遍历集合，获取得到每一个键，
* 	C 判断键是否有为“李四”的，如果有就改其值为“100”
* 	D 把集合中的数据重新存储到文件中
* 
*/
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		//把文件中的数据加载到集合中
		Properties prop = new Properties();
		Reader r = new FileReader("name.txt");
		prop.load(r);
		r.close();
		
		//遍历集合，获取得到每一个键
		Set<String> set = prop.stringPropertyNames();
		
		for(String key : set){
			if("李四".equals(key)){
				prop.setProperty(key, "100");
				break;
			}
		}
		
		//把集合中的数据重新存储到文件中
		Writer w = new FileWriter("name.txt");
		prop.store(w, null);
		
	}

}
