/*
乒乓球运动员  篮球远动员
乒乓球教练   篮球教练
跟乒乓球相关的人都需要学习英语

分析：
乒乓球运动员（具体类）  篮球运动员（具体类）    乒乓球教练 （具体类）   篮球教练（具体类）
			
			运动员	（抽象类）								教练（抽象类）
				[学习（）]										[教（）；]
								

										接口（学习英语）
										[口语]

								人（抽象类）
				[姓名  年龄  吃饭（）；睡觉（）{}]



*/
//定义接口
interface English{
	//抽象方法
	public abstract void english();
}
//定义人的抽象类
abstract class Person{
	private String name;
	private int age;
	//无参构造
	public Person(){}
	//带参构造
	public Person(String name,int age){
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
	//定义抽象方法
	public abstract void eat();
	//定义睡方法
	public  void sleep(){}
}
//定义抽象方法
abstract class Sportman extends Person{
	public Sportman(){}
	public Sportman(String name,int age){
		super(name,age);
	}
	//定义学习的抽象方法
	public abstract void learn();
}
//定义教练的抽象类
abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	//定义教的抽象方法
	public abstract void teach();
}
//定义具体类 paddler 继承运动员类的同时  实现接口
class Paddler extends Sportman implements English{
	public Paddler(){}
	public Paddler(String name,int age){
		super(name,age);
	}
	//实现 English 方法
	public void english(){
		System.out.println("运动员学习英语");
	}
	//实现 learn 方法
	public void learn(){
		System.out.println("打乒乓球");
	}
	//实现eat 方法
	public void eat(){
		System.out.println("吃肉");
	}
	//重写 sleep 方法
	public void sleep(){
		System.out.println("早睡早起");
	}
}

//乒乓球教练  具体类 继承教练类的同时  实现  接口
class TennisCoach extends Coach implements English{
	public TennisCoach(){}
	public TennisCoach(String name,int age){
		super(name,age);
	}
	public void english(){
		System.out.println("教练学习英语");
	}
	public void teach(){
		System.out.println("教乒乓球");
	}
	public void eat(){
		System.out.println("吃素");
	}
	public void sleep(){
		System.out.println("早睡早起");
	}

}

// 篮球运动员具体类 继承自运动员
class Hoopman extends Sportman{
	public Hoopman(){}
	public Hoopman(String name,int age){
		super(name,age);
	}
	public void learn(){
		System.out.println("学栏球");
	}
	public void eat(){
		System.out.println("吃肉");
	}
	public void sleep(){
		System.out.println("早睡早起");
	}


}
//篮球 教练 具体类  继承自教练类
class BaCoach extends Coach{
	public BaCoach(){}
	public BaCoach(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("教栏球");
	}
	public void eat(){
		System.out.println("吃素");
	}
	public void sleep(){
		System.out.println("早睡早起");
	}


}
class InterfaceTest3{
	public static void main(String[] args){
		Paddler p=new Paddler();
		p.setAge(23);
		p.setName("张文");
		System.out.println(p.getAge()+"   "+p.getName());
		p.eat();
		p.sleep();
		p.learn();
		p.english();
		System.out.println();

		TennisCoach t=new TennisCoach();
		t.setName("黎明");
		t.setAge(34);
		System.out.println(t.getAge()+"   "+t.getName());
		t.eat();
		t.sleep();
		t.teach();
		t.english();
		System.out.println();


		Hoopman h=new Hoopman("王刚",23);
	
		System.out.println(h.getAge()+"   "+h.getName());
		h.eat();
		h.sleep();
		h.learn();
		//t.english();
		System.out.println();

		BaCoach  b=new BaCoach ("王刚",23);
	
		System.out.println(b.getAge()+"   "+b.getName());
		b.eat();
		b.sleep();
		b.teach();
		//t.english();
		


	}
}

