package cn.itcast_10;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月15日 下午4:30:51 
* 类说明 
*匿名内部类的格式
*	new 类名或者接口名（）{
*
*	};
*	其本质是：是该类或者接口的子类对象
*
*/
public class ThreadDemo {
	public static void main(String[] args) {
		//继承thread 类来实现多线程
		new Thread(){
			public void run() {
				for(int x = 0 ; x<100 ;x++){
					System.out.println(Thread.currentThread().getName()+"---"+x);
				}
			};
		}.start();
		//实现Runnable 接口来实现多线程
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int x = 1; x<100 ;x++){
					System.out.println(Thread.currentThread().getName()+"---"+x);
				}
			}
		}){}.start();
		
		//高能度
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int x = 1; x<100 ;x++){
					System.out.println("hello"+"---"+x);
				}
			}
		}){
			public void run() {
				// TODO Auto-generated method stub
				for(int x = 1; x<100 ;x++){
					System.out.println("world"+"---"+x);
				}
			}
		}.start();
		//程序走world
		
	}

}











