/*
fianl  可以修饰类 ： 方法  变量
特点：
	final 修饰 类的特点  该类不能被继承，一般为最底层的类
	final 修饰 方法的特点  该方法不能被重写
	final 修饰 变量的特点  该 变量不能被重新赋值，因为这个变量其实是常量



*/
//: 错误: 无法从最终Fu进行继承
//final class Fu{}
class Fu{
	// Zi中的show()无法覆盖Fu中的show()
	// public  final void show(){}
	public int num=10;

	//用final 修饰的变量
	public final int num2=20;

}


class Zi extends Fu{ 
	
	public void show(){
		num=100;//这个表示继承了父类的变量 num  。在这里表示对其进行赋值 
		int num2=278;// 这里表示 在 方法内定义了一个 num2 局部变量 ，它与父类中的 num2 数据类型和变量名相同
		//num2=389;   这个会报错， 无法为最终变量num2分配值
		System.out.println(num);
		//100
		System.out.println(super.num);
		//100
		System.out.println(num2);
		//278
		System.out.println(super.num2);
		//20
	}
	
}

class FinalDemo{
	public static void main(String[] args){
		Zi z=new Zi();
		z.show();

	}
}