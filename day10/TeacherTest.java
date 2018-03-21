/*
形式参数
	基本数据类型
	引用类型（类，抽象类，接口）
	类：需要的是类的对象
	抽象类：因为抽象类本身不能实例化  所以它需要的其实是子类（具体类）通过多态实现
	接口：一个方法如果需要接口名称，实现上是需要的该接口的实现类对象

*/
//定义一个爱好接口
interface Love{
	public abstract void love();
}
//在LoveDemo 类中定义method方法，传递形式参数（Love i）
class LoveDemo{
	public void method(Love i){//这里其实要的是接口love 的对象,love i=new loveImpl();
		//因为接口不能实例化，所以通过其实现子类对其实例化
		i.love();
	}
} 
//实现接口的子类
class LoveImpl implements Love{
	//实现 接口中的love ，
	public void love(){
		System.out.println("你好");
	}
}

class TeacherTest{
	public static void main(String[] args){
		//需求：测试loveDEmo中的method方法
		Love i=new LoveImpl();
		LoveDemo ld=new LoveDemo();
		ld.method(i);	
	}
}