/*
猫狗案例 
具体事物：猫  狗
共性： 姓名  年龄  吃饭

分析：
从具体到抽象
猫：
成员变量：姓名 年龄
构造方法：带参  无参
成员方法： 吃饭（猫吃鱼）
狗：
成员变量：姓名 年龄
构造方法：带参 无参
成员方法： 吃饭（狗吃骨头）

因为有共性的内容，所以就提取了一个父类，动物
但是由于吃的内容不同。所以吃的方法是抽象的
而方法是抽象的类，必须定义为抽象类

实现：
从抽象到具体
动物类
成员变量：姓名 年龄
构造方法：带参  无参
成员方法： 吃饭
猫类
继承自动物类
重写吃的方法
狗类
继承自都动物类
重写吃的方法




*/
abstract class Animal{
	private int age;
	private String name;
	public Animal(){};
	public Animal(int age,String name){
		this.age=age;
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	//定义抽象的吃的方法
	public abstract void eat();
}
class Cat extends Animal{
	public Cat(){}
	public Cat(int age,String name){
		//
		super(age,name);
	}
	public void eat(){
		System.out.println("猫吃鱼")
	}

	
}
class Dog extends Animal{
	public Dog(){}
	public Dog(int age,String name){
		super(age,name);
	}
	public void eat(){
		System.out.println("狗吃骨头");
	}
	
}
class AbstractTest1{
	public static void main(String[] args){
		//方式1
		Dog d1=new Dog();
		d1.setAge(1);
		d1.setName("大白");
		System.out.println(getName()+"   "+getAge());
		d1.eat();

		//方式2
		Dog d2=new Dog(2,"大白");
		System.out.println(getName()+"   "+getAge());
		d2.eat();
		//方式3
		Animal a=new Dog();
		a.setName("大白");
		a.setAge(2);
		System.out.println(getName()+"   "+getAge());
		a.eat();


		//猫的方式1
		Cat c1=new Cat();
		c1.setAge(1);
		c1.setName("大白");
		System.out.println(getName()+"   "+getAge());
		c1.eat();

		//方式2
		

		Cat c2=new Cat(2,"大白");
		System.out.println(getName()+"   "+getAge());
		c2.eat();
		//方式3
		Animal a1=new Cat();
		a1.setName("大白");
		a1.setAge(2);
		System.out.println(getName()+"   "+getAge());
		a1.eat();




	}
	
}
