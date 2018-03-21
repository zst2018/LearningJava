/*
private ：
		是一个权限修饰符
		可修饰成员变量和成员方法
		被其修饰的成员只能在本类中被访问

*/
class Demo{
	//int num=10;
	private int num=10;
	public void show(){ 

		System.out.println(num);
	}
	private void method(){
		System.out.println("nihoa ");
	}
	public void function(){
		method();
	}

}
class PrivateDemo{
	public static void main(String[] args){
		Demo d=new Demo();
		//System.out.println(d.num);// 当num 被private修饰时，不能在其他类中被直接访问
		d.show();
		//d.method();  [不能访问私有的成员方法]
		d.function();

	}
}