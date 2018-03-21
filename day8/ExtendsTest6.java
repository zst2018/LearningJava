/*
猫和狗的案例
	猫：
	成员变量  姓名 年龄 颜色
	构造方法  无参   带参
	成员方法
		getXxx()  setXxx()
		eat()
		playGame()
	狗
	成员变量  姓名 年龄 颜色
	构造方法  无参  带参
	成员方法
		getXxx()  setXxx()
		eat()
		lookDoor()
	共性
		成员变量
		构造方法
		成员方法
			getXxx()   setXxx()
	猫：
		无参构造方法  带参构造方法  
		playGame（）
	狗：
		无参构造方法  带参构造方法
		lookDoor（）


*/
// 父类
class Animal{
	//姓名
	private String name;
	//年龄
	private int age;
	//颜色
	private String color;
	// 无参构造方法
	public Animal(){}
	//带参构造方法  参数列表  name  color  age 
	public Animal(String name,String color,int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}

	//给 name赋值
	public void setName(String name){
		this.name=name;
	}
	//年纪 赋值
	public void setAge(int age){
		this.age=age;
	}
	//颜色 赋值
	public void setColor(String color){
		this.color=color;
	}
	//获取 姓名
	public String getName(){
		return name;
	}
	//获取 颜色
	public String getColor(){
		return color;
	}
	//获取 年龄
	public int getAge(){
		return age;
	}
	//吃 方法
	public void eat(){
		System.out.println("吃东西");
	}
}

// 猫 继承 动物类
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,String color,int age){、
		//获取 动物类的 参数值
		super(name,color,age);
	}

	public void playGame(){
		System.out.println("玩游戏");
	}

}

//狗 继承 动物类
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,String color,int age){
		//获取 动物类的 参数值
		super(name,color,age);
	}
	public void lookDoor(){
		System.out.println("看家");
	}

}

// 测试类
class ExtendsTest6{
	public static void main(String[] args){
		//方式1
		Cat c=new Cat();
		c.setName("xiaobai");
		c.setAge(1);
		c.setColor("white");
		System.out.println(c.getName()+"   "+c.getColor()+"    "+c.getAge());
		c.eat();
		c.playGame();

		System.out.println();

		// 方式2
		Cat c1=new Cat("xiaohei","black",1);
		System.out.println(c1.getName()+"   "+c1.getColor()+"    "+c1.getAge());
		c1.eat();
		c1.playGame();

		System.out.println();


		Dog d=new Dog();
		d.setName("dabai");
		d.setAge(1);
		d.setColor("white");
		System.out.println(d.getName()+"   "+d.getColor()+"    "+d.getAge());
		d.eat();
		d.lookDoor();

		System.out.println();


		Dog d1=new Dog("dahei","black",1);
		System.out.println(d1.getName()+"   "+d1.getColor()+"    "+d1.getAge());
		d1.eat();
		d1.lookDoor();

	}
}