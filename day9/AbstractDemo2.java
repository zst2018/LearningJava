/*
抽象类的成员特点
成员变量

	成员变量即可以是变量也可以是常量
构造方法
	有  作用是用于子类访问父类的初始化

成员方法
即可以是抽象的，也可以是非抽象的

抽象类的成员方法特性：
A:抽象方法  强制要求子类做的事情
B：非抽象方法  子类继承的事情，提高代码的复用性


*/
abstract class Animal{
	public int num=10;
	public final int num2=20;

	public Animal(){}

	public Animal(String name ,int age){}

	public abstract void show();

	public void method(){
		System.out.println("method dog");
	}

}
class Dog extends Animal{
	public void show(){
		System.out.println("show dog");
	}
	


}
class AbstractDemo2{
	public static void main(String[] args){
		//创建对象
		Animal a=new Dog();
		a.num=100;
		System.out.println(a.num);//多态的成员变量 编译看左边，运行看左边
		//a.num2=89;// 无法为最终变量num2分配值
		System.out.println(a.num2);
		
		a.show();
		a.method();




	}
}
