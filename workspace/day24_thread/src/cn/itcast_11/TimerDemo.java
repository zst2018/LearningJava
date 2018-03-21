package cn.itcast_11;
import java.util.Timer;
import java.util.TimerTask;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午6:20:26 
* 类说明 
* 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情
* 依赖Timer 和TimerTask这两个类
* Timer：定时
* TimerTask：任务
* 
*/
public class TimerDemo {
	public static void main(String[] args){
		//创建定时器对象
		Timer t = new Timer();
		//3 秒后执行爆炸任务
		//t.schedule(new MyTask(), 3000);
		t.schedule(new MyTask(t), 3000);
		
	}
}
//做一个任务
class MyTask extends TimerTask{
	private Timer t ;
	public MyTask(){}
	public MyTask(Timer t){
		this.t=t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("爆炸了");
		t.cancel();
		
		
	}
}