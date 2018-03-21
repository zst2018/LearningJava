/*
多态的好处：
	1.提高了代码的维护性（继承）
	2.提高了代码的扩展性（ 由多态保障   ）

猫狗案例
*/
//import java.util.Scanner;
class Animal{
	public  void eat(){
		System.out.println("eat");
	}
	public  void sleep(){
		System.out.println("sleep");
	}
	
}
class Cat extends Animal{
	public void eat(){
		System.out.println("猫爱吃鱼");
	}
	public void sleep(){
		System.out.println("猫白天睡觉");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("狗爱吃骨头");
	}
	public void sleep(){
		System.out.println("狗晚上睡觉");
	}
	
}

class Pig extends Animal{
	public void eat(){
		System.out.println("猪爱吃大米");
	}
	public void sleep(){
		System.out.println("猪总是睡觉");
	}
	

}
//针对动物操作的工具类
class AnimalTool{
	/*
	private AnimalTool(){};
	//调用猫的功能
	//参数列表是  类修饰的对象
	public static void useCat(Cat c){
		c.eat();
		c.sleep();
	}
	//调用狗的功能
	//参数列表是 类修饰的对象
	public static void useDog(Dog d){
		d.eat();
		d.sleep();
	}
	//调用猪的功能
	public static void usePig(Pig p){
		p.eat();
		p.sleep();
	}
	*/

	//
	public static void useAnimal(Animal a){
		a.eat();
		a.sleep();
	}



}
class PloymDemo2{
	public static void main(String[] args){
		/*
		Cat c=new Cat();
		c.eat();
		c.sleep();
		System.out.println();

		Cat c1=new Cat();
		c1.eat();
		c1.sleep();
		System.out.println();

		Cat c2=new Cat();
		c2.eat();
		c2.sleep();
		System.out.println();

		Cat c3=new Cat();
		c3.eat();
		c3.eat();
		System.out.println();
		//问题是：如果有好多猫，每次都要创建对象本身是可以的，
		//但是，通过观察发现调用的方法很相似，只是对象名不同

	*/
		Cat c=new Cat();
		Cat c1=new Cat();
		Dog d=new Dog();
		Dog d1=new Dog();

		Pig p=new Pig();
		Pig p1=new Pig();
		
		AnimalTool.useAnimal(c);
		AnimalTool.useAnimal(c1);
		System.out.println();
		


		/*

		Animal a=new Cat();
		Animal a1=new Dog();
		a.eat();
		a.sleep();
		System.out.println();
		a1.eat();
		a1.sleep();

		*/


		/*
		AnimalTool.useCat(c);
		AnimalTool.useCat(c1);
		System.out.println();

		AnimalTool.useDog(d);
		AnimalTool.useDog(d1);
		System.out.println();
		//宠物猪
		//定义一个一个猪类，继承自动物类
		AnimalTool.usePig(p);
		AnimalTool.usePig(p1);
		*/

		//宠物狼，老虎。。
		//定义对应的类，继承自动物，提供对应的方法重写，并在工具类添加方法调用
		//前面几个必须写，但是不妥的是，工具类每次都要改，
		//改用另外一种解决



		/*
		//改进方法
		//缺点，测试类最好只放与对象相关的东西
		Scanner s=new Scanner(System.in);
		System.out.println("请输入猫的数量：");
		int number=s.nextInt();
		//function(number);



		//改进方法2
		useCat(c);
		useCat(c1);
		useCat(c2);
		useCat(c3);
 

		*/
	}
	/*
	public static void function(int number){
			
			for(int i=1;i<=number;i++){
				Cat c=new Cat();
				c.eat();
				c.sleep();
				System.out.println();
			}

		}
		*/
		/*
		//调用猫的功能
	public static void useCat(Cat c){
		c.eat();
		c.sleep();
	}
	//调用狗的功能
	public static void useDog(Dog d){
		d.eat();
		d.sleep();
	}
*/
}