/*
	继承中构造方法的关系：
		A 子类中所有的构造方法默认都会访问父类中  空 参数 的构造方法.(有参构造方法不能默认访问)

        

*/
class Father{
	public Father(){
		System.out.println("Father 的 无参构造方法");

	}
	public Father(String name){
		System.out.println("Father 的 有参构造方法");
	}

}
class Son extends Father{
	public Son(){
		System.out.println("Son 的 无参构造方法");

	}
	public Son(String name){
		System.out.println("Son 的 有参 构造方法");

	}

}
class ExtendsDemo6{
	public static void main(String[] args){
		Son s=new Son();
		System.out.println("**********");
		Son s1=new Son("bif");
		

	}
}