/*
返回值类型
基本数据类型
引用类型
类	：如果一个方法的返回值类型是一个类名。实际上是返回的该类的对象
抽象类 ：
接口

*/
class Student{
	public void study(){
		System.out.println("好好学习");
	}
	
}
class StudentDemo{
	public Student getStudent(){
		//Student s=new Student();
		// Student ss=s;
		//
		//Student s=new Student();
		//return s;

		//匿名对象类
		return new Student();
	}
}
class StudentTest2{
	public static void main(String[] args){
		//需求：我要使用Student 类中的study() 方法
		//但是，要求是不要直接创建Student 的对象
		//创建StudentDemo的对象  
		StudentDemo sd=new StudentDemo();
		//将getStudent()返回对象赋值给Student类
		Student m=sd.getStudent();//new Student .相当于;Student  m=new Student ()
		m.study();

	
	}
}