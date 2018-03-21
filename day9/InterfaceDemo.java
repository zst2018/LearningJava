/*
接口的特点：
	A:接口关键字 interface 表示
	格式：interface 接口名{}
	B 类实现接口用 implements表示
	class 类名 implements 接口名{}
	C :接口是抽象的，不能实例化
	那么接口如何实例化呢？
	按照多态的方式来实例化
	D：接口的子类
	A :可以是抽象类，但是意义大，因为抽象类还需要子类
	B ：可以是具体类，但是 要将接口中的所有抽象方法重写



	由此可见
	A：具体类多态（几乎没有）
	B：抽象类多态（常用）
	C：接口多态（最常用）

*/
//定义动物培训接口
	interface AnimalTrain{
		public abstract void jump();
	}
//class Dog implements AnimalTrain{}//错误: Dog不是抽象的, 并且未覆盖AnimalTrain中的抽象方法jum
	//抽象类实现接口
abstract class Dog implements AnimalTrain{}
//具体类实现接口 
class Cat implements AnimalTrain{
	public void jump(){
		System.out.println("猫可以调高");
	}
}

class InterfaceDemo{
	public static void main(String[] args){
		//AnimalTrain a=new AnimalTrain();// 错误: AnimalTrain是抽象的; 无法实例化
		//a.jump();
		AnimalTrain a=new Cat();
		a.jump();//猫可以调高

	}
}