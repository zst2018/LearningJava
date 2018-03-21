package cn.itcast_11;

import java.util.Timer;
import java.util.TimerTask;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午6:31:46 
* 类说明 
*/
public class TimerDemo2 {
	public static void main(String[] args){
		//创建定时器对象
		Timer t = new Timer();
		//3秒后爆炸任务第一次，如果不成功，每隔两秒再继续
		t.schedule(new MyTask2(), 3000,2000);
		
	}
}
//做一个任务
//在同一个包下，一个类名只能定义一次
class MyTask2 extends TimerTask{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("爆炸了");

		
		
	}
}
