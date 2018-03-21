/*
继承的注意事项：
		A 子类只能继承父类非私有的成员（成员变量，成员方法）
				

*/
class Father{
	private int num=10;
	public int num2=20;
	// 私有方法，子类不能继承
	private void method(){
		System.out.println(num);
		System.out.println(num2);
	}
	public void show(){
		System.out.println(num);
		System.out.println(num2);

	}

}
class Son extends Father{
	public void function(){
		//子类不能继承父类的私有成员变量
		//System.out.println(num);
		/*
			E:\ZHANFSUTING\javacode\day8>javac -encoding utf8 ExtendsDemo3.java
ExtendsDemo3.java:24: 错误: num可以在Father中访问private
                System.out.println(num);
                                   ^
		*/
		System.out.println(num2);
	}

}
class ExtendsDemo3{
	public static void main(String[] args){
		Son s=new Son();
		// method 为 父类的私有方法，子类并不能继承
		//s.method();
		/*
			E:\ZHANFSUTING\javacode\day8>javac -encoding utf8 ExtendsDemo3.jav
ExtendsDemo3.java:27: 错误: 找不到符号
                s.method();
                 ^
  符号:   方法 method()
  位置: 类型为Son的变量 s
1 个错误

		*/
		s.show();
		s.function();


	}
}
