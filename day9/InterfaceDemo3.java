/*

类与类
	继承关系，只能单继承，可以多层继承
类与接口
	实现关系,可以单实现，也可以多实现，并且可以在继承一个类的同事，实现多个接口
接口与接口
	继承关系,可以单继承也可以多继承
	

*/
interface Father{
	public abstract void show();

}
interface Mather{
	public abstract void show2();

}
interface Sister extends Father,Mather{

}
class Son implements Father{
	public void show(){
		System.out.println("jieh");
	}

}
//接口可以多实现
class Son1 implements Father,Mather{
	public void show(){
		System.out.println("hit");
	}
	public void show2(){
		System.out.println("jir");
	}

}
//接口可以早=继承一个类的同时，实现多各接口
class Son2 extends Object implements Father,Mather{
	public void show(){
		System.out.println("her");
	}
	public void show2(){
		System.out.println("hu4t");
	}

}

class InterfaceDemo3{
	public static void main(String[] args){
		Father f=new Son();
		f.show();
		//f.show2();
		Matner m=Son();
		m.show2();
		//m.show();

	}
}