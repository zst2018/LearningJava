//运算符：
/*
就是对常量和变量进行操作的额运算符
算术运算符：+，-，*,/,%,++,--
注意事项：
A:整数相除只能得到整数，如果想得到小数，必须把数据变化为浮点数类型
B:/获取的是除法操作的商，% 获取的是除法操作的余数
*/
class OperatorDemo{
	public static void main(String[] args){
		int x=3;
		int y=4;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);//整数相除，只能得到整数
		//只需要把操作的数据中任意的一个数据变为浮点数
		System.out.println(x*1.0/y);
		System.out.println(x%y);//得到的是余数
		//++  -- 运算符的使用
		//System.out.println(x++y);
		//System.out.println(x--y);
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		//字符串的拼接
		System.out.println("x:"+x+",y:"+y);//输出x:3,y:4
		//单独使用
		//x++;
		++x;
		System.out.println(x);
		//y--;
		--y;
		System.out.println(y);

		//System.out.println(10++);运算对象只能是变量
		//System.out.println(10--);常量不参与这样的运算，因为常量是不可变的
		System.out.println("--------------------");
		// 参与运算使用
		int a=3;
		int b=4;

		int c=a++;// a=3 的值先赋给C，然后a再自增加1，此时a=4
		int d=b--;//b=4的值先赋给d，d=4,然后b自减1，此时b=3；
		int e=++a;//a 先自增加1，此时a=5，然后把a=5 的值赋给e,e=5
		int f=--b;//b先自减1，此时b=2,然后把b=2的值赋给f ,f=2
		System.out.println("a:"+a);//5
		System.out.println("b:"+b);//2
		System.out.println("c:"+c);//3
		System.out.println("d:"+d);//4
		System.out.println("e:"+e);//5
		System.out.println("f:"+f); //2

	}
}