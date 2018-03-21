/*
	问题是：不仅要输出子类中成员方法的局部变量 num  还要输出 本类中 的成员变量num    
		方法是： 用  this  关键字
	问题2： 如何再输出 父 类中的 成员变量  num  
		方法是：  super 关键字
	this  和  super的区别
		


*/
class Father{
	public int num=10;

}
class Son extends Father{
	public int num=20;
	public void show(){
		int num=34;
		System.out.println(num);
		//使用 this  关键字  表示正在执行的当前类
		System.out.println(this.num);
		// 使用 super 关键字  访问父类中的数据
		System.out.println(super.num);
	}

}
class ExtendsDemo5{
	public static void main(String[] args){
		Son s=new Son();
		s.show();
		/*
		Father f =new Father();
		System.out.println(f.num);
		*/
	}

}
