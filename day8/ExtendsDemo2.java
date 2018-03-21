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
class Father extends GrandFather{};
class Son  extends  Father{}; 
class ExtendsDemo2{
	public static void main(String[] args){
		Son s=new Son();
		s.show();

	}
}