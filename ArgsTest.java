/*



*/
//形式参数是基本类型的调用
class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}
//形式参数是引用类型
//如果你看到了一个方法的形式参数是一个类 类型（引用类型<数组接口类>），这里需要的是该类的对象
//因为对象是具体的东西，才
class Student{
	public void show(){
		System.out.println("我爱学习");
	}
}
class StudentDemo{
	public void method(Student s){//调用的时候把main 方法中  s 的地址传递到了这里Student s=new student（）；
		s.show();//


	}

}
class ArgsTest{
	public static void main(String[] args){
		//创建对象   类名  对象名=new  类名（）；
		Demo d=new Demo();
		//调用成员方法
		/*
		int a=10;
		int b=20;
		d.sum(a,b);

		*/
		//d.sum(10,20);[这样运行之后在控制台并看不到结果]
		int	result=d.sum(10,89);
		System.out.println(result);
		System.out.println("*******************");
		//形式参数是引用类型的调用
		//需求：要调用类  StudentDemo 中的method 的方法
		//首先创建对象
		StudentDemo Sd=new StudentDemo();
		//method中声明的参数是  一个student 类  中的对象s 
		//而类是一个事物属性和行为的集合，不能参与运算，类是一种抽象的概念
		//创建学生对象
		Student b=new Student();
		Sd.method(b);//相当于把s的地址给了这里 




	}
}