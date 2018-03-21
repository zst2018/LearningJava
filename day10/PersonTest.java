/*
形式参数
	基本数据类型
	引用类型（类，抽象类，接口）
	类：需要的是类的对象
	抽象类：因为抽象类本身不能实例化  所以它需要的其实是子类（具体类）通过多态实现
*/
abstract class Person{
	public abstract void study();
}
class PersonDemo{
	public void method(Person p){// p p=new Student  Person p=new Student()
		p.study();	//目前是没有办法实现的，因为抽象类没有对应的具体类
		           //那么我们应该先定义一个具体类
	}
}
class Student extends Person{
	public void study(){
		System.out.println("hoahaoxuexi");
	}
}
class PersonTest{
	public static void main(String[] args){
		//需求 ：使用 Persondemo中的method 方法
		//Person p=new Person();// 错误: Person是抽象的; 无法实例化
		//对
		Person p=new Student();

		PersonDemo pd=new PersonDemo();
		pd.method(p);

	}
}