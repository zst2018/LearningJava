/*
学生案例与教师案例
	传统方法
	学生：
		成员变量  姓名  年两
		构造方法  无参  带参
		成员方法  getXxx() setXxx()
	老师
		成员方法 姓名  年两
		构造方法 无参  带参
		成员方法 getXxx()  setXxx()

*/
class Student{
	private String name;
	private int age;
	public Student(){}
	public Student(String name,int age){
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

}
class Teacher{
	private String name;
	private int age;
	public Teacher(){}
	public Teacher(String name,int age){
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

}
class ExtendsTest4{
	public static void main(String[] args){
		Student s=new Student();
		s.setName("xinging");
		s.setAge(18);
		System.out.println(s.getAge()+"***"+s.getName());

		Student s1=new Student("xingsing",17);
		System.out.println(s1.getAge()+"***"+s1.getName());

		System.out.println();

		Teacher t=new Teacher();
		t.setName("huangli");
		t.setAge(38);
		System.out.println(t.getAge()+"***"+t.getName());

		Teacher t1=new Teacher("huanghan",27);
		System.out.println(t1.getAge()+"***"+t1.getName());
	}
	
}