/*
定义一个类
姓名和年龄都是变化的，这个我可以接受，因为每个人的姓名和年龄是不同的，
但是，我们选取的几个人都是中国人，他们的国籍都是一样的，
一样的国籍，每次创建对象，在堆内都要开辟这样的空间，实属浪费
措施：
针对多个对象有共同的这样的成员变量值的时候，java提供了static 关键字


*/
class PersionDemo{
	String name ;
	int age;
	//国籍
	//String nationality;
	 static  String nationality;
	public PersionDemo(){};
	public PersionDemo(String name,int age){
		this.name=name;
		this.age=age;
	}
	public PersionDemo(String name,int age,String nationality){
		this.name=name;
		this.age=age;
		this.nationality=nationality;
	}
	public void show(){
		System.out.println("姓名："+name+",   年龄："+age+",  国籍："+nationality);
	}
}
class Persion{
	public static void main(String[] args){
		//PersionDemo p1=new PersionDemo("小星星",19,"中国");
		PersionDemo p1=new PersionDemo("小星星",19);
		p1.show();
		PersionDemo p2=new PersionDemo("大猩猩",18,"中国");
		p2.show();
		//PersionDemo p3=new PersionDemo("猩猩",17,"中国");
		PersionDemo p3=new PersionDemo("星星",18);
		p3.show();
		p3.nationality="美国";
		p3.show();
		p1.show();
		p2.show();
		

	}
}