/*
static  关键字的注意事项
		A: 在静态方法中是没有this 关键字的
			如何理解呢？
			因为静态是随着类的加载而加载。this是随着对象的创建而存在。
			静态比对象先存在，先存在的的东西并不能去访问后存在的东西。
		B:静态方法只能访问静态的成员变量或者静态的成员方法
			静态方法：
					成员变量：只能访问静态变量、
					成员方法
			非静态方法：
					成员变量：可以是静态的，也可以不是静态的
					成员方法：

*/
class TeacherDemo{
	public int num=10;
	public static int num1=20;
	public void show(){
		System.out.println(num);//这里隐含的是，访问的num就是成员变量；
		System.out.println(this.num);//明确的指出，访问的num就是成员变量；
		//以上两个在该方法中是等价的
		System.out.println(num1);
		//非静态的方法。可以调用非静态的方法。也可以调用静态方法
		function();
		function2();
	}
	public static void method(){
		//System.out.println(num);//错误提示，无法从静态的上下文中引用非静态变量
		System.out.println(num1);
		//function();//静态的方法不能调用非静态的方法
		function2();

	}
	//非静态方法
	public void function(){};
	//静态方法
	public static void function2(){};

}
class Teacher{
	public static void main(String[] args){
		TeacherDemo t=new TeacherDemo();
		t.show();
		System.out.println("~~~~~~~~~~");
		t.method();

	}
}
