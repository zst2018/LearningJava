/*
构造方法:
		给对象的数据进行初始化
		()


*/
   

class Student{
	//定义成员变量
	private String name;  //null
	private int age;     //0


    Student(){
		System.out.println("这是构造方法");
	}
}

class ConstructDemo{

	public static void main(String[] args){
		Student s=new Student();//Student()  是一个方法，并且是构造方法
		System.out.println(s);
	} 


}