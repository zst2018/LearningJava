/*
返回值类型
基本数据类型
引用类型
类	：如果一个方法的返回值类型是一个类名。实际上是返回的该类的对象
抽象类 ：实际上返回的是该抽象类子类的对象
接口： 实际上返回的是 该接口的实现类的 对象 
*/
interface Love{
	public abstract void love();
}
class LoveDemo{
	public Love getLove(){
		//通过接口的实现类，对接口对象进行实例化
		Love l=new LoveImpl();
		return l;

	}
}
class LoveImpl implements Love{
	public void love(){
		System.out.println("nihoa ");
	}
}
class TeacherTest2{
	public static void main(String[] args){
		//通过LoveDemo 调用love 方法
		LoveDemo ld=new LoveDemo();
		ld.getLove().love();//new LoveImpl .love()   相当于：Love ii =new LoveImpl();li.love()

	}
}