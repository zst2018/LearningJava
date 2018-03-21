
package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 下午9:51:42 
* 类说明 
* 有些时候，我们是可以对异常进行处理的，但是又有些时候，我们对异常是处理不了的
* 或者说，我处理不了，就不处理 了
* 为了解决出错问题，java针对这种情况，就提供了另一种处理方案：抛出
* 格式：
* 	theows 异常类名
*	 注意：
* 		这种格式必须跟在方法的括号后面
* 注意：尽量不要在main方法上抛出异常
* 小结：
* 	编译时期异常的抛出，将来调用者必须处理
* 	运行时期异常的抛出，将来调用者可以不用处理
*/
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("今天天气很好");
		try {
			method();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("但是就是不该有雾霾");
		method2();
	}
//运行时异常抛出，将来调用者不用处理
	public static void method2() throws ArithmeticException{
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		
	}

	//在方法申明上抛出，是为了告诉调用者，你注意了，我有问题。
	//编译期间异常的抛出
	public static void method() throws ParseException{
		// TODO Auto-generated method stub
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
		
	}

}
