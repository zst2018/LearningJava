//使用继承前
/*
class Student{
	public void eat(){
		System.out.println("chifan");
	}
	public void sleep(){
		System.out.println("shuijue");
	}
}

class Teacher{
	public void eat(){
		System.out.println("chifan");

	}
	public void sleep(){
		System.out.println("shuijue");
	}
}
*/
//使用继承后
class Person{
	public void eat(){
		System.out.println("chifan");

	}
	public void sleep(){
		System.out.println("shuijue");
	}
}
class Student extends  Person{};
class Teacher extends  Person{};

class ExtendsDemo{
	public static void main(String[] args){
		Student s=new Student();
		s.eat();
		s.sleep();

		System.out.println("****************");
		Teacher t=new Teacher();
		t.eat();
		t.sleep();
	}
}