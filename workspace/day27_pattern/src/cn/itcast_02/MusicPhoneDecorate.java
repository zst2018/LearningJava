package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午8:27:39 
* 类说明 
*/
public class MusicPhoneDecorate extends PhoneDecorate {

	public MusicPhoneDecorate(Phone p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("手机可以听音乐");
	}

}
