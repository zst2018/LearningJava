package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午8:03:16 
* 类说明 
*/
public class SetThread implements Runnable {
	
	private Student s ;
	public SetThread(){}
	public SetThread(Student s){
		this.s = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Student s = new Student();
		
		s.name="林青霞";
		s.age = 23;
		
	}

}









