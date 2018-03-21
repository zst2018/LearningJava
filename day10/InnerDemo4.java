/*
成员内部类的修饰符 (private )
案例： 我有一个人，（人有身体，身体内有心脏）
	class Body{
		 private class Heart{//加了private 后就不能被外界访问了
			public void operater(){
				System.out.println("心脏");
			}
		}
		public void method (){
		if (如果你是外科医生){
			Heart h=new Heart();
			h.operater();
		}
			
		}
	}


	按照内部类的讲解使用一下，
	Body.Heart bh=new Body().new Heart();
	bh.operater();
	// 

	Body b=new Body ;
	b.method();
修饰符 static 



*/
class Outer{
	private int num=20;
	private static int num2=89;
	//内部类可以用static 修饰是因为 内部类可以看做外部类的成员
	public  static class Inner{
		public void show(){
			//System.out.println(num);// 错误: 无法从静态上下文中引用非静态 变量 num
			System.out.println(num2);
		}
		//可以再用static 修饰 
		public static void show2(){
			//System.out.println(num);//错误: 无法从静态上下文中引用非静态 变量 num
			System.out.println(num2);
		}

	}
}
class InnerDemo4{
	public static void main(String[] args){
		/*
		//错误: 限定的新静态类
		Outer.Inner oi=new Outer().new Inner();
		oi.show();
		oi.show2();
		*/
		//成员内部类被静态修饰后的访问方式是：
		//格式 ：外部类名.内部类名 对象名=new 外部类名.内部类名（）；
		Outer.Inner oi=new Outer.Inner();
		oi.show();
		oi.show2();


		//另外一种调用方式

		//show2 是静态方法，可以通过内部类名调用，对外部类来说，静态修饰的内部类可以看成是外部类的成员，通过外部类名调用
		Outer.Inner.show2();
		

	}
}