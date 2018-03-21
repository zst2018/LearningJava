package cn.itcast_03;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午8:08:33 
* 类说明 
*/
public class GetThread implements Runnable {

	
	private Student s;
	public GetThread(){}
	public GetThread(Student s){
		this.s = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Student s = new Student();
		System.out.println(s.name +"---"+s.age);
		
	}

}
