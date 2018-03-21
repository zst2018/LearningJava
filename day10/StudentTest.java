/*
形式参数
	基本数据类型
	引用类型（类，抽象类，接口）
	类：需要的是类的对象
	抽象类：
*/


class Student{
	public void study(){
		System.out.println("好好学习，天天向上");
	}
}

class StudentDemo{
	public void method(Student s){//  ss     ss=new  student();    相当于 Student s=new Student();


		//这里的形参其实要的是该类的对象
		s.study();
	}
}
class StudentTest{
	public static void main(String[] args){
		//测试 Student 的方法
		Student s=new Student();
		s.study();
		System.out.println();
		//需求2  测试 StudentDemo类中的方法
		StudentDemo sd=new StudentDemo();
		//创建一Student 类的对象  ss 
		Student ss=new Student();
		//将ss 传递给 
		sd.method(ss);

		//匿名对象
		new StudentDemo().method(new Student());

	}
}