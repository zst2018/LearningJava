/*
返回值类型
基本数据类型
引用类型
类	：如果一个方法的返回值类型是一个类名。实际上是返回的该类的对象
抽象类 ：实际上返回的是该抽象类子类的对象
接口：
*/
abstract class Person{
	public abstract void study();
}
class PersonDemo{
	public Person method (){

		//Person p=new Person();
		//return p;
		//person 是抽象类，不能直接进行实例化
		/*
		Person p=new Student();
		Person pp=p;

		return pp;
		*/
		//匿名对象

		return new Student();

	}
}
class Student extends Person{
	
	public void study(){
		System.out.println("haohaoxuexi ");
	}
}
class PersonTest2{
	public static void main(String[] args){
		PersonDemo pd =new PersonDemo();

		//pd.method().study();//匿名对象 new Student().study()
		Person p=pd.method();//Person p=new Student()
		p.study();



	}

}