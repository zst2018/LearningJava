package cn.itcast.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月19日 下午9:21:46 
* 类说明 
* 反射
* 	需要有配置文件配合使用
* 	用class.txt代替
* 	并且知道有两个键
* 		className
* 		methodName
* 
* 
*/
public class Test {
	public static void main(String[] args) throws IOException, Exception {
		//反射前的做法
//		Student  s = new Student();
//		s.love();
//		Teacher t = new Teacher();
//		t.love();
		
		//反射后的做法
		
		//加载键值对数据
		Properties prop= new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		//获取数据
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		
		//反射
		Class c = Class.forName(className);
		
		Constructor con = c.getConstructor();
		
		Object obj = con.newInstance();
		
		//调用方法
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}

}
