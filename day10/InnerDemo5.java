/*

局部内部类

*/
class Outer{
	private int num=10;
	public void method(){
		//定义局部变量
		int num2=53;//编译时，会隐式的添加一个final修饰符  1.8 版本以后 


		class Inner{
			public void show(){
				num=90;
				//局部内部类可以直接访问外部类成员
				System.out.println(num);
				//局部内部类访问局部变量
				//num2=89;//错误: 从内部类引用的本地变量必须是最终变量或实际上的最终变量
				System.out.println(num2);

			}
		}
		System.out.println(num2);
		Inner i=new Inner();
		i.show();

	}
}
class InnerDemo5{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();
		

	}
}