package cn.itcast_06;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午8:04:27 
* 类说明 
*/
public class Student {
	private String name;
	private int age;
	
	private boolean flag ;//默认是没有数据，如果是true就表示有数据
	
	public synchronized void set(String name ,int age){
		
		//如果有数据就等待
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//设置数据
		this.name = name;
		this.age = age;
		
		//修改标记
		this.flag = true ;
		
		//唤醒线程
		this .notify();
	}
	
	public synchronized void get(){
		//如果没有数据就等待
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//获取数据
		System.out.println(this.name+"  "+this.age);
		
		//修改标识
		this.flag = false;
		//唤醒线程
		this.notify();
	}

	
}
