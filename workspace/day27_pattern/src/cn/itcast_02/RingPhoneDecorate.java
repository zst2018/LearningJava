package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午8:04:31 
* 类说明 
*/
public class RingPhoneDecorate extends PhoneDecorate {

	public RingPhoneDecorate(Phone p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	@Override  
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("手机可以听彩铃");
		super.call();
	}

}
