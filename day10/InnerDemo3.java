/*
成员内部类

如何直接访问成员内部类的成员
外部类名.内部类名 对象名=外部类对象.内部类对象


*/
class Outer{
	private int num = 10;
	class Inner{
		public void show(){
			System.out.println("show");
		}
	}
}
class InnerDemo3{
	public static void main(String[] args){
		//需求 ： 我要访问Inner 类的show() 方法
		//Inner i=new Inner();
		//i.show ();
		Outer.Inner oi=new Outer().new Inner();
		oi.show();
	}
}