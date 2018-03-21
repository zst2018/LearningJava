/*
一个标准代码的最终版
	学生类
		成员变量
		name  age 
		构造方法
			无参   带两个参数
		成员方法
			getXxx()   setXxx()
			show()   输出该类的所有成员变量值

给成员变量赋值：
		setXxx()
		构造方法
输出成员变量
		getXxx()
		show () 方法
*/
class Student{
	private int age;
	private String name;
	public Student(){
		System.out.println("this is a method without Variable");

	}
	public Student(String name,int age){
		this.name =name;
		this.age =age;
	}
	//输出所有变量值
	public void show(){
		System.out.println(name+"    "+age); 
	}
	public String getName(){
		return name;

	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}

}
class StudentFinal{
	public static void main(String[] args){
		//方式1 给成员变量赋值
		//无参构造+setXxx()
		Student s1=new Student();
		System.out.println(s1);
		Student s2=new Student("niurtui",89);
		s1.show();
		//Student p=new Student();
		s1.setAge(90);
		//System.out.println(s1.getAge());
		s1.setName("jiuert");
		System.out.println(s1.getName()+"      "+s1.getAge()); 
	}
}