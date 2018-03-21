package cn.itcast_04;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午7:58:13 
* 类说明 
*/
public interface Inter {
	public abstract void show();
	
	public default void defaultPrint(){
		System.out.println("defaultPrint");
	}
	
	public static void staticPrint(){
		System.out.println("staticPrint");
	}

}
