package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 上午11:28:21 
* 类说明 
*/
public class DieLock extends Thread {
	private boolean flag;
	
	public DieLock(boolean flag){
		this.flag=flag;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		if(flag){
			synchronized(MyLock.obj1){
				System.out.println("if obj1");
				synchronized(MyLock.obj2){
					System.out.println("if obj2");
				}
			}
		}else{
			synchronized(MyLock.obj2){
				System.out.println("else obj2");
				synchronized(MyLock.obj1){
					System.out.println("else obj1");
				}
			}
			
		}
	}
}












