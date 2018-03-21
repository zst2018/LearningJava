/*
构造方法:
		给对象的数据进行初始化
		()
		构造方法的注意事项：
		A：如果我们没有给出构造方法，系统将自动提供一个无参构造方法
		B:如果我们给出了构造方法(不管是有参还是无参)，系统将不再提供默认的无参构造方法
		这个时候如果我们还想使用无参构造方法，就必须自己给出，建议永远自己给出无参构造方法
		
构造方法重载：

给成员变量赋值有两种方法：
			A: getXxx
			B：构造方法

*/
/*
class Student{
	private String name;  //null
	private int age;     //0


	public Student(){    
		System.out.println("这是构造方法");
	
	}

}
class ConstructDemo{
	public static void main(String[] args){
		Student s=new Student();//Student()  是一个方法，并且是构造方法
		//System.out.println(s);//
	} 
 






}
*/
class Construct{
	private String name; 
	private int age;
	//无参数方法
	public Construct(){
		System.out.println("这是一个无参构造方法");
	}
	//带一个name 参数的方法
	public Construct(String name){
		this.name =name;

	}
	//带多个形参的方法，而且参数的类型不同
	public Construct(String n,int a){
 		this.name = n;
 		this.age = a;
 		//System.out.println(name+age);
	}   
	//创建一个带int 的方法
	public Construct(int age){
		this.age=age;
	}
	//创建一个普通的方法
	public void show(){
		System.out.println(name+"    "+age);
	}


}
class ConstructDemo{
 	public static void main(String[] args){
 		//创建第一个对象
 	  	Construct p=new Construct();
		System.out.println(p);
		System.out.println("*****************");
	//创建第二个对象
		Construct p1 = new Construct("张三",14);//这就是作用
		System.out.println(p1);
	//创建对象
	//Construct s=new Construct();
		p1.show();
	//System.out.println(s;
		System.out.println("~~~~~~~~~~~~~~~~~~");
	//创建对象
		Construct p2=new Construct("xiao");
		p2.show();
		System.out.println("$$$$$$$$$$$$$$$$$$$44");
	//创建对象
		Construct p3=new Construct(25);
		p3.show();

	}
}