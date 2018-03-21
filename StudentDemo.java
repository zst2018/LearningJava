/*
在一届java文件中写两个类，一个基本的类，一个测试类
注意：   文件名和测试类的名相同
如何使用？
		创建对象使用
如何创建对象？
	格式：类名  对象名=new 类名（）;
如何使用成员变量？
      对象名.变量名;
如何使用成员方法？
		对象名.方法名（......）

*/



//基本类

class Student{
 //定义变量
 //姓名
 String name;  //null
 //年龄
 int  age;    //0
 //地址
 String address;   //null

 //定义方法
 //学习的方法
 public void study(){
 	System.out.println("学生爱学习！");

 }

 //吃饭的方法
 public void eat(){
 System.out.println("学习饿了，要吃哒");
 }

 //睡觉的方法
 public void sleep(){
 System.out.println("学习累了。要睡觉");

 }
  }


  //测试类
  class StudentDemo{
  	public static void main(String[] args){
  		//类名  对象名=new 类名  

  		
  		Student s=new Student();
  			//输出成员变量值
  		System.out.println(s.name);
  		System.out.println(s.age);
  		System.out.println(s.address);
			//改进写法
  		System.out.println(s.name+"______"+s.age+"______"+s.address);


  		//给成员变量赋值
  		s.name="小星星";
  		s.age=18;
  		s.address="湖北黄冈";
  		System.out.println(s.name+"    "+s.age+"   "+s.address);

			//调用方法
  			s.study();

  			s.eat();
  			s.sleep();

  	}

  }
