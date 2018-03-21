package cn.itcast_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午3:29:25 
* 类说明 
*/
public class ExceptionDemo {

}
class Fu{
	public void show() throws Exception{
		
	}
	public void method(){
		
	}
}

class zi extends Fu{
	//public void show() throws Exception{
	@Override
	public void show() throws ArithmeticException{
		
	}

	//public void method() throws ParseException{
	@Override
	public void method() {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date d=null;
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d);
	}
	
	
}









