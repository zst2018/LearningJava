/*
猫狗案例 加入跳高的额外功能（位置）
分析：从具体到抽象
猫：
	姓名 年龄
	吃饭 睡觉
狗：
	姓名 年龄
	吃饭 睡觉
由于有共性功能，所以，我们抽取了一个类
动物
	姓名 年龄
	吃饭（）；
	睡觉（）{}
猫：继承自动物
狗：继承自动物

跳高的额外功能是一个新的扩展功能，定义一个接口
接口：
	跳高
部分猫：跳高
部分狗：跳高
实现：
从抽象到具体
使用：
具体类

*/
interface Jump{
	public abstract void jump();
}
abstract class Animal{
	private String name;
	private int age;
	public Animal(){}
	public Animal(String name ,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public abstract void eat();
	public abstract void sleep();

}
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void sleep(){
		System.out.println("猫白天睡");
	}
}
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("狗吃骨头");
	}
	public void sleep(){
		System.out.println("狗不睡觉");
	}
}
class CatImpl extends Cat implements Jump{
	public void jump(){
		System.out.println("猫跳高");
	}
}
class DogImpl extends Dog implements Jump{
	public void jump(){
		System.out.println("狗跳高");
	}

}
class InterfaceTest1{
	public static void main(String[] args){
		CatImpl ci=new CatImpl();
		ci.setName("hiet");
		ci.setAge(2);
		System.out.println(ci.getAge()+"   "+ci.getName());
		ci.eat();
		ci.sleep();
		ci.jump();
		System.out.println();

		DogImpl di=new DogImpl();
		di.setName("jirt");
		di.setAge(1);
		System.out.println(di.getAge()+"   "+di.getName());
		di.eat();
		di.sleep();
		di.jump();

	}
}




