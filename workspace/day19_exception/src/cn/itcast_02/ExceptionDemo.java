package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月5日 下午8:14:20 
* 类说明 
* 编译时异常和运行时异常的区别
* 编译时期异常
* 运行时期异常
* 
*/
public class ExceptionDemo {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("解析日期出问题了");
		}
	}

}
