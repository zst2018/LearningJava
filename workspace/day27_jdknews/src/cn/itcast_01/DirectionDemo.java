package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午12:09:10 
* 类说明 
*/
public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d);
		//cn.itcast_01.Direction@15db9742
		
		
		
		
		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());//前
		
		
		
		
		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		//多态，编译看左边，运行看右边
		
		
	}
	
	
	
	
			

}
