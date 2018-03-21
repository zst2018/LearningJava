/*
匿名内部类
就是内部类的简化写法
前提：存在一个类或者接口
这里的二类可以是具体类也可以是接口
格式：
new 类名或者接口名（）{
	重写方法；
}
本质：new 是在内存中分配内存，其本质不是类而是一个对象，
该类或者该抽象类的子类或者该接口的实现类的对象。因为只有子类才会去重写方法，而且该


是一个继承了该类或者实现了该接口的子类匿名对象
*/
interface Inter{
	public abstract void show();
	public abstract void show2();
}
class Outer{
	public void method(){
		/*
		//一个方法的时候
		new Inter(){
			public void show(){
				System.out.println("show"); 

			}//这个本质代表的是对象，是对象就可以掉用方法
		}.show();*/
		/*
		//两个方法的时候
		//一个匿名对象只能调用一个方法
		new Inter(){
			public void show(){
				System.out.println("show");

			}
			public void show2(){
				System.out.println("show2");

			}
		}.show();

		new Inter(){
			public void show(){
				System.out.println("show");

			}
			public void show2(){
				System.out.println("show2");

			}
		}.show2();
		*/
		//如果有很多个方法，就会比较麻烦
		//上面的匿名对象，实际上是一个子类对象，可以用多态
		Inter i=new Inter(){//用多态
			public void show(){
				System.out.println("show");

			}
			public void show2(){
				System.out.println("show2");

			}
		};
		//通过多态创建的引用对象，调用实现类（匿名类）的方法
		i.show();
		i.show2();

	}
}
class InnerDemo6{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();

	}
}
