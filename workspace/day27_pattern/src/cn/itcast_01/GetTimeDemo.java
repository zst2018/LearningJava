package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月20日 下午4:08:29 
* 类说明 
*/
public class GetTimeDemo {
	public static void main(String[] args) {
//		GetTime gt = new GetTime();
//		System.out.println(gt.getTime()+"毫秒");
		GetTime gt = new ForDemo();//多态
		System.out.println(gt.getTime()+"毫秒");
		
		GetTime gt2 = new IODemo();//多态
		System.out.println(gt2.getTime()+"毫秒");
	}

}
