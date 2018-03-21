/*
继承中代码的体现

由于继承中方法有一个现象：方法重写

所以，父类的功能，就会被子类给覆盖
有些时候我们不想让子类覆盖掉父类的功能，只能让他使用
这个时候，针对这种情况，java就提供了一个关键字  ：  final 




*/
class Fu{
	public final void show(){
		System.out.println("这里是绝密资源，任何人不能修改");
	}
}

class Zi extends Fu {
	// 错误: Zi中的show()无法覆盖Fu中的show()
	public void show(){
		System.out.println("这是待清理文件");
	}

}

class ZiDemo{
	public static void main(String[] args){
		Zi z=new Zi();
		
		z.show();
	}
}