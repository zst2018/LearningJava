/*
匿名对象：没有名字的对象
匿名对象的应用场景：
		A:调用方法，仅仅只调用一次的时候
			注意：调用多次的时候不适合，这种匿名对象调用方法的好处是：
										匿名对象调用完毕就是垃圾，可以被垃圾回收器回收，提高了内存的使用效率
		B：匿名对象可以作为实际参数传递




*/
class Student{
	public void show(){
		System.out.println("我想扑倒大猩猩");
	}
}
class StudentDemo{
	public void method(Student s){
		s.show();
	}
}
class NoNameDemo{ 

	public static void main(String[] args){
		//带名字的调用
		Student s=new Student();
		s.show();
		s.show();//同一个对象调用一个方法两次


		System.out.println("~~~~~~~~~~~~~~~~`");
		//匿名对象

		//new Student();    [这仅仅是一个方法，并没有其他像调用方法之类的运算]
		//匿名对象调用方法
		new Student().show();
		new Student().show();//不同的对象，这表示又重新new 了一个对象，调用同一个方法，
		//所以匿名对象适合调用一个方法仅仅一次的时候使用
		System.out.println("~~~~~~~~~~~~~~~~`");


		//匿名对象作为实际参数传递
		StudentDemo sd=new StudentDemo();
		/*
		Student ss=new Student();   
		sd.method(ss);//这里的ss 是一个实际参数
		*/
		//匿名对象
		sd.method(new Student());
		//
		System.out.println("*********88");
		new StudentDemo().method(new Student());




	}
}