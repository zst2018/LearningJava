package cn.itcast_06;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月14日 下午8:03:16 
* 类说明 
*/
public class SetThread implements Runnable {
	
	private Student s ;
	private int x = 0 ;
	
	public SetThread(){}
	public SetThread(Student s){
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
				if(x%2==0){
					s.set("林青霞", 23);
//					s.name="林青霞";
//					s.age = 23;
				}else{
//					s.name="刘意";
//					s.age = 30;
					s.set("刘意",30);
				}
				x++;
				
			
		
			
		}
		
	
		
	}

}








