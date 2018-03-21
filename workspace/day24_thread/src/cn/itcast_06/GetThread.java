package cn.itcast_06;
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
		while(true){
			
				s.get();
				
		
			
			
			
		}
		
		
	}

}
