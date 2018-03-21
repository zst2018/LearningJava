/*
看程序写结果
要求在控制台输出  helloWord

*/
interface Inter{
	void show();
	//public abstract void show();默认
}   

//补齐代码
class Outer{
	public  static Inter method(){
		//子类对象    子类匿名对象 

		return new Inter(){
			public void show(){
				System.out.println("hfieow");
			}

		};
	}

}
class Innertest{
	public static void main(String[] args){
		Outer.method().show();// Outer.method()说明method 是静态方法,
		//并且 method 方法有返回值是 接口的实现类的对象
	}
}
