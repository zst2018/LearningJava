package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 下午8:41:03 
* 类说明 
* 在try里面发现问题后，JVM会帮我们生成一个异常对象，然后把这个对象抛出，和catch里面的类进行匹配
* 如果该对象是某个类型的，就会执行该catch里面的处理信息。
*/
public class ExceptionDemo {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
			try {
				Date d = sdf.parse(s);//创建了一个ParseException对象，然后抛出去，和catch里面进行匹配
				System.out.println(d);
			} catch (ParseException e) {//ParseException e= new ParseException();
				// TODO Auto-generated catch block
				//Pa
				//e.printStackTrace();
				System.out.println(e.getMessage());//Unparseable date: "2014-11-20"
				System.out.println(e.toString());
				//java.text.ParseException: Unparseable date: "2014-11-20"
				
				
				e.printStackTrace();
			}
			System.out.println("over");
			//surround with try/catch
			
		
	}

}
