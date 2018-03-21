/*
fianl 关键字 
权限修饰符修饰局部变量并没有什么实际意义，因为局部变量在方法内是被封装好的

但是，final 关键字可以修饰局部变量
面试题：
	final修饰局部变量的问题
		final 可以修饰局部变量，

		A:基本数据类型的变量   基本类型的值不能发生改变

		B:引用数据类型的变量   引用类型的地址值不能发生改变，但是。该对象的堆内存的值是可以改变的





*/
class Student{
	int age =19;
}

class FinalDemo2{
	public static void main(String[] args){
		//局部变量是基本数据类型
		int x=10;
		x=100;
		System.out.println(x);
		final int y=28;
		//错误: 无法为最终变量y分配值
		//y=89;
		System.out.println(y);

		//局部变量是引用数据类型
		Student s=new Student();
		System.out.println(s.age);
		s.age=189;
		System.out.println(s.age);

		final Student ss=new Student();
		//ss 在栈内存的地址值不变
		System.out.println(ss.age);//  19

		ss.age=234;
		System.out.println(ss.age);

		ss=new Student() ;//重新分配内存空间 
	/*
	 错误: 无法为最终变量ss分配值
	 ss=new Student() ;//重新分配内存空间
	*/
	}

}

 


