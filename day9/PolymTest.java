/*
类型一致的问题：


*/

class Animal{
	public void eat(){
	System.out.println("eat animal");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("eat Cat");
	}
	public void palyGame(){
		System.out.println("playGame Cat");
    }

}

class Dog extends Animal{
	public void eat(){
		System.out.println("eat Dog");
	}
	public void lookDoor(){
		System.out.println("lookDoor Dog");
	}
}

class PolymTest{
	public static void main(String[] args){

		//向上转型  在堆内存指向狗
		Animal a=new Dog();
		a.eat();

		//a.lookDoor();
		System.out.println();

		//向下转型  指向狗
		Dog d=(Dog) a;
		d.eat();
		d.lookDoor();
		System.out.println();

		//将 父类的 变量 a  指向新的对象  new Cat()
		//在堆内存中指向猫
		a = new Cat();
		a.eat();
 

		//a.playGame();
		System.out.println();

		//向下转型  变量 c 指向 堆内存的猫
		Cat c=(Cat) a;
		c.eat();
		c.palyGame();

		//向下转型  变量dd 指向 堆内存的猫
		Dog dd=(Dog) a; //Exception in thread "main" java.lang.ClassCastException:
		                //Cat cannot be cast to Dog

		//Dog dd2 =new Animal();//0: 错误: 不兼容的类型: Animal无法转换为Dog
		//Dog dd3=new Cat();//不兼容的类型: Cat无法转换为Dog
	}
}