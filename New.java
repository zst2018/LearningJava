/*
定义一个学生类
		成员变量：name age 
		成员方法：show() 方法
我们在使用这个案例的过程中，发现了一些问题
		通过对象去给成员变量赋值，可以赋值一些非法的数据。
正确的步骤如下：
		在赋值前，先对数据进行判断。
判断的位置在那里比较合适。
测试类，一般只创建对象，调用方法。
所以。对数据的判断你，应该定义在基本类中
	那么在成员变量的位置可以进行判断吗？（否）、因为做数据校验，一般需要逻辑语句实现
	逻辑语句是应该定义在方法中的，所以，我们最终决定在student 类中提供一个方法，来对数据进行校验

	在定义的方法中， 对数据进行校验，在测试类中需要通过对象调用方法
	但是，直接通过对象对成员变量进行赋值也是可编译的。
	所以需要实现，强制要求不能直接使用成员变量
			针对这一情况，java就提供了一个关键字   private


	这就是封装的思想
			封装：就是指隐藏对象的属性和实现细节，仅对外提供公共访问方式





*/
class Student{
	String name ;
	 private int age;// 定义成员变量时，前面加关键字private  这时 成员变量只能在本类中被直接赋值
	//写一个方法给的数据进行校验

	 public void setAge(int a){
	 	if(a<0||a>120){
	 		System.out.println("你给的年龄有问题");
	 	}else{
	 		age=a;
	 	}
	 }
	//show()方法  现实所有的成员变量值
	public void show(){
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);


	}
}
class New{
	public static void main(String[] args){
		//创建对象
		Student s=new Student();
		s.show();
		System.out.println("~~~~~~~~~~~~``");
		//给成员变量赋值
		s.name="小星星";
		//s.age=18;   [age 被关键字private 修饰，只能在其本类中被直接赋值，]
		s.show();
		System.out.println("~~~~~~~~~~~~``");
		//给 age 赋值
		//s.age=-89;//这个数据是不合理的
		s.show();
		System.out.println("~~~~~~~~~~~~``");
		s.setAge(-27);

	}
}