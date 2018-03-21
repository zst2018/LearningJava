package cn.itcast_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月6日 下午1:12:18 
* 类说明 
*/   
public class FinallyDemo {
	public static void main(String[] args) {
		
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=null;
		//对d 进行初始化
		try{
			//System.out.println(10/0);
			d = sdf.parse(s);
		}catch(ParseException e){
			e.printStackTrace();
			//退出
			System.exit(0);
		}finally{
			
			System.out.println("这里的代码是可以执行的");
		}
		System.out.println(d);
	}

}
