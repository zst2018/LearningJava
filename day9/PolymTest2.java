/*
多态的成员访问特点
方法：编译看左边，运行看右边
继承的时候
子类和父类中相同的方法叫重写
子类中没有父类中出现过的方法就被继承过来了

*/
class A{
	public void show(){
		show2();
	}
	public void show2(){
		System.out.println("我");
	}

}
class B extends A {
	/*继承 A 
	public void show(){
		show2();
	}

	*/

	public void show2(){
		System.out.println("爱");
	}

}
class C extends B{
	public void show(){
		super.show();
	}
	public void show2(){
		System.out.println("你");
	}

}
class PolymTest2{
	public static void main(String[] args){
		A a=new B();
		a.show();//爱 

		B b=new C();
		b.show();//你
	}

}