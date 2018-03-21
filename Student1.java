/*
ststic 的特点（可以修饰成员变量，成员方法）
			A：随着类的加载而加载（main方法为例，类加载的时候。main方法跟着加载）
			B:优先于对象存在（对象只有创建的时候才存在）
			C:被类的所有对象共享
					举例：同一个的班级的学生共同使用同一个班级编号
		由以上特点可以得知，什么时候使用静态？
				如果某个成员变量或者方法。是被所有对象共享的，那么它就应该定义为静态
						举例：
								饮水机（适合用静态修饰）
								水杯（不能用静态修饰）
			D:可以通过类名调用
					其实，他本身也可以通过对象调用					
*/
class StudentDemo{
	//非静态变量
	int num =10;
	//静态变量
	static int num2=89;


}
class Student1{
	//main方法是静态的是因为。他是被虚拟机调用，虚拟机调用他的时候不用创建对象。类名.main

	public static void main(String[] args){
		StudentDemo s=new StudentDemo();
		//通过对象电泳
		System.out.println(s.num);
		//通过类名调用
		System.out.println(StudentDemo.num2);
		//通过对象低昂
		System.out.println(s.num2);

	}
}
