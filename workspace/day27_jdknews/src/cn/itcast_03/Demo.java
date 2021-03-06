package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午7:18:44 
* 类说明 
*/
public class Demo {
	public static void main(String[] args) {
		//二进制字面量
		int x = 0b100100;
		System.out.println(x);//36
		
		//数字字面量可以出现下划线
		int y = 1_234_23;
		System.out.println(y);
		
		method();
	}

	private static void method()  {
		// TODO Auto-generated method stub
		//try---with---resources 语句
		try{
			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt");
			int ch = 0 ;
			while((ch = fr.read()) != -1){
				fw.write(ch);
			}
			fw.close();
			fr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		//改进版
		try(FileReader fr = new FileReader("a.txt");
				FileWriter fw = new FileWriter("b.txt");){
			
			int ch = 0 ;
			while((ch = fr.read()) != -1){
				fw.write(ch);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}
