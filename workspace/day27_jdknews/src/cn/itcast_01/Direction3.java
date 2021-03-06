package cn.itcast_01;
/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月21日 下午12:24:25 
* 类说明 
* 加入抽象方法的枚举类
* 
*/
public abstract class Direction3 {
	//创建几个实例
			public static final Direction3 FRONT = new Direction3("前"){
				@Override
				public void show() {
					// TODO Auto-generated method stub
					System.out.println("前");
				}
			};//此处不再是当前类的实例，而是其子类对象，此处将子类对象赋给父类
			public static final Direction3 Behind = new Direction3("后"){
				@Override
				public void show() {
					// TODO Auto-generated method stub
					System.out.println("后");
				}
			};
			public static final Direction3 Right= new Direction3("左"){
				@Override
				public void show() {
					// TODO Auto-generated method stub
					System.out.println("左");
				}
			};
			public static final Direction3 Left = new Direction3("右"){
				@Override
				public void show() {
					// TODO Auto-generated method stub
					System.out.println("右");
				}
				
			};
			
			//构造私有，其他类（反射除外）就不能无限创建对象了
			
			//private Direction2(){}
			
			//加入成员变量,并去掉无参构造
			private String name;
			
			private Direction3(String name){
				this.name = name;
			}
			public String getName(){
				return name;
			}
			
			//加入抽象方法
			public abstract void show();
			

}
