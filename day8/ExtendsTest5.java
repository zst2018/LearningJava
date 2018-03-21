/*
学生案例与教师案例

	学生：
		成员变量  姓名  年两
		构造方法  无参  带参
		成员方法  getXxx() setXxx()
	老师
		成员方法 姓名  年两
		构造方法 无参  带参
		成员方法 getXxx()  setXxx()

	通过观察上面两个类的成员，发现了很多相同的东西，所以我们就考虑抽取了一个共性的类。
	人：
		成员变量  姓名  年两
		构造方法  无参  带参
		成员方法  getXxx() setXxx()
	学生 继承 人
	老师 继承 人



*/
class Person{
	private int age;
	private String name;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
class Student extends Person{
	public Student (){}
	public Student(String name,int age){
		//this.name=name;
		//this.age=age;
		/*
		ExtendsTest5.java:48: 错误: name可以在Person中访问private
                this.name=name;
                    ^
ExtendsTest5.java:49: 错误: age可以在Person中访问private
                this.age=age;
                    ^

		*/
                    /*
        super.name=name;
        super.age=age;
        ExtendsTest5.java:59: 错误: name可以在Person中访问private
        super.name=name;
             ^
ExtendsTest5.java:60: 错误: age可以在Person中访问private
        super.age=age;
             ^


        */
             super(name,age);
	}

}
class Teacher extends Person{
	public Teacher(){}
	public Teacher(String name,int age){
		super(name,age);
	}

}
class ExtendsTest5{
	public static void main(String[] args){
		
		//系统默认给出无参构造方法
		Student s=new Student();
		s.setName("xinging");
		s.setAge(18);
		System.out.println(s.getAge()+"***"+s.getName());

		// 带参构造方法。不能默认继承
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


/*
	18***xinging
0***null

38***huangli
0***null
*/