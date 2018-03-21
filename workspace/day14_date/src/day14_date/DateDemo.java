package day14_date;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午9:14:26 
* 类说明 
* Date 类
* 构造方法  
* 	public Date()根据当前的默认的毫秒值创建日期对象
* public Date(long Date)根据给定的毫秒值创建日期对象
* 
* 
*/
import java.util.Date;
public class DateDemo {
	public static void main(String[] args) {
		//创建对象
		Date d = new Date();
		System.out.println(d);//toString 方法已经重写
		
		//创建对象
	//	long time = System.currentTimeMillis();
		long time = 300000;
		Date d2 = new Date(time);
		System.out.println("d2:"+d2);
		
	}
	

}
