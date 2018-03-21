/*
一个类中如果没有抽象方法，可不可以定义为抽象类？意义？
可以
意义是：不让创建对象

抽象关键字不能和哪些关键字共存
private    冲突
final      冲突
static     无意义


*/
abstract class Fu{
	//错误: 非法的修饰符组合: abstract和private
	//private abstract void show();
	//因为私有 不能被继承，即不能被重写，而抽象类则强制抽象方法被重写
	//final abstract void show();
	//static abstract void show();
	/*
	static 修饰方法不需要创建对象 可以被类直接调用  
	假如抽象类是FU.class 则Fu.show()
	但是。show方法没有方法体，所以调用无意义
	
	*/

}
class Zi extends Fu{
	public void show(){
		System.out.println("hui");
	}

}
class AbstractDemo3{
	public static void main(String[] args){
		Fu.show();

	}
}