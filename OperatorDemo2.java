/*

*/
class OperatorDemo2 {
	public static void main(String[] args){
		int a=10;
		int b=10;
		int c=10;
		a=b++;// 首先，b=10的值先赋给a ，然后。自增加1，此时b=11
		//a=10,b=11,c=10
		c=--a;//首先，a自减1，a=9，然后将a=9的值赋给c 。此时c=9
		//c=9.a=9,b=11
		b=++a;//首先，a自增加1，a=10，然后把a=10 的值赋给b ,此时b=10
		//a=10,b=10,c=9
		a=c--;//先把从c=9的值赋给a。然后，c自减1.此时，c=8
		//a=9,c=8.b=10
		System.out.println("a:"+a);//a=9
		System.out.println("b:"+b);//b=10
		System.out.println("c:"+c);//c=8
		System.out.println("--------------");


		int x=4;
		int y=(x++)+(++x)+(x*10);//首先,参与运算的是x=4，
		// 然后，x自增加1，x=5，
		// 然后，x自增加1，x=6,y=4+6=10
		//然后,x*10=60,x=6,y=10+60=70



			System.out.println("x:"+x);//x=6
			System.out.println("y:"+y);//y=70  



			/*  + 的几种用法
			A:加号
			B:正号
			C:字符串的连接符
			*/
			// 正号
			System.out.println(+19);
			//字符串的连接符
			System.out.println ("a:"+a+",b:"+b);
			System.out.println("hello"+'a'+1);
			System.out.println('a'+1+"hello");
		
	}

}