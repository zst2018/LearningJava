package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月11日 下午5:36:37 
* 类说明 
* 需求：猜数字游戏，猜五次后提示游戏结束，请付费
* 
*/
public class PropertiesTest2 {
	public static void main(String[] args) throws IOException {
		//GuessNumber.start();
		//读取某个地方的数据，如果次数不大于5 ，可以继续玩，否则就提示“游戏试玩已经结束，请付费
		//创建一个文件
//		File file = new File("coun.txt");
//		if(!file.exists()){
//			file.createNewFile();	
//		}
		
		//把数据加载到集合中
		Properties prop = new Properties();
		
		Reader r = new FileReader("count.txt");
		prop.load(r);
		r.close();
		
		//获取键值
		String value =prop.getProperty("count");
		//将String类型的键值转换成int类型的
		int number = Integer.parseInt(value);
		
		if(number >= 5){
			System.out.println("游戏结束了，请付费");
			System.exit(0);
		}else{
			number++;
			
			prop.setProperty("count",String.valueOf(number));
			//
			Writer w = new FileWriter("count.txt");
			
			prop.store(w,null);
			w.close();

			GuessNumber.start();
		}
		
		
	}
}
















