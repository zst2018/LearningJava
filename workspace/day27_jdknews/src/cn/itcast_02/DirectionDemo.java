package cn.itcast_02;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午12:47:12 
* 类说明 
*/
public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.Front;
		System.out.println(d);//Front
		//在enum中重写了toString 方法
		//public String toString();返回枚举常量的名称，它包含在声明中
		System.out.println("-----------");
		
		Direction2 d2 = Direction2.Front;
		System.out.println(d2);
		System.out.println(d2.getName());
		
		Direction3 d3 = Direction3.Front;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		
		System.out.println("-------");
		
		Direction3 dd = Direction3.Front;
		switch(dd){
		case Front:
			System.out.println("你选择了前");
			break;
		case Behind:
			System.out.println("你选择了后");
			break;
		case Left:
			System.out.println("你选择了左");
			break;
		case Right:
			System.out.println("你选择了右");
			break;
		//}
		}
		
	}

}
