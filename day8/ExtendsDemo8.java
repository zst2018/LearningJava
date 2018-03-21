/*
继承中的成员方法的关系：
	A:子类中的方法和父类中的方法声明不一样
	B 子类中的方法和父类中的方法声明一样
		通过子类调用方法
			A 先看子类中有没有这个方法，有就使用
			B 再看父类中有没有这个方法，（父类的父类暂时不考虑）。有就使用，没有就报错




*/
class Father{
	public void show(){
		System.out.println("show Father");
	}
	public void method(){
		System.out.println("method Father");
	}

}
class Son extends Father{
	public void method(){
		System.out.println("method Son");
	}

}
class ExtendsDemo8{
	public static void main(String[] args){
		Son s=new Son();
		s.show();
		s.method();//method son
		//s.show1();

	}
}