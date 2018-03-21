/*
方法重写的注意事项：
	A 父类中 私有方法不能被重写
	B 子类重写父类方法时，访问权限不能更低,最好一致
	C 父类静态方法，子类也必须通过静态方法重写
		（其实这个算不上方法重写，但是现象确实如此，至于为什么算不上方法重写，多态中会讲）
	结论：子类和父类的方法修饰符，最好能一样

*/
class Father{
	//private void show(){}
/*
	public void show(){
		System.out.println("Father");
	}
*/
	void show(){
		System.out.println("Father");
	}

	//public static void method(){}
	public void method(){}
}

class Son extends Father{
	//private void show(){}
	/*
	public void show(){
		System.out.println("Son");

	}
	*/
	//默认修饰符，权限没有public大
	void show(){
		System.out.println("Son");

	}


	/*
		ExtendsDemo10.java:24: 错误: Son中的show()无法覆盖Father中的show()
        void show(){
             ^
  正在尝试分配更低的访问权限; 以前为public
1 个错误
	*/
	public static void method(){}
	/*
	ExtendsDemo10.java:47: 错误: Son中的method()无法覆盖Father中的method()
        public static void method(){}
                           ^
  覆盖的方法为 static
1 个错误


	*/
	//public void method(){}
}

class ExtendsDemo10{
	public static void main(String[] args){
		Son s=new Son();
		//private  可以在Son中访问 show 方法
		s.show();
		/*
		ExtendsDemo10.java:49: 错误: Son中的method()无法覆盖Father中的method()
        public void method(){}
                    ^
  被覆盖的方法为static
1 个错误
		*/

	}
}