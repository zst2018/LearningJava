/*

方法重写：子类中出现了和父类中方法声明一模一样的方法（包括方法名，参数列表，返回值类型都一样）

方法重载：本类中出现方法名相同，但是参数列表不同的方法，与返回值无关
				如果方法名相同，最终使用的是子类自己的
	子类对象调用方法的时候
		先找子类本身，再找父类
方法重写的应用：
		当子类需要父类的功能，而功能主体子类有自己特有的功能时，可以重写父类中的方法，这样就即
案例：
	A：定义一个手机类
	B：通过研究，我发明了一个新手机，这个手机的作用是在打完电话后，可以他那个天气预报
		按照我们基本设计，我们把代码给写出来
		但是呢？我们又发现新手机应该是手机，所以，它应嘎继承自手机
		其实这个时候的设计并不是最好的，因为打电话的功能是手机最基本的功能，
		所以新手机可以不提供这样的功能
		但是，这个时候打电话的功能就没有了
		最终还得加上打电话的功能，由于他继承了手机类，所以。我们就直接使用父类的功能即可。
		那么，如何使用父类的功能呢？通过super关键字


*/
class Phone{
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}

}
class NewPhone extends Phone{
	
	public void call(String name){
		//System.out.println("给"+name+"打电话");
		super.call(name);
		System.out.println("可以播放天气预报了");
	}
	
}

class ExtendsDemo9{
	public static void main(String[] args){
		NewPhone np=new NewPhone();
		np.call("xaio xingxing ");

	}

}