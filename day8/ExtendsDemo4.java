/*
类的组成
	成员变量
	构造按方法
	成员方法
类中各个组成部分的关系：





*/
//父类 father
class Father{
	public int num=89;
	public int num2=34;
}
//子类 Son
class Son extends Father {
	//定义一个和父类中不同名称的成员变量
	public int num3=67;
	//定义一个和父类中相同名称的成员变量
	public int num=56;

	public void show(){
		//在方法中定义一个局部变量
		int num=45;
		System.out.println(num);
		System.out.println(num3);
		System.out.println(num2);
		
	}
	

}
class ExtendsDemo4{
	public static void main(String[] args){
		Son s=new Son();
		s.show();

	}
}