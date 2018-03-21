/*
看程序写结果
	A 成员变量
		int a=10;//基本类型的成员变量
		Student s=new Student();//引用类型的成员变量
	B：一个类的初始化过程
		成员变量的初始化
			默认初始化
			显示初始化
			构造方法初始化
	C 子 父类的初始化（分层初始化）
		先进行父类的初始化，然后再进行子类的初始化
问题:
	虽然子类中构造方法默认有一个super（）
	初始化的时候，不是按照那个顺序进行的
	而是按照分层初始化的
	他它仅仅表示初始化父类的数据，再初始化子类数据



*/
class X{
	Y b=new Y();
	X(){
		System.out.println("x");
	}

}
class Y{
	Y(){
		System.out.println("y");
	}
}
class Z extends X {
	Y y=new Y();
	Z(){
		//super();
		System.out.println("z");
	}
	public static void main(String[] args){
		new Z(); 
	}
}

/*
先找main方法。找到Z的构造方法的调用
Z继承了X类。先加载X类。成员变量初始化，调用Y的构造方法。加载Y类，执行Y 的无参构造方法，输出Y
然后执行X的无参构造方法，输出X
再然后对Z类进行初始化，调用Y的构造方法，输出Y
调用本类的构造方法，输出Z 
结果是：   
Y
X
Y
Z


*/