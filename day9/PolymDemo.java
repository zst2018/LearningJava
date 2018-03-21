/*
多态的前提 (polymorphic)
	有继承关系
	有方法重写(其实没有也是可以的，但是没有这个就没有意义)

	动物 d=new 猫()
	d.show()
	动物 d=new 狗()
	d.show()

	有父类引用指向子类对象
		父 f=new  子()
		动态中的成员访问特点

		A：成员变量
			编译看左边。运行看左边

		B: 构造方法 
			创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
		C：成员方法
			编译看左边  ，运行看右边
		D：静态方法
			编译看左边，运行看左边
			（静态是和类相关的，算不上重写，所以，访问的还是左边的）


*/
class Fu{
	public int num=100;

	public void show(){
		System.out.println("fu");

	}
	public static void  function(){
		System.out.println("fu function");
	}


}
class Zi extends Fu{
		public int num2=12;
	    public int num=67;

	public void show(){
		System.out.println("zi");

	}
	public void  method(){
		System.out.println("method zi");
	}
	public static void  function(){
		System.out.println("zi function");
	}



}

class PloymDemo{

	public static void main(String[] args){
		Fu f=new Zi();
		System.out.println(f.num);//100   父类中的 num  值

		//System.out.println(f.num2);//: 错误: 找不到符号

		f.show();// zi 

		//f.method();// 错误: 找不到符号   
		//符号:   方法 method()
  		//位置: 类型为Fu的变量 f
  		f.function();//fu  function

	}

}