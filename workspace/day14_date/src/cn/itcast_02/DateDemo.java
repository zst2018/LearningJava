package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年1月27日 下午9:35:07 
* 类说明 
* 成员方法
* public long getTime();获取时间，以毫秒为单位
* public void setTime(long time) 设置时间
* 
* 
*/
import java.util.Date;
public class DateDemo {
	public static void main(String[] args) {
		//创建对象
		Date d = new Date();
		
		//获取时间
		long time = d.getTime();
		System.out.println(time);
		System.out.println(System.currentTimeMillis());
		
		System.out.println("d:"+d);
		//设置时间
		d.setTime(1000);
		System.out.println("d:"+d);
		
		
	}

}
