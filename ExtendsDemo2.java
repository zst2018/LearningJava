/*
			java 中的继承特点
				A 在java中只支持单继承，不支持多继承
				   在有些语言中，是支持多继承的，格式是   extends  类1，类2，。。

 




     

*/
/*
// java 中不支持多继承
class Father{}
class Mother{}
class Son extends Father,Mother{}
//ExtendsDemo2.java:11: 错误: 需要'{'
//class Son extends Father,Mother{}
                        ^
//1 个错误
*/
class GrandFather{
	public void show(){
		System.out.println("我是爷爷");
	}
}    
//父亲继承爷爷的                
class Father extends GrandFather{
	public void method(){
		System.out.println("我是爸爸");
	}
}
//儿子继承父亲的
class Son  extends  Father{}; 
class ExtendsDemo2{
	public static void main(String[] args){
		Son s=new Son();
		s.show();//使用爷爷的
		//这说明，儿子不但继承了父亲的，还继承了爷爷的，这就是多层继承
		s.method();//使用父亲的


	}
}