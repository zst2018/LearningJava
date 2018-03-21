/*
看程序写结果
	A: 成员变量   就近原则
	B：this 和 super 的区别 
		this 访问 本类 成员
		super 访问 父类 成员
	C：子类构造方法执行前默认先执行父类的无参构造方法
	D：一个类的初始化过程
		成员变量进行初始化
			默认初始化
			显示初始化
			构造方法初始化

*/
//父类
class Fu{
	//父类的成员变量     先默认 对变量进行初始化
	public int num=10; 
	//无参构造方法
	public Fu(){
		System.out.println("fu");
	}
}
//zi 类继承父类
class Zi extends Fu{
	//子类的成员变量
	public int num=20;
	//子类的无参构造方法
	public Zi(){
		System.out.println("zi");
	}
	//子类的show 方法
	public void show(){
		// 方法内的局部变量
		int num=30;
		//输出变量 num
		System.out.println(num);
		//同过 this 关键字 访问 本类的 成员变量
		System.out.println(this.num);
		// 通过 super 关键字  访问  父类的  成员变量
		System.out.println(super.num);
	}
}
//测试类
class ExtendsTest{
	public static void main(String[] args){
		//创建子类的对象
		Zi z=new Zi();
		//通过对象调用 show 方法
		z.show();
	}
}


//看程序写结果
/*
fu      子类加载的时候，默认访问 构造方法，因为子类继承了父类，
		所以子类加载的时候首先访问父类的构造方法。然后访问子类的构造犯法
zi
30  通过对象 访问子类的show 方法。输出的  变量 num 首相在局部变量中查找   输出 30 
20   通过 this 关键字   方法本类的 成员变量
10		通过 super 关键字 访问 父类  的成员变量






*/