/*
多态的弊端：
	不能使用子类的特有功能

如果，必须使用子类的特有功能，方法如下：
	A:创建子类方法，调用方法即可(可以，但是很多时候不合理。而且太占内存)
	B: 把父类的引用 强制 转换成子类的引用   （向下转型）

	对象间的转型问题：
		向上转型：
		Fu f=new Zi();
		向下转型：
		Zi z=(zi) f;//要求该f 必须是能够转换为zi 的









*/
class Fu{
	public void show(){
		System.out.println("Show fu");
	}

}

class Zi extends Fu{
	public void show(){
		System.out.println("show zi");
	}
	public void method(){
		System.out.println("method zi");
	}

}
class PolymDemo3{
	public static void main(String[] args){
		Fu f=new Zi();
		f.show();
		/*
		//f.method();// 错误: 找不到符号
		Zi z=new Zi();
		z.show();
		z.method();
		*/
		//如果能把子类的对象赋值给父亲，那么，能否把父的引用赋值给子的引用呢？
		//Zi z=f;// 错误: 不兼容的类型: Fu无法转换为Zi
		//强制转换
		Zi z=(Zi) f;
		z.show();
		z.method();

	}
}