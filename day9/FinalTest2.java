/*
final  修饰变量的初始化时机
A :被final 修饰的变量只能赋值一次
B：在构造方法完毕前，（非静态的变量）


*/
class Demo{
	/*
	int num=10;
	final int num2=56;
	*/
	int num;
	final int num2;//默认初始化值是 0 
	public Demo(){
		num=100;
		// 基本类型的变量被final修饰后，不能再分配其他的值
		// num2=890;
		num2=67;
		//num2=78;
		//19: 错误: 可能已分配变量num2
 
	}

}
class FinalTest2{
	public static void main(String[] args){
		Demo d=new Demo();
		System.out.println(d.num);//100
		System.out.println(d.num2);


	}

}