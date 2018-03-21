/*
看程序写结果
	A：一个类的 静态代码块  构造代码块  构造方法
		静态代码块> 构造代码块>构造方法
	B：静态的内容是随着类的加载而加载
		静态代码块的内容会有限执行
	C 子类初始化之前会先进行父类的初始化





*/
class Fu{
	// 静态 代码块 只执行一次
	static {
		System.out.println("静态代码块fu");
	}

//构造代码块  每次电泳构造方法都执行
	{
		System.out.println("构造代码块 fu");
	}
	public Fu(){
		System.out.println("构造方法 fu ");
	}
}

class Zi extends Fu {
	static {
		System.out.prinltn("静态代码块 zi");
	}
	{
		System.out.prinltn("构造代码块 zi");
	}
	public Zi(){
		System.out.println("构造方法  zi");
	}

} 

class ExtendsTest2{
	public static void main(String[] args){
		Zi z=new Zi();//调用构造方法

	}
}

/*
加载子类，因为子类继承了父类，所以在加载子类前先加载父类 
	 加载父类时，执行 静态代码块  然后加载子类 执行 子类的讲台代码块
	然后调用构造方法，首先调用父类的构造方法 ，执行 构造代码块 然后是构造方法块
	然后调用子类的构造方法，执行子类的构造代码块 和 构造方法块

*/
静态代码块 fu 
静态代码块 zi 
构造代码块 fu 
构造方法块 fu 

构造代码块 zi 
构造方法块 zi 
