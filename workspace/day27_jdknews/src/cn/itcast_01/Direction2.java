package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午12:14:50 
* 类说明 
* 加入成员变量的枚举类
*/
public class Direction2 {
	//创建几个实例
		public static final Direction2 FRONT = new Direction2("前");
		public static final Direction2 Behind = new Direction2("后");
		public static final Direction2 Right= new Direction2("左");
		public static final Direction2 Left = new Direction2("右");
		
		//构造私有，其他类（反射除外）就不能无限创建对象了
		
		//private Direction2(){}
		
		//加入成员变量,并去掉无参构造
		private String name;
		
		private Direction2(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
}
