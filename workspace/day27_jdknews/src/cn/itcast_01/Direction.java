package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午12:08:29 
* 类说明 
* 加入构造方法的枚举类
*/
public class Direction {
	//创建几个实例
	public static final Direction FRONT = new Direction();
	public static final Direction Behind = new Direction();
	public static final Direction Right= new Direction();
	public static final Direction Left = new Direction();
	
	
	
	
	//构造私有，其他类（反射除外）就不能无限创建对象了
	
	private Direction(){
		
	}

}
