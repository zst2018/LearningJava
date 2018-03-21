/*

老师和学生案例   加入抽闲的额外功能
人类：
姓名 年龄
吃饭（）；
睡觉（）；
老师类：
姓名 年龄
吃饭（）
睡觉（）
学生类
姓名 年龄
吃饭（）
睡觉（）
接口
	抽烟
部分老师：抽香烟
部分学生：抽烟



*/ 
interface Smoking{
	public abstract void smoking();
}
abstract class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name ,int age){
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
	public abstract void eat();
	public abstract void sleep();
}
class Teacher extends Person{
	public Teacher(){}
	public Teacher(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("老师吃素");
	}
	public void sleep(){
		System.out.println("午休");
	}
} 
class Student extends Person{
	public Student(){}
	public Student(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("学生吃肉");
	}
	public void sleep(){
		System.out.println("不午休");
	}
} 
class TeacherImpl extends Teacher implements Smoking{
	public void smoking(){
		System.out.println("老师抽烟");
	}
}
class StudentImpl extends Student implements Smoking{
	public void smoking(){
		System.out.println("学生抽烟");
	}

}
class InterfaceTest2{
	public static void main(String[] args){
		TeacherImpl ti=new TeacherImpl();
		ti.setAge(12);
		ti.setName("溜达");
		System.out.println(ti.getName()+"   "+ti.getAge());
		ti.eat();
		ti.sleep();
		ti.smoking();

		StudentImpl si=new StudentImpl();
		si.setAge(32);
		si.setName("溜达");
		System.out.println(si.getName()+"   "+si.getAge());
		si.eat();
		si.sleep();
		si.smoking();
	}
}


