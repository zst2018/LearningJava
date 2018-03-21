/*
如果父类没有无参构造方法，那么子类的构造方法会出现什么现象？
		
		
		正常情况下，为了避免上述情况的发生，我们会自己写上无参的构造方法
	解决办法：
	A： 在父类中加一个无参构造方法
	B：子类通过 super 去显示调用父类其他的带参的构造方法
	C：子类通过 this 去调用本类的其他构造方法

		子类中一定要有一个去访问了父类的构造方法。否则父类数据就没有初始化

		注意事项：
			this 和 super 调用构造的时候，一定要出现在第一条语句上
				因为：this 或者super 如果在其他位置。构造方法中，默认第一句是super 或 this语句，对父类进行初始化，
					  然后执行到super 或者 this 语句的时候，又要对父类进行初始化，就会出现多次初始化的情况。


*/
class Father{
	public Father(){};
	//自己加上无参构造方法
	//子类中默认访问父类中无参的构造方法
	public Father(String name){
		System.out.println("father 的带参构造方法");

	}

}
class Son extends Father{
	public Son(){
		super("hfiowe ");
		// super  访问父类的构造方法

		System.out.println("Son 的无参构造方法");
	}
	public Son(String name){
		//super("  viuerwy ");
		this();
		System.out.println("Son 的带参构造方法");
	}

}
class ExtendsDemo7{
	public static void main(String[] args){
		Son s=new Son();
		System.out.println("*************");
		Son s1=new Son("niueurto");

	}
} 
  
