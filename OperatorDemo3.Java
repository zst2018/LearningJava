/*
赋值运算符：
基本运算符（=）
扩展运算符（+=  -=   *=   /=  %=）
+=   把左边和右边做加法，然后把值赋给左边,左边必须变量，不能是常量
-=    用左边减去右边，然后把值赋给左边
*=   把左边和右边做乘法，然后把值赋给左边
/=   用左边除以右边。然后把整数值赋给左边
%=    用左边除以右边，然后把余数赋值给左边

*/   

class OperatorDemo3{
	public static void main(String[] args){
		//定义一个变量
		//int a,b;
		//a=b=10;//把10 赋给b。再把b 赋给a
		int  a=10;
		int  b=10;
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------------------");
		int  c=10;
		//c += 20;
		//c +=b;
		//c-=2;
		//c-=20;
		//c *=20;
		//c /=4;
		c %= 3;
		System.out.println(c);
		System.out.println("*******************");
		//short  s=1,s=s+1;   s 是short 类型的，1 默认是int类型，1+s 是int类型的，赋值给short类型的s 。有可能损失精度
		short s=1;
		s+=1;    //扩展的赋值运算符，其实隐含了一个强制转换
		//s += 1; 不是等价于  s += s+1;而是等价于  s =(s的数据类型)（s+1）;  
		System.out.println(s);

	}
}