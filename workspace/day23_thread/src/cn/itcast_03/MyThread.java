package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月12日 下午12:44:30 
* 类说明 
*/
public class MyThread extends Thread {
	public MyThread(){
		super();
	}
	public MyThread(String name){
		//this.name = name;
		super(name);
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int x = 0 ;x<500;x++){
			System.out.println(getName()+"----"+x);
		}
	}

}
