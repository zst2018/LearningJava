/*

abstract 

*/
abstract class Animal{
	//抽象犯法
	public Animal(){}
	//public abstract void eat(){}//空方法体，抽象方法不能有方法体

	public abstract void eat();

}
//子类是抽象类
abstract class Dog extends Animal{

}

//class Pig extends Animal{}// Pig不是抽象的, 并且未覆盖Animal中的抽象方法eat()


//子类重写父类所有的抽象方法，这个时候子类是一个具体的类
class Pig extends Animal{
	public void eat(){
		System.out.println("猪吃大米吗？");

	}
}
abstract class Cat extends Animal{

}
class AbstractDemo{
	public static void main(String[] args){
		//创建对象
	//	Animal a=new Animal();// 错误: Animal是抽象的; 无法实例化
		Animal a=new Pig();
		a.eat();
	}
}